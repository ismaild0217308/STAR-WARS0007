import java.util.Scanner;
//NAMA : ISMAIL UMAR
	//NIM  : D0217308
	//KELAS: INFORMATIKA. A 2017

	public class STARWARS0007 {
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
			System.out.println("INPUT");
			int a = sc.nextInt();
			
			System.out.println("OUTPUT");
			for (int i = 0; i < a; i++) {
	            for (int k = 0; k <i+1; k++) {
	                System.out.print("X ");
	            }
	            System.out.println();
	        }
	    }
	}
