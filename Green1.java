import java.util.Scanner;
/**
 * Write a description of class Green1DTL2025 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Green1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Green1DTL2025
     */
    public Green1()
    {
        // initialise instance variables
        x = 0;
    };

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int m = sin.nextInt(), n = sin.nextInt();
        sin.close();
        System.out.println((m*n)+m+n);
    }
}