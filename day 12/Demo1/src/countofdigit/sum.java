package countofdigit;

public class sum {

	public static void main(String[] args) {
        int num=(1,2,3,4);

        while (num > 0) {
            int digit = num % 10; 
            num= num + digit;    
            num = num / 10;       
        }

        System.out.println("Sum of digits = " + num);

	}

}
