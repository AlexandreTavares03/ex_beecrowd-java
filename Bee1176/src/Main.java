import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        long[] T = new long[61];

        T[0] = 0;
        T[1] = 1;

        for(int i=2; i<61; i++){
            T[i] = T[i -1] + T[i - 2];
        }

        int casos = input.nextInt();

        for(int i=0 ; i<casos; i++){
            int N = input.nextInt();

            System.out.printf("Fib(%d) = %d%n", N, T[N]);
        }

        input.close();
    }
}
