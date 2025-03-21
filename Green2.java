import java.util.Scanner;
/**
 * Write a description of class Green2 here.
 *
 * @author Kathryn Egan
 * @version 0.1
 */
public class Green2
{


    public Green2()
    {
       
    };

   
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int x = 0;
        sin.close();
        x=n-1240;
        if(n>=1240)
            x+=5000;
        else
            x+=4000;
        
        if(((7*x)+1)%19>6)
            System.out.print("NOT A ");
        System.out.println("JEWISH LEAP YEAR");
    }
}