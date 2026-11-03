import java.util.Scanner;

public class Main {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        double volume;
        double diametro;
        double altura, area;

        volume = input.nextDouble();
        diametro = input.nextDouble();

        altura = (volume*4) / (3.14 * (diametro * diametro));

        area = 3.14 * (diametro*diametro)/ 4;

        System.out.printf("ALTURA = %.2f %n", altura);
        System.out.printf("AREA = %.2f %n", area);

        input.close();

    }
}
