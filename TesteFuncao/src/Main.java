public class Main {

        public static void main (String[]args){

            String email = "fulano@gmail.com";

            if (MinhasFuncoes.isEmail(email)) {
                System.out.println(email + "\nEmail Is Valid");
            } else {
                System.out.println(email + "\nEmail Is Not Valid");
            }
        }
}
