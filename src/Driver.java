import java.util.*;

public class Driver {

	static String test="";
	static String toCompare="";
	static String original="";
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Please enter the string to check: ");	
	test = kb.nextLine();	
	System.out.println(isPalin(test));
	}
	
	private static boolean isPalin(String test){
		toCompare = "";
		original = test;
		
		int StringLen = test.length();
		Stack<String> myStack = new Stack();
		
		// Push each char onto stack
		for (int i = 0; i < StringLen; i++){
			myStack.push(test.substring(0,1));
			test = test.substring(1);
		}
		
		// Pop each object onto new string 
		for (int i = 0; i < StringLen; i++){
			toCompare += myStack.pop();
		}
		
		// Compare the strings for match
		// Add formatting like toLower if case doesn't matter 
		return (original.matches(toCompare))? true:false;
		
	}
	
	
}
