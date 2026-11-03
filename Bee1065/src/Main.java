import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] val = new int[5];
        int par = 0;

        for(int i=0 ; i < 5; i++){
            val[i]= input.nextInt();
            if(val[i] % 2 ==0){
                par++;
            }
        }
        System.out.printf("%d valores pares", par);

        input.close();
    }
}
