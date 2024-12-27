package basics01;

public class Up {

	public static void main(String[] args) {
		String input = "ThisIsAStringWithCapitalLetters";
        String separated = separateWords(input);
        System.out.println(separated);
			
	}
	 public static String separateWords(String input) {
	        StringBuilder separated = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (Character.isUpperCase(currentChar)) {
	                separated.append(" ");
	            }
	            separated.append(currentChar);
	        }
	        return separated.toString().trim(); // Trim any leading/trailing spaces
	    }

}
