package com.fundamentals.java;

import java.util.*;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.BikeInterface.Color;
import com.designpatterns.base.DownhillBike;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.RoadBike;
import com.designpatterns.creational.AbstractBikeFactory;
import com.designpatterns.creational.BikeBuilder;
import com.designpatterns.creational.BikeDirector;
import com.designpatterns.creational.BikeFrameInterface;
import com.designpatterns.creational.BikeSeatInterface;
import com.designpatterns.creational.RoadBikeBuilder;
import com.designpatterns.creational.RoadBikeDirector;
import com.designpatterns.creational.RoadBikeFactory;
import com.designpatterns.creational.SerialNumberGenerator;
import com.designpatterns.structural.BikeFacade;
import com.designpatterns.structural.CustomGrips;
import com.designpatterns.structural.GoldFrameBike;
import com.designpatterns.structural.UltraWheel;
import com.designpatterns.structural.UltraWheelAdapter;
import com.fundamentals.data.*;
import com.fundamentals.data.HolidayDinner;
import com.fundamentals.data.Apple;
import com.designpatterns.base.TouringBike;
import com.designpatterns.base.WheelInterface;

/*
*public - Access Modifier
*class - file type
WelcomeToJava - Name of class
*/

enum iceCream {
	Vanilla, Chocolate, Strawberry, Carmel;
}

public class WelcomeToJava {

	public static final int MY_VALUE = 10;
	public static int MY_OTHER_VALUE;

	static {
		MY_OTHER_VALUE = 25;
		int total = MY_VALUE * MY_OTHER_VALUE; // Total should be 250
		System.out.println(total);
	}

	public static void main(String[] args) {
		// creationalPatterns();
		// adapterPatterns();
		// decoratorPattern();
		facadePattern();
	}
		
		
	public static void fundamentalExamples() {
		MY_OTHER_VALUE = 35;
		// TODO Auto-generated method stub
		// someMethod();
		// stringExamples();
		// moreStringExamples();
		// scannerExample();
		// myOperatorExample();
		// myAssignmentExample();
		// myDecisionExample();
		// mySongExamples();
		// quiz1();
		// inheritanceExample();
		// overloadExample();
		// overrideExample();
		// sampleUtility();
		// something(); // Can not run in a static method
		// myAbstractExample
		// myInterfaceExample();
		// myConstructorPlusExample();
		// arrayListExamples();
		// arrayListObjectExample();
		// hashSetExamples();
		// hashMapExample() ;
		// enumSample1();
		exceptionExample();
	}
	
	public static void creationalPatterns() {
		// Abstract Factory
		// String whatToMake = "roadBike";
		AbstractBikeFactory factory = new RoadBikeFactory();
		BikeFrameInterface frame = factory.createFrame();
		BikeSeatInterface seat = factory.createBikeSeat();
		System.out.println(frame.getFrameParts());
		System.out.println(seat.getSeatParts());
		
		// Builder
		RoadBike bike = new TouringBike(new NarrowWheel(22), Color.BLACK);
		BikeBuilder builder = new RoadBikeBuilder(bike);
		BikeDirector director = new RoadBikeDirector();
		BikeInterface bikeInterface = director.build(builder);
		System.out.println(bikeInterface);
		
		// Singleton
		System.out.println("Generating Serial Numbers");
		SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
		System.out.println("next serial " + generator.getNextSerial());
		System.out.println("new serial " + generator.getNextSerial());
		System.out.println("next serial " + generator.getNextSerial());
	}
	
	public static void adapterPatterns() {
		List<WheelInterface> wheels = new ArrayList<WheelInterface>();
		UltraWheel ultraWheel = new UltraWheel(28);
		wheels.add(new NarrowWheel(24));
		wheels.add(new NarrowWheel(20));
		wheels.add(new WideWheel(24));
		wheels.add(new UltraWheelAdapter(ultraWheel));
		for (WheelInterface wheel : wheels) {
			System.out.println(wheel);
		}
	}
	
	public static void decoratorPattern() {
		BikeInterface myTourBike = new TouringBike(new NarrowWheel(24));
		System.out.println(myTourBike);
		
		myTourBike = new GoldFrameBike(myTourBike);
		System.out.println(myTourBike);
		
		myTourBike = new CustomGrips(myTourBike);
		System.out.println(myTourBike);
	}
	
	public static void facadePattern() {
		BikeFacade facade = new BikeFacade();
		facade.prepareForSale(new DownhillBike(new WideWheel(24)));
	}
	
	public static void exceptionExample() {
		ExceptionSample es = new ExceptionSample();
		// es.myException();
		// es.mySecondException();
		es.myThirdException();
	}

	public static void enumSample1() {
		iceCream ic = iceCream.Strawberry;
		System.out.println(ic);
		HolidayDinner hd = new HolidayDinner();
		hd.letsEat();
		hd.letsChoose(Dinner.Turkey);
		hd.letsChoose(Dinner.Ham);
		hd.letsChoose(Dinner.PumpkinPie);
		
		Dinner d1 = Dinner.MashedPotatoes;
		System.out.println(d1);
		d1.readyNow();
	}

	public static <E> void hashMapExample() {
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(0, "Something");
		myMap.put(1, "Something else");
		myMap.put(2, "Something");
		myMap.put(3, "One More");
		myMap.remove(2);

		for (String value : myMap.values()) {
			System.out.println(value);
		}
		Set<E> set = (Set<E>) myMap.entrySet();
		Iterator iterate = set.iterator();
		while (iterate.hasNext()) {
			Map.Entry me = (Map.Entry) iterate.next();
			System.out.println(me.getKey() + " : ");
			System.out.println(me.getValue());
		}
	}

	/*
	 * HashSet ignores duplicates and also order. If the item added is already in
	 * the collection, it will not add it, or give any indication that it won't
	 */
	public static void hashSetExamples() {
		HashSet<String> myString = new HashSet<String>();
		myString.add("something");
		myString.add("something else");
		myString.add("something");
		myString.add("something else");
		
		for(String s : myString) {
			System.out.println(s);
		}
	}

	public static void arrayListExamples() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("something");
		names.add("something else");
		names.add("something");
		names.remove(2);
		names.add("Happy");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for (String string : names) {
			System.out.println(string);
		}

