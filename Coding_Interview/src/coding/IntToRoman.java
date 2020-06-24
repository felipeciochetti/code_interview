package coding;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

	public IntToRoman() {
		// TODO Auto-generated constructor stub
	}
	public String MaxChar(String str){

		Map<String,Integer> map = new HashMap<String, Integer>();

		for (String c : str.split("")) {
			int value = 1;	
			if(map.containsKey(c)){
				value = map.get(c) + 1;
			}
			
			map.put(c, value);
			
		}
		int most = 0;
		String mostLetter = "";
		for(String key : map.keySet()){
			if(map.get(key) > most){
				most = new Integer(map.get(key));
				mostLetter = key;
			}
		}
		
		return mostLetter+":"+most;
	}


	public int reverseInt(Integer number){
		String reverse = "";
		int numberRet = 0;


		int negPos = (int) Math.signum(number);

		if(number < 0){
			number = number * -1;
		}

		String arrStr[] = number.toString().split("");


		for (int i = 0; i < arrStr.length; i++) {
			reverse = arrStr[i] + reverse;
		}

		numberRet = new Integer(reverse);


		if(negPos < 0){
			numberRet = numberRet * -1;
		}


		return numberRet;
	}
	public String reverse(String str){
		String reverse = "";

		String arrStr[] = str.split("");


		for (int i = 0; i < arrStr.length; i++) {
			reverse = arrStr[i] + reverse;
		}
		return reverse;
	}


	private static final String[] numerals = 
			new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", 
					"V", "IV", "I"};
	private static final int[] values =
			new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	public static String integerToRoman(int value) {
		// We are only considering the range for standard roman numerals
		if (value > 3999 || value < 1) throw new IllegalArgumentException();

		StringBuilder numeral = new StringBuilder();
		int i = 0;
		// Greedily append the largest numeral possible until the value is 0
		while (value > 0) {
			if (value - values[i] >= 0) {
				numeral.append(numerals[i]);
				value -= values[i];
			} else {
				i++;
			}
		}
		return numeral.toString();
	}

	public String TESintegerToRoman(Integer number){
		String strRoman = "";
		String strNumber = number.toString();

		for (int i = 0; i < strNumber.length(); i++) {


			int  digit =  new Integer( strNumber.substring(i,i+1));


			if(i == 0 && strNumber.length() > 1){
				if(digit >= 0  && digit <= 3){
					for (int j = 1; j <= digit; j++) {
						strRoman += "X";
					}
				}else if(digit == 4  ){
					strRoman += "XL";
				}else if(digit == 5  ){
					strRoman += "L";
				}else if(digit >= 6  && digit <= 8){
					strRoman += "L";
					for (int j = 1; j <= digit; j++) {
						strRoman += "X";
					}
				}else{
					strRoman += "XC";
				}
			}

			if(i == 1 ||  strNumber.length()  == 1 ){
				if(digit >= 0  && digit <= 3){
					for (int j = 1; j <= digit; j++) {
						strRoman += "I";
					}
				}else if(digit == 4  ){
					strRoman += "IV";
				}else if(digit == 5  ){
					strRoman += "V";
				}else if(digit >= 6  && digit <= 8){
					strRoman += "V";
					for (int j = 1; j <= digit; j++) {
						strRoman += "I";
					}
				}else{
					strRoman += "IX";
				}
			}

		}


		return strRoman;


	}

	public static class Item {
		int weight;
		int value;

		public Item(int weight, int value) {
			this.weight = weight;
			this.value = value;
		}
	}

	public double media(int[] array_one,int[] array_two){
		int divide = array_one.length + array_two.length; 
		double result = 0;	
		for (int i : array_one) {
			result += i;
		}
		for (int i : array_two) {
			result += i;
		}

		return result / divide;

	}

}
