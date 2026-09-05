import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double nA = input.nextDouble();
        double nB = input.nextDouble();
        double pA = 3.5;
        double pB = 7.5;

        double calc_1 = nA*pA;
        double calc_2 = nB*pB;
        double media = (calc_1+calc_2)/11.0;

        System.out.printf("MEDIA = %.5f%n",media);

        input.close();

    }
}
