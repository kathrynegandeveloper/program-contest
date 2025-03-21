import java.util.Scanner;

public class Green3 {


    public Green3(){

    }

    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int m = sin.nextInt();
        int n = sin.nextInt();
        sin.close();

        int snips = 0;

        for(int x=m; x<=n; x++){
            if(perSnip(x)){
                System.out.println(x);
                snips++;
            }
        }
        System.out.println(snips);

    }

    public static boolean perSnip(int y){
        int first = 0;
        int last = 0;
        for(int z=1;z<=y;z*=10){
            first=y/z;
            last=y%z;
            if((first+last)*(first+last)==y)
                return true;
        }

        return false;
    }

}
