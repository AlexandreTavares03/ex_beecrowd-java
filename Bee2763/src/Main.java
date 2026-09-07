import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String cpf = input.nextLine();

        for(int i=0; i<cpf.length(); i++){
            char caracter_atual = cpf.charAt(i);

            if(caracter_atual == '.' || caracter_atual == '-'){
                System.out.printf("%n");
            } else {
                System.out.printf("%c", caracter_atual);
            }
        }

        System.out.printf("%n");

        input.close();
    }
}
