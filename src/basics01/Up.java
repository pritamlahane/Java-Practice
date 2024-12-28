package basics01;

public class Up {

	public static void main(String[] args) {
		String input = "ThisIsAStringWithCapitalLetters";
        String separated = separateWords(input);
        System.out.println(separated);
			
	}
//	 public static String separateWords(String input) {
//	        StringBuilder separated = new StringBuilder();
//	        for (int i = 0; i < input.length(); i++) {
//	            char currentChar = input.charAt(i);
//	            if (Character.isUpperCase(currentChar)) {
//	                separated.append(" ");
//	            }
//	            separated.append(currentChar);
//	        }
//	        return separated.toString().trim(); // Trim any leading/trailing spaces
//	    }

	public static String separateWords(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		StringBuilder separated = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isUpperCase(currentChar) && i > 0) {
				separated.append(" ");
			}
			separated.append(currentChar);
		}
		return separated.toString();

//		separated.toString() is used to convert the StringBuilder object separated
//		into a String object, which can then be returned by the method.
//		If we didn't use toString() and tried to return separated directly,
//		we would get a compilation error because the method is declared to return a String, not a StringBuilder.
//
	}


//	String string = "IAmPritam.";
//	char str2[] = string.toCharArray();
//
//		for(int i = 0; i<str2.length;i++) {
//
//		if( str2[i]>= 'A' && str2[i]<='Z') {
//
//
//			if(i == 0) {
//				System.out.print(str2[i]);
//				continue;
//			}
//			System.out.print(" ");
//		}
//		System.out.print(str2[i]);
//	}




}
