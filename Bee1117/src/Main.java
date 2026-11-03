import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int notas_validas=0;
        double soma =0;
        double media = 0;

        while(notas_validas<2){
            double notas = input.nextDouble();

            if(notas>=0 && notas<=10){
                soma += notas;
                notas_validas++;
            } else {
                System.out.println("nota invalida");
            }
        }

         media = soma/2.0;
         System.out.printf("media = %.2f%n",media);

        input.close();
    }
}
