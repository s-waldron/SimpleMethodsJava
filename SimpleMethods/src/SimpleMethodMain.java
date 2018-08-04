import java.util.*;
public class SimpleMethodMain {

	public static void main(String[] args) {
		int[] testValues = {1, 1, 1, 3, 7, 11, 7};
		int[] testValues1 = {1, 3, 3, 5, 7};
		int[] testValues2 = {-1, 0, 1};
		int[] testValues3 = {-2, -2, -1, 0, 1, 0, -1};
		Scanner keyboard = new Scanner(System.in);
		SimpleMethodTest testMethods = new SimpleMethodTest();
		ArrayList test = testMethods.nonDups(testValues);
		ArrayList test1 = testMethods.nonDups(testValues1);
		ArrayList test2 = testMethods.nonDups(testValues2);
		ArrayList test3 = testMethods.nonDups(testValues3);
		System.out.println("Orginal values of the first test int array before finding the non duplicate numbers is: ");
		for(int num: testValues) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Size of first test ArrayList is: " + test.size());
		System.out.print("Output from first test ArrayList is: ");
		for (int index = 0; index < test.size(); index++) {
			System.out.print(test.get(index) + " ");
		}
		System.out.println();
		System.out.println("Orginal values of the second test int array before finding the non duplicate numbers is: ");
		for(int num1: testValues1) {
			System.out.print(num1 + " ");
		}
		System.out.println();
		System.out.println("Size of second test ArrayList is: " + test1.size());
		System.out.print("Output from second test ArrayList is: ");
		for (int index1 = 0; index1 < test1.size(); index1++) {
			System.out.print(test1.get(index1) + " ");
		}
		System.out.println();
		System.out.println("Orginal values of the third test int array before finding the non duplicate numbers is: ");
		for(int num2: testValues2) {
			System.out.print(num2 + " ");
		}
		System.out.println();
		System.out.println("Size of third test ArrayList is: " + test2.size());
		System.out.print("Output from third test ArrayList is: ");
		for (int index2 = 0; index2 < test2.size(); index2++) {
			System.out.print(test2.get(index2) + " ");
		}
		System.out.println();
		System.out.println("Orginal values of the forth test int array before finding the non duplicate numbers is: ");
		for(int num3: testValues3) {
			System.out.print(num3 + " ");
		}
		System.out.println();
		System.out.println("Size of forth test ArrayList is: " + test3.size());
		System.out.print("Output from forth test ArrayList is: ");
		for (int index3 = 0; index3 < test3.size(); index3++) {
			System.out.print(test3.get(index3) + " ");
		}
		System.out.println();
		String testValue = "Hello World";
		String testValue1 = "mom";
		String testValue2 = "redivider";
		ArrayList test4 = testMethods.nonDupLetters(testValue);
		int test5 = testMethods.totalASCIIValue(testValue);
		System.out.println("The orginal value of the test string is: " + testValue);
		System.out.println("The output of a method to find all non-duplicated letters is: ");
		for (int index = 0; index < test4.size(); index++) {
			System.out.print(test4.get(index) + " ");
		}
		System.out.println();
		System.out.println("The output of the method to find the total ASCII value of the string " + testValue + " is: ");
		System.out.println(test5);
		System.out.println("The string " + testValue + " is a palindrome? " + testMethods.isPalindrome(testValue));
		System.out.println("The string " + testValue1 + " is a palindrome? " + testMethods.isPalindrome(testValue1));
		System.out.println("The string " + testValue2 + " is a palindrome? " + testMethods.isPalindrome(testValue2));
		System.out.println("Press the enter key to exit!!!");
		keyboard.nextLine();
	}

}
