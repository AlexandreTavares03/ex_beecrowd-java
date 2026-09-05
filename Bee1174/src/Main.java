import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double[] A = new double [100];

        for(int i=0; i < 100; i++){
            A[i]=input.nextDouble();

            if(A[i]<=10){
                System.out.printf("A[%d] = %.1f%n", i, A[i]);
            }
        }
        input.close();
    }
}
