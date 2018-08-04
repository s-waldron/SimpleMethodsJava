import java.util.*;
public class SimpleMethodTest {
	public ArrayList nonDups(int[] values){
		ArrayList returnValues = new ArrayList();
		boolean doups = false;
		for(int outter = 0; outter < values.length; outter++) {
			doups = false;
			for(int inner = 0; inner < values.length; inner++) {
				if(inner != outter) {
					if(values[outter] == values[inner]) {
						doups = true;
					}// end if(values[outter] == values[inner]) check
				}// end if(inner != outter) check
			}// end inner for loop 
			if(!doups) {
				returnValues.add(values[outter]);
			}// end if(!doups) check
		}// end outter for loop
		return returnValues;
	}// end nonDups method 
	public ArrayList nonDupLetters (String inputString) {
		ArrayList returnValues = new ArrayList();
		boolean dups = false;
		for(int outter = 0; outter < inputString.length(); outter++) {
			dups = false;
			for(int inner = 0; inner < inputString.length(); inner++) {
				if (outter != inner) {
					if (inputString.charAt(outter) == inputString.charAt(inner)) {
						dups = true;
					}// end if (inputString.charAt(outter) == inputString.charAt(inner)) check
				}// end if (outter != inner) check
			}// end inner for loop
			if (!dups) {
				returnValues.add(inputString.charAt(outter));
			}// end if (!dups) check
		}// end outter for loop
		return returnValues;
	}// end nonDupLetters method
	public int totalASCIIValue (String inputString) {
		int total = 0;
		for (int index = 0; index < inputString.length(); index++) {
			total += (int)inputString.charAt(index);
		}// end index for loop
		return total;
	}// end totalASCIIValue method
	public boolean isPalindrome (String inputString) {
		StringBuilder reversalString = new StringBuilder(inputString);
		reversalString.reverse();
		String reverseString = reversalString.toString();
		if (inputString.equals(reverseString)) {
			return true;
		}// end if (inputString.equals(reverseString)) check
		else {
			return false;
		}// end else
	}// end isPalindrome method
	
}// end SimpleMethodTest class