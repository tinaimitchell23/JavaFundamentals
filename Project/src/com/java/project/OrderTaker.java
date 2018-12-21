package com.java.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTaker {
	private List<GadgetInterface> gadgetList;

    public void beginOrder() {
        gadgetList = new ArrayList<>();

        System.out.println("Welcome to the Wag Corporation. ");
        addToOrder();
        Receipt myReceipt = new Receipt(gadgetList);
        myReceipt.printReceipt();
    }

    private void addToOrder() {
        Scanner in = new Scanner(System.in);
        System.out.println("What type of Gadget would you like?");
        System.out.println("(L)arge, (M)edium or (S)mall");
        String valueType = in.nextLine();

        System.out.println("What Surface would you like?");
        System.out.println("1 for Plain, 2 for Painted, 3 for Bronze, 4 for Silver, or 5 for Gold");
        // Validate the number
        int valueNum = in.nextInt();
        in.nextLine();
        GadgetInterface value = validateGadgetInput(valueType,
                validateSurfaceColorInput(String.valueOf(valueNum)));

        // Add Gadget to the list
        System.out.println("Does this complete your order? Yes or No");
        String order = in.nextLine();

        if(order.equals("No") || order.equals("no")) {
            gadgetList.add(value);
            this.addToOrder();
        } else {
            gadgetList.add(value);
        }


    }

    private GadgetInterface validateGadgetInput(String value, SurfaceColor color) {
        switch (value.toUpperCase()) {
            case "L":
            case "LARGE":
                return new LargeGadget(color);
            case "M":
            case "MEDIUM":
                return new MediumGadget(color);
            case "S":
            case "SMALL":
                return new SmallGadget(color);

            default:
                return null;
        }
    }
    private SurfaceColor validateSurfaceColorInput(String value) {
        switch (value.toUpperCase()) {
            case "1":
                return SurfaceColor.PLAIN;
            case "2":
                return SurfaceColor.PAINTED;
            case "3":
                return SurfaceColor.BRONZE;
            case "4":
                return SurfaceColor.SILVER;
            case "5":
                return SurfaceColor.GOLD;
            default:
                return SurfaceColor.PLAIN;
        }
    }


}
