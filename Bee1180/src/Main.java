import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] X = new int[N];


        for(int i=0; i<N; i++) {
            X[i] = input.nextInt();
        }

        int menor = X[0];
        int pos = 0;

        for(int i=0; i<N; i++) {
            if (X[i] < menor) {
                menor = X[i];
                pos = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("posicao: " + pos);

        input.close();
    }
}
