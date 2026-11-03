import java.util.Scanner;
public class Main {

        public static void main (String[] args){
            Scanner input = new Scanner(System.in);

            int a = input.nextInt();
            int b = input.nextInt();

            int c = 0;


            try{
                c = a / b;
            } catch (Exception e){
                System.out.println("ERRO: Não é possivel dividir por zero!!" + e.getMessage());
                //throw new RuntimeException(e);
            }

            System.out.println(c);

        }
    }

