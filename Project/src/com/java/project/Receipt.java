package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
	private float priceTotal;

	private List<GadgetInterface> gadgetList;
	private List<WidgetInterface> largeWidgetList;
	private List<WidgetInterface> mediumWidgetList;
	private List<WidgetInterface> smallWidgetList;

	Receipt(List<GadgetInterface> gadgetList) {
		this.gadgetList = new ArrayList<>();
		this.gadgetList = gadgetList;
		getWidgetList();
	}

	void printReceipt() {
		System.out.println();
		System.out.println();
		System.out.println("Wag Corporation");
		System.out.println("Thank you for your order!");
		System.out.println("*************************************");
		System.out.println();
		System.out.println("Gadget");
		printGadgets();
		System.out.println();
		printWidgets();
		System.out.println();
		printAccessories();
		System.out.println("*************************************");
		System.out.println(String.format("%-20s $%s", "Total", priceTotal));
		System.out.println();
		System.out.println("*************************************");
		System.out.println("Take survey for");
		System.out.println("Free Large Widget or");
		System.out.println("15% discount on next order!");
		System.out.println("Survey code: GFYR-SINR-IKXR");
	}

	private void getWidgetList() {
		List<WidgetInterface> widgetList = new ArrayList<>();
		largeWidgetList = new ArrayList<>();
		mediumWidgetList = new ArrayList<>();
		smallWidgetList = new ArrayList<>();

		for (GadgetInterface aGadgetList : gadgetList) {
			widgetList.addAll(aGadgetList.getWidgets(aGadgetList.getColor()));
		}
		for (int i = 0; i < widgetList.size(); i++) {
			if (widgetList.get(i).getClass().getSimpleName().equals("LargeWidget")) {
				largeWidgetList.add(widgetList.get(i));
			}
			if (widgetList.get(i).getClass().getSimpleName().equals("MediumWidget")) {
				mediumWidgetList.add(widgetList.get(i));
			}
			if (widgetList.get(i).getClass().getSimpleName().equals("SmallWidget")) {
				smallWidgetList.add(widgetList.get(i));
			}
		}
	}

	private void printGadgets() {
		for (GadgetInterface aGadgetList : gadgetList) {
			String type = aGadgetList.getClass().getSimpleName();
			String color = aGadgetList.getColor().toString();
			float price = aGadgetList.getPrice();
			priceTotal += price;
			System.out.println(String.format("%s  %-20s $%s", color, type, price));
		}
	}

	private void printWidgets() {
		System.out.println("Widgets");
		System.out.println("(" + largeWidgetList.size() + ") Large Widgets");
		System.out.println("(" + mediumWidgetList.size() + ") Medium Widgets");
		System.out.println("(" + smallWidgetList.size() + ") Small Widgets");

	}

	private void printAccessories() {
		System.out.println("Accessories");
		if (getLights() > 0) {
			System.out.println("(" + getLights() + ") Lights");
		}
		System.out.println("(" + getSwitches() + ") Switches");
		System.out.println("(" + getButtons() + ") Buttons");
		for (GadgetInterface aGadgetList : gadgetList) {
			String powersource = aGadgetList.getPowerSource();
			System.out.println(powersource);
		}
	}

	private int getLights() {
		int totalLights = 0;
		for (GadgetInterface aGadgetList : gadgetList) {
			totalLights += aGadgetList.getLights();
		}
		return totalLights;
	}

	private int getButtons() {
		int totalButtons = 0;
		for (GadgetInterface aGadgetList : gadgetList) {
			totalButtons += aGadgetList.getButtons();
		}
		return totalButtons;
	}

	private int getSwitches() {
		int totalSwitches = 0;
		for (GadgetInterface aGadgetList : gadgetList) {
			totalSwitches += aGadgetList.getSwitches();
		}
		return totalSwitches;
	}

}
