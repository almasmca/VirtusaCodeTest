import java.util.HashMap;

public class NTW {

	private static HashMap<Integer, String> words = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		initializeMap();
		System.out.println(NumToWords(56945781));
		System.out.println(NumToWords(0));
		System.out.println(NumToWords(-1));
		System.out.println(NumToWords(1999999999));

	}
	public static String NumToWords(Integer n) {
		Integer millions_div = 1000000;
		Integer thousands_div = 1000;
		Integer hundreds_div = 100;


		String numStr = "";

		Integer num = n;
		
		if((num > 999999999) || (num < -999999999))
			return "Out of Range.. Please Enter a number in the range [ -999999999 to 999999999 ]. Thank You.";
		
		if(num == 0)
			return words.get(num);
		
		
		if(num < 0)
			return "(minus) " + NumToWords(-1*num);
		

		if((num / millions_div) > 0) {
			numStr += NumToWords(num / millions_div) + " Million ";  
            num = num % millions_div;

		}
		
		if((num / thousands_div) > 0) {
			numStr += NumToWords(num / thousands_div) + " Thousand ";  
            num = num % thousands_div;
            
		}
		
		if((num / hundreds_div) > 0) {
			numStr += NumToWords(num / hundreds_div) + " Hundred ";  
            num = num % hundreds_div;
            
            if(num > 0)
            	numStr += "and ";
		}
		
		if(num > 0) {
			if(num < 20)
				numStr += words.get(num);
			else {
				numStr += words.get((num/10)*10)+" ";
				if(num % 10 > 0) 
					numStr += words.get(num%10);
			}
		}
		
		return numStr;
	}
	public static void initializeMap(){
		words.put(0, "Zero");
		words.put(1, "One");
		words.put(2, "Two");
		words.put(3, "Three");
		words.put(4, "Four");
		words.put(5, "Five");
		words.put(6, "Six");
		words.put(7, "Seven");
		words.put(8, "Eight");
		words.put(9, "Nine");
		words.put(10, "Ten");
		words.put(11, "Eleven");
		words.put(12, "Twelve");
		words.put(13, "Thirteen");
		words.put(14, "Fourteen");
		words.put(15, "Fifteen");
		words.put(16, "Sixteen");
		words.put(17, "Seventeen");
		words.put(18, "Eighteen");
		words.put(19, "Nineteen");
		words.put(20, "Twenty");
		words.put(30, "Thirty");
		words.put(40, "Fourty");
		words.put(50, "Fifty");
		words.put(60, "Sixty");
		words.put(70, "Seventy");
		words.put(80, "Eighty");
		words.put(90, "Ninety");
	}

}
