import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A =input.nextDouble();
        double B =input.nextDouble();
        double C =input.nextDouble();
        double pA = 2.0;
        double pB = 3.0;
        double pC = 5.0;

        double media = ((A*pA)+(B*pB)+(C*pC))/10.0;

        System.out.printf("MEDIA = %.1f%n", media);

        input.close();
    }
}
