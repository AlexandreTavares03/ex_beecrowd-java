import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int cod = input.nextInt();
        int qtd = input.nextInt();
        double preco=0;

        if(cod==1){
            preco=4.00;
            preco = preco*qtd;
            System.out.printf("Total: R$ %.2f%n",preco);
        } if(cod==2){
            preco=4.50;
            preco = preco*qtd;
            System.out.printf("Total: R$ %.2f%n",preco);
        } if(cod==3){
            preco=5.00;
            preco = preco*qtd;
            System.out.printf("Total: R$ %.2f%n",preco);
        } if(cod==4){
            preco=2.00;
            preco = preco*qtd;
            System.out.printf("Total: R$ %.2f%n",preco);
        } if(cod==5){
            preco=1.50;
            preco = preco*qtd;
            System.out.printf("Total: R$ %.2f%n",preco);
        }

        input.close();
    }
}
