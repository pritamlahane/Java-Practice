package loops02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(n + "X" +i+ "=" + n*i );
		}
		
	}

}
