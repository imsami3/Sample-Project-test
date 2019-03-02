package main;

public class SampleProject {
	//print  Hello world! in the console
	public static String printHello() {
		//print Hello world! in the console!
		String c = "";
		c= "Hello world!";
		return c;
	}
	public static int add(int a,int b) {
		int C = 0;
		C = a+b;
		return C;
	}
	public static void main(String args[]) {
		System.out.println(printHello());
		System.out.println(add(23,45));
	}
}
