import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome_vendedor = input.next();
        double salario_fixo = input.nextDouble();
        double total_vendas = input.nextDouble();

        double comissao = (total_vendas*15)/100;
        double salario_total = comissao + salario_fixo;

        System.out.printf("TOTAL = R$ %.2f%n", salario_total);

        input.close();
    }
}
