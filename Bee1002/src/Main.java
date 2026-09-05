import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float raio = input.nextFloat();
        double n = 3.14159;

        double area = n * (raio * raio);

        System.out.printf("A = %.4f",area);

    }
}
