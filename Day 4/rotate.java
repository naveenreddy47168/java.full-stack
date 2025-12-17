 import java.util.Arrays;
 import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % size; 

        
        int[] rotated = new int[size];
        for (int i = 0; i < size; i++) {
            rotated[i] = a[(i + k) % size];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
}
    
    

