import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        String texto = input.nextLine();

        try {
            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido: " + numero);
        }
        catch (NumberFormatException e) {
            System.out.println("Erro: O texto fornecido não é um formato numérico válido");
        }
        input.close();
    }
}
