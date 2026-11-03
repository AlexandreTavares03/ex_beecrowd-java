public class Main {

    public static int xx;

    static int maior(int a, int j){
        if (a > j){
            return a;
        }
        else {
            return j;
        }
    }
    static int menor(int a, int j){
        if (a < j){
            return a;
        }
        else {
            return j;
        }
    }
    static int maiorTres(int a, int b, int j) {
        if (a > b && a > j) {
            System.out.println(a);
            return a;
        }
        else if (b > j) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(j);
            return j;
        }
    }

    static double media(int a, int j){
        int soma = a + j;
        double media = soma/2;
        return media;
    }

    static int exemplo(int a){
        System.out.println("ROTINA EXEMPLO:"+ a);
        a = 50;
        return a;
    }

    static int exemplo2(int[] a){
        System.out.println("Rotina exemplo2" + a);
        System.out.println("Rotina exemplo2" + a[1]);
        a[1] = 50;
        return a[1];
    }

    public static void main(String[] args){

        int a = 10;
        int b = 15;
        int j = 20;
        xx = a + j;
        int[] v ={1,2,3};

        for(int i = 0; i <3; i++){
            System.out.println(a);
        }

        {
            int x = 5;
            for (int i = 0; i < 3; i++){
                System.out.println(x+j);
            }
        }

        System.out.println("O MAIOR É:" +maior(xx,j));
        System.out.println("O MENOR É:" +menor(a,j));
        System.out.println("O MAIOR ENTRE OS TRÊS É:" +maiorTres(a,b,j));
        System.out.println("A MÉDIA É:" +media(a,j));
        System.out.println(exemplo(j));
        System.out.println("Depois da rotina exemplo: "+j);

        System.out.println(v);
        System.out.println(exemplo2(v));
        System.out.println("Depois da rotina exemplo2: " + v[1]);

    }
}
