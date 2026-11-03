import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double val = input.nextDouble();

        if( val>=0 && val<=25.0){
            System.out. printf("Intervalo [0,25]%n");
        } else if (val > 25.0 && val<=50 ){
            System.out. printf("Intervalo (25,50]%n");
        } else if (val > 50.0 && val<=75){
            System.out. printf("Intervalo [50,75]%n");
        } else if (val > 75.0 && val<=100){
            System.out. printf("Intervalo (75,100]%n");
        } else {
            System.out.printf("Fora de intervalo%n");
        }
    input.close();
    }
}
