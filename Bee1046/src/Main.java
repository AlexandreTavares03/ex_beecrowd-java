import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int inicio = input.nextInt();
        int fim = input.nextInt();

        int duracao = 0;

        if(fim > inicio){
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

     input.close();
    }
}
