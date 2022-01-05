import java.util.Scanner;
import java.util.HashMap;

public class RomanNumerals {
	public static int sum(String s) {
		HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
		roman.put('I',1);
		roman.put('V',5);
		roman.put('X',10);
		roman.put('L',50);
		roman.put('C',100);
		roman.put('D',500);
		roman.put('M',1000);
		
		int romanToInt = roman.get(s.charAt(s.length()-1));

		for(int i = 0; i < s.length()-1; i++) {
			if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
				romanToInt -=roman.get(s.charAt(i));
			} else {
				romanToInt +=roman.get(s.charAt(i));
			}
		}
		
		return romanToInt;
}	
		
		public static void main(String[] args) {
			
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter roman numeral: ");
			String input = userInput.nextLine(); 
			
			System.out.print("Interger from Roman Numberal is "+sum(input));
			
			userInput.close();
		}
		
}