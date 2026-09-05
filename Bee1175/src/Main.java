import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int[] N = new int[20];

        for(int i=0; i<20; i++){
            N[i] = input.nextInt();
        }
        for(int i=19; i>=0; i--){
            System.out.println("N[" + (19 - i) + "] = " + N[i]);
        }
    input.close();
    }
}
