import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.printf("%d eh o maior%n",a);
        }
        else if(b>c){
            System.out.printf("%d eh o maior%n",b);
        }
        else {
            System.out.printf("%d eh o maior%n",c);
        }
    }
}
