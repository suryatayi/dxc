package exam;
import java.util.Scanner;

public class QuantitySold{
	int productNo = 0;
	double ReatailPrice1 = 22.50;
	double ReatailPrice2 = 44.50;
	double ReatailPrice3 = 9.98;
	int quantitySold = 0;
	Scanner sc =new Scanner(System.in);
	public void display() {
		System.out.println("enter productNo to purchase: ");
		productNo =sc.nextInt();
		System.out.println("enter quantity to puchase: ");
		quantitySold =sc.nextInt();
	    switch(productNo) {
	    case 1:
	    	System.out.println("your total bill is:"+(ReatailPrice1*quantitySold));
	    	break;
	    case 2:
	    	System.out.println("your total bill is:"+(ReatailPrice2*quantitySold));
	    	break;
	    case 3:
	    	System.out.println("your total bill is:"+(ReatailPrice3*quantitySold));
	    	break;
	    default :
	    	System.out.println("invalid productNo");
	    }
	}
	public static void main(String args[]) {
		QuantitySold q= new QuantitySold();
		q.display();
	}	
}
