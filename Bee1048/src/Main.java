import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double sal = input.nextDouble();
        double novo_sal = 0;
        double reajuste = 0;
        int percentual = 0;

        if(sal>=0 && sal <= 400.00){
            percentual = 15;
            reajuste = (sal * 15.0)/100;
            novo_sal= sal + reajuste;
        } else if(sal >= 400.01 && sal <= 800.00){
            percentual = 12;
            reajuste = (sal * 12.0)/100;
            novo_sal= sal + reajuste;
        } else if(sal >= 800.01 && sal <= 1200.00){
            percentual = 10;
            reajuste = (sal * 10.0)/100;
            novo_sal= sal + reajuste;
        } else if (sal >= 1200.01 && sal <= 2000.00){
            percentual = 7;
            reajuste = (sal * 7.0)/100;
            novo_sal= sal + reajuste;
        } else {
            percentual = 4;
            reajuste = (sal * 4.0)/100;
            novo_sal = sal + reajuste;
        }

        System.out.printf("Novo salario: %.2f%n", novo_sal);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        input.close();
    }
}
