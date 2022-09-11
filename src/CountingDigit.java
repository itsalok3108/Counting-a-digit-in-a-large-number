import java.util.Scanner;

public class CountingDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a large number");
        int n=sc.nextInt();
        System.out.println("Enter the digit you want to count");
        int d= sc.nextInt();

        int count=0;
        while (n>0){
            int r=n%10;
            if(r==d){
                count++;}
            n/=10;
        }
        System.out.println("The digit came "+count+" times");
    }
}
