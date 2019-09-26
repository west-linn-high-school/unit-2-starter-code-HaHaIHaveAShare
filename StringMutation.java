import java.util.*;


/**
 * Play with Strings
 *
 * @author Joseph
 * @version 1.0 xtreme edition
 */
public class StringMutation  {
    public static void main(String[] args)  {

        String phrase= new String("Change is inevitable");

	String mut1, mut2, mut3, mut4;
	System.out.println(phrase);
	int phraseLength = phrase.length();
	System.out.printf("Length of phrase = %d\n", phraseLength);
	mut1 = phrase + ", except from vending machines";
	System.out.printf("%s\nLength of mut1 = %d\n", mut1, mut1.length());
	mut2 = mut1.toUpperCase();
	System.out.printf("%s\nLength of mut2 = %d\n", mut2, mut2.length());
	mut3 = mut2.replace('E', 'X');
	System.out.printf("%s\nLength of mut3 = %d\n", mut3, mut3.length());
	mut4 = mut3.substring(mut3.indexOf("N"), mut3.indexOf("F") + 1); // Wasn't sure if this was supposed to end on the F or before it
	System.out.printf("%s\nLength of mut4 = %d\n", mut4, mut4.length());
    }
}
