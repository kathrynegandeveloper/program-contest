import java.util.Scanner;

public class Green4 {


    public Green4(){

    }

    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        sin.close();
        int tris=0;
       for(int i=n/3; i<n; i++){
            int sides = n-i;
            for(int j=sides/2; j<=sides; j++){
                if(sides>i && j>=(sides-j) && j<=i){
                    tris++;
                }
            }
       }

        
        System.out.println(tris);

    }

}