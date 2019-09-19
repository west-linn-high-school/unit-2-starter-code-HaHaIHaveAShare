import java.util.*;
import java.math.*;

public class RandomNumbers  {

    public static void main (String [] args)  {

	Random rand = new Random();

	int num;
	double val;

	// With util.random

	System.out.println("rand.nextInt() / rand.nextDouble()");
	
	num = rand.nextInt(10);

	System.out.printf("[0, 9] = %d\n", num);

	num = rand.nextInt(10) + 1;

	System.out.printf("[1, 10] = %d\n", num);

	num = rand.nextInt(15) + 20;

	System.out.printf("[20, 34] = %d\n", num);

	num = rand.nextInt(20) - 10;

	System.out.printf("[-10, 9] = %d\n", num);

	val = rand.nextDouble();

	System.out.printf("[0, 1] = %f\n", val);

	val = rand.nextDouble() * 6;
	
	System.out.printf("[0, 6] = %f\n", val);

	// With math.random

	System.out.println("Math.random()");

	num = (int) (Math.random() * 10);

	System.out.printf("[0, 9] = %d\n", num);

	num = ((int) (Math.random() * 10)) + 1;

	System.out.printf("[1, 10] = %d\n", num);

	num = ((int) (Math.random() * 15)) + 20;

	System.out.printf("[20, 34] = %d\n", num);

	num = ((int) (Math.random() * 20)) - 10;

	System.out.printf("[-10, 9] = %d\n", num);

	val = Math.random();

	System.out.printf("[0, 1] = %f\n", val);

	val = Math.random() * 6;
	
	System.out.printf("[0, 6] = %f\n", val);
	
    }
}
