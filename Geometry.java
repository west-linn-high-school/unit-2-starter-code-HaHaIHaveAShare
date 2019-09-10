public class Geometry  {
    public static void main (String [] args)  {
        int sides = 7;
        int radius = 5;
        double tau = 6.28318;
        System.out.printf("A heptagon has %d sides\nA decagon has %d sides\nA dodecagon has %d sides\nThe circumfrence of a circle with a radius of %d is %f\n", sides, sides + 3, sides + 3, radius, radius * tau);
    }
}