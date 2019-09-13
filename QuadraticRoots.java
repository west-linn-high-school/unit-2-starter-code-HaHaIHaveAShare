import java.util.*;
import java.lang.*;

public class QuadraticRoots  {
    public static void main (String [] args)  {

	Scanner scannyboi = new Scanner(System.in);

	System.out.println("Whats you name bruh?");
	String username = scannyboi.next();
	scannyboi.nextLine();

	System.out.println("Gimmie yo coefficients.\nA = ");
	double a = scannyboi.nextDouble();
	System.out.println("B = ");
	double b = scannyboi.nextDouble();
	System.out.println("C = ");
	double c = scannyboi.nextDouble();

	System.out.printf("%f\n%f\nThanks for calculatin' my boi.\nCome again, %s!\n", ((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a), ((-1 * b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a), username);
    }
}
