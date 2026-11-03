import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] frutas ={"maçã" , "Banana", "Uva"};

        System.out.println("Digite uma posição de 0 a 2: ");
        int posicao = input.nextInt();

        try{
            System.out.println("Fruta escolhida: " + frutas[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Posição inválida! Escolhaapenas números de 0 a 2. ");
        }
        input.close();
    }
}
