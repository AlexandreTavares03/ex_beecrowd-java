import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            //loop para ler sequencia de entradas;

            //Ler um paragrafo;
            String paragrafo = input.nextLine();
            String resposta = "";

            //System.out.println(paragrafo);

            //Transformar paragrafo;
            boolean maiusculo = false;
            for (int i = 0; i < paragrafo.length(); i++) {

                if (paragrafo.charAt(i) != ' ') {
                    //FLAG
                    if (maiusculo) {
                        resposta += paragrafo.toLowerCase().charAt(i);
                        maiusculo = false;
                    } else {
                        resposta += paragrafo.toUpperCase().charAt(i);
                        maiusculo = true;
                    }
                } else {
                    resposta += paragrafo.charAt(i);
                }

            }
            input.close();
        }
    }
}
