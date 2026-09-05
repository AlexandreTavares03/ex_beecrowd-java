import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double valUnit1, valUnit2;

        cod1 = input.nextInt();
        qtd1 = input.nextInt();
        valUnit1 = input.nextDouble();

        cod2 = input.nextInt();
        qtd2 = input.nextInt();
        valUnit2 = input.nextDouble();

        double valTotal= (valUnit1 * qtd1) + (valUnit2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valTotal);

        input.close();
    }
}
