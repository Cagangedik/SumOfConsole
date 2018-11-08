import java.util.Scanner;
public class Hello {
	

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int sayi1 = 0;
		
		while (sayi != 0) {
		    sayi1 += sayi;
		    sayi = input.nextInt();
		}
		
		System.out.println(sayi1);
	}
	}
