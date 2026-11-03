import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int L = input.nextInt();
        int[] N = new int[L];
        int m2=0 , m3=0, m4=0, m5=0;

        for(int i=0; i < L; i++){
            N[i] = input.nextInt();
        }
        for(int i=0; i<L; i++){

            if(N[i] % 2 == 0){
                m2++;
            } if(N[i] % 3 == 0){
                m3++;
            }if(N[i] % 4 == 0){
                m4++;
            }if(N[i] % 5 == 0){
                m5++;
            }
        }

        System.out.printf("%d Multiplo(s) de 2%n", m2);
        System.out.printf("%d Multiplo(s) de 3%n", m3);
        System.out.printf("%d Multiplo(s) de 4%n", m4);
        System.out.printf("%d Multiplo(s) de 5%n", m5);

        input.close();
    }
}
