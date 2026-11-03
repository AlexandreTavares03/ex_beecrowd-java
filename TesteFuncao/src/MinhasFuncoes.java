public class MinhasFuncoes {

    public static boolean isEmail(String email) {
        int contArroba = 0;
        int contPonto = 0;

        if (email == null) {
            System.out.println(email);
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                contArroba++;
            } else if (email.charAt(i) == '.') {
                contPonto++;
            }
        }
        if (contArroba == 1 && contPonto >= 1) {
            return true;
        } else {
            return false;
        }
    }
}