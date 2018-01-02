package example.plugin2.tests;

import org.junit.Test;

import example.plugin2.MyClass2;

public class MyClass2Test {

	private MyClass2 myClass = new MyClass2();

	@Test
	public void test() {
		// just to show that the argLine is set properly when
		// building with Tycho
		System.out.println("Building with Tycho? " +
				System.getProperty("buildingWithTycho", "false"));
		myClass.myMethod();
	}

}
