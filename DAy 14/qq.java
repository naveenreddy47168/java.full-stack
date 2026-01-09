
    import java.util.Arrays;
import java.util.Scanner;

public class qq{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,2,3,4,5};

        int size=sc.nextInt();
        int b[]=new int[size];

        for(int i=5;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }

        /*for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }*/

        //foreach
        /*for(int val:b)
        {
            System.out.print(val+" ");
        }*/
       System.out.println(Arrays.toString(b));



    }
}

    