		// Recommend doing it with a generic parameter instead like above
		ArrayList place = new ArrayList();
		place.add(10);
		place.add("type");
	}

	public static void myConstructorPlusExample() {
		GrannySmiths gs = new GrannySmiths();
		gs.decide();
		TRex tr = new TRex("Sharp", "Smooth");
		System.out.println("The TRex has " + tr.getSkin() + " skin and " + tr.getTeeth() + " teeth.");
	}

	public static void myInterfaceExample() {
		// House myHouse = new House();
		House mySummerHouse = new House("storm windows");
		House myLogHouse = new House("wooden windows", "wooden door");
		System.out.println(mySummerHouse.getWindows());
		System.out.println(myLogHouse.getWindows() + " " + myLogHouse.getDoors());

		Condo myCondo = new Condo("Sunny");

		// myHouse.decorate();
		// myHouse.installPlumbing();
		// myCondo.decorate();
		// myHouse.supplementWork();
	}

	public static void myAbstractExample() {
		// Can't created an instance of an Abstract class
		// Shape shape = new Shape(); // Not valid
		System.out.println(Shape.area(5, 10));
		Square square = new Square();
		System.out.println(square.draw());
		Rectangle rec = new Rectangle();
		System.out.println(rec.draw());
		rec.setLength(10);
		rec.setLength(5);
		System.out.println(Shape.area(rec.getLength(), rec.getWidth()));

		MyOctagon mo = new MyOctagon();
	}

	public void something() {
		// Will not run in a static method }
	}

	public static void sampleUtility() {
		System.out.println(Utility.addSomething(5, 23));
		Utility.somethingElse();
	}

	public static void overrideExample() {
		House myHouse = new House();
		// Condo myCondo = new Condo();
		// House myOtherhouse = new Condo();
		// myHouse.openDoor();
		// myCondo.openDoor();
		// myOtherhouse.openDoor();
	}

	public static void overloadExample() {
		Apple myApple = new Apple();
		myApple.display("Granny Smiths", 5);
		myApple.display("Sour", 3, "Red");
		// String show = myApple.display("Granny Smiths", "Green");
		System.out.println(myApple.display("Granny Smiths", "Green"));

		System.out.println(Apple.SOUR_SCALE);
		System.out.println(myApple.SOUR_SCALE);
		System.out.println(Apple.SWEET_SCALE);
		Apple.SWEET_SCALE = 25;

	}

	public static void mySongExamples() {
		SongExamples se = new SongExamples();
		String beer = se.bottlesofBeer();
		System.out.println(beer);
	}

	public static void inheritanceExample() {
		House house = new House();
		Condo condo = new Condo("something");
		condo.setDoors("Red Door");
		System.out.println(condo.getDoors());
		house.setDoors("Purple Door");
		System.out.println(house.getDoors());
	}

	public static void quiz1() {
		Quiz1 myQuiz = new Quiz1();
		// myQuiz.divisibleByThree();
		// myQuiz.grade('g')
		// myQuiz.grade('b');
		myQuiz.oddNumbers();
	}

	public static void myAssignmentExample() {
		AssignmentExample ae = new AssignmentExample();
		ae.plusEqualsExample();
		ae.minusEqualsExample();
		ae.multiplyEqualsExample();
		ae.divisionEqualsExample();
		ae.modulusEqualsExample();
		ae.leftShiftEqualsExample();
		ae.rightShiftEqualsExample();
		ae.bitwiseAndEqualsExample();
		ae.bitwiseOrEqualsExample();
	}

	public static void myDecisionExample() {
		DecisionExamples de = new DecisionExamples();
		de.basicIfStatement();
		de.chainIfStatement();
		de.switchExample(6);

		LoopingExamples le = new LoopingExamples();
		le.myWhileLoop();
		le.myDoWhileLoop();
		le.myForLoop();
		le.myBranchExample();
	}

	public static void myOperatorExample() {
		OperatorExamples oe = new OperatorExamples();
		oe.incrementSample();
		oe.decrementSample();
		oe.equalsExample();
		oe.equalsExample2();
		oe.logicalExample();
	}

	public static void someMethod() {
		// This is a single comment
		/*
		 * This is a multi-line comment
		 */
		System.out.println("Welcome to Java");

	}

	public static void stringExamples() {
		// String = Type | str1 = variable name | Welcome = string literal
		String str1 = "Welcome";
		String str2 = new String("Java");
		System.out.println(str2);
		// charAt method returns a single character at a certain position
		char j = str1.charAt(2);// index is zero based
		System.out.println(j);
		// concat method joins two strings together, called concatenation
		String name = str2.concat(" is cool");
		System.out.println(name);
		// equals method will check to see if an object equals the string variable
		boolean isMyString = str1.equals(str2); // is str2 = str1?
		System.out.println(isMyString);
		// toLowerCase method will make the variable with lower case letters
		String myString = str1.toLowerCase();
		System.out.println(myString);
		// toUpperCase method will make the variable with upper case letters
		String mySecondString = str2.toUpperCase();
		System.out.println(mySecondString);
	}

	public static void moreStringExamples() {
		String myString = "My Java String";
		// Are these equal?
		boolean isTheSame = myString.toLowerCase().equals("my java string");
		System.out.println(isTheSame);
		// myString is capitalized then added to is so capitalized
		String name = myString.toUpperCase().concat(" is so capitalized");
		System.out.println(name);
		// equalsIgnoreCase does not check if it has capitalization. It is ignored
		boolean testString = myString.equalsIgnoreCase("My java string");
		System.out.println(testString);
		// contains method checks to see if it matches part of the variable
		boolean isContained = myString.contains("ava");
		System.out.println(isContained);

	}

	public static void dataTypeExamples() {
		PrimitiveExamples pe = new PrimitiveExamples();
		pe.myFirstPrimitiveMethod();
		pe.myAddition();
		pe.mySubtraction();
		pe.myMultiplication();
		pe.myDivision();
		pe.myModulus();
		pe.myOrderOp();
	}

	// Example of the use of Scanner
	public static void scannerExample() {
		int x, y, z;
		System.out.println("Enter two integers");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers =" + z);
	}

	public static void sampleArray() {
		String[] myStringArray = { "happy", "monday", "java" };
		int[] myIntArray = new int[3];
		myIntArray[0] = 5;
		myIntArray[1] = 17;
		myIntArray[2] = 10;

		int[] mySecondIntArray = myIntArray.clone();

		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		for (int i = 0; i < mySecondIntArray.length; i++) {
			System.out.println(mySecondIntArray[i]);
		}

		int j = 0;
		while (j < myStringArray.length) {
			System.out.println(myStringArray[j]);
			j++;
		}
	}

	public static void myJaggedArray() {
		int[][] anArray = new int[3][5];

		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[0][3] = 11;
		anArray[0][4] = 13;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[1][3] = 17;
		anArray[1][4] = 19;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		anArray[2][3] = 21;
		anArray[2][4] = 23;
		System.out.println(anArray[0].length);
		for (int i = 0; i < anArray.length; i++) {
			for (int j = 0; j < anArray[i].length; j++) {
				System.out.println(anArray[i][j]);

			}
		}
	}

	public static void myTwoDimensionArray() {
		int[][] anArray = new int[3][3];

		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		// System.out.println(anArray.length); //
		for (int i = 0; i < anArray.length; i++) {
			for (int j = 0; j < anArray.length; j++) {
				System.out.println(anArray[i][j]); // 1 Prints all, 4 prints partial, 1 ?
			}
		}
	}
}
