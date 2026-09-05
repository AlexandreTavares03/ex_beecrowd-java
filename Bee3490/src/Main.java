import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int A = input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();
            int D = input.nextInt();

            System.out.printf("%d%d%d%d", A, B, C, D);
        }

        input.close();
    }
}
