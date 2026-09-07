import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        int[] competidor = new int[5];
        int resp_certa=0;

        for(int i=0; i<5; i++){
            competidor[i]= input.nextInt();

            if(competidor[i]== T){
                resp_certa++;
            }
        }
        System.out.printf("%d%n",resp_certa);

        input.close();
    }
}
