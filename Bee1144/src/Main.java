import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 1; i<N; i++){
            int quadrado = i*i;
            int cubo = i*i*i;

            System.out.printf("%d %d %d%n", i, quadrado, cubo);

        }

        input.close();

    }
}
