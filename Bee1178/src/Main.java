import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double X = input.nextDouble();
            double[] N = new double[100];

            N[0]= X;

            for( int i = 1; i < 100; i++){
                N[i] = (N[i-1])/2;
            }
            for(int i = 0; i<100; i++){
                System.out.printf("N[%d] = %.4f%n",i, N[i]);
            }

            input.close();
        }
    }
