import java.util.Scanner;

public class HardPalindrom {

        public static void main(String[] args) {
            String str = new Scanner(System.in).next();
            int l = str.length();
            int ind = 0;
            int d = 0;

            for(int i = 0; i < l; i++){
                for(int j = 1; j < l; j++){
                    if(str.charAt(i) == str.charAt(j)){
                        ind = str.indexOf(str.charAt(j));
                    }
                }
            }
            for(int i = 0; i < l - 1; i++) {
                if(str.charAt(i) == str.charAt(i + 1)) {
                    d++;
                }
            }
            if(ind == 0 && d != l - 1) ind = l - 1;
            for(int i = ind - 1; i > -1; i--){
                str += str.charAt(i);
            }
            System.out.println(str + " " + str.equals("uguutuugu"));
        }
    }





