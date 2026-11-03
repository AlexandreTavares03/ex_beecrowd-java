import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        try {
            int idade = input.nextInt();

            System.out.println(idade);
        }
        catch (Exception e){
            System.out.println("ERRO, você precisa digitar um numero inteiro valido." + e.getClass().getName());

        }
        finally {
            System.out.println("Fim da execução do programa. Scanner fechado com sucesso");
            input.close();
        }
    }
}
