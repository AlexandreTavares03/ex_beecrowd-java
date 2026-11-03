import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int[] cartas = new int[2];

        cartas[0] = input.nextInt();
        cartas[1] = input.nextInt();

        if(cartas[0]>cartas[1]){
            System.out.println(cartas[0]);
        } else {
            System.out.println(cartas[1]);
        }

        input.close();
    }
}
