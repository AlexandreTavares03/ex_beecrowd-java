import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String DNA = input.nextLine();
        int cont_A=0;
        int cont_C=0;
        int cont_G=0;
        int cont_T=0;
        int maiorsequencia=0;
        int cont_sequencia=0;
        String letra_maior = "";

        for(int i=0; i<DNA.length(); i++){

            if(DNA.charAt(i)=='A'){
                cont_A++;
            } else if (DNA.charAt(i)=='C') {
                cont_C++;
            }else if (DNA.charAt(i)=='G') {
                cont_G++;
            }else if (DNA.charAt(i)=='T') {
                cont_T++;
            }

            if (i == 0) {
                cont_sequencia = 1;
            } else if (DNA.charAt(i) == DNA.charAt(i - 1)) {
                cont_sequencia++;
            } else {
                cont_sequencia = 1;
            }

            if (cont_sequencia > maiorsequencia) {
                maiorsequencia = cont_sequencia;
                letra_maior= "" + DNA.charAt(i);

            } else if (cont_sequencia == maiorsequencia) {
                if (i == 0 || DNA.charAt(i) != DNA.charAt(i - 1)) {
                    letra_maior += " " + DNA.charAt(i);
                }

            }
        }

        System.out.println("A=" + cont_A + " C=" + cont_C +
                " G=" + cont_G + " T=" + cont_T);

        System.out.println(DNA + " " + letra_maior + maiorsequencia );

        input.close();
    }
}
