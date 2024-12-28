package basics01;

public class UP2 {

	public static void main(String[] args) {
		String string = "IAmPritam.";
		char str2[] = string.toCharArray();
		
		for(int i = 0; i<str2.length;i++) {
			
			if( str2[i]>= 'A' && str2[i]<='Z') {
				
			
				if(i == 0) {
				System.out.print(str2[i]);
					continue;
				}
				System.out.print(" ");		
			}
			System.out.print(str2[i]);	
		}
		
		

	}

}
