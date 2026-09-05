import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod_func = input.nextInt();
        int h_trab = input.nextInt();
        double val_h = input.nextDouble();

        double val_sal = h_trab * val_h;

        System.out.printf("NUMBER = %d%n",cod_func);
        System.out.printf("SALARY = U$ %.2f%n",val_sal);

        input.close();
    }
}
