public class thirdpattern {
    public static void main(String[] args) {
        int row=5;
        char c="A";
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row-i+1;j++){
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
        }
    }
}
