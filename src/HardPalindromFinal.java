import java.util.*;

public class HardPalindromFinal {
        public static void main(String[] args) {
            String str = new Scanner(System.in).next();
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            boolean b = false;
            int i = str.length() - 1;
            int j = 0;
            if(str.contains(stringBuilder)) b = true;

            while(!b) {
                b =  str.contains(stringBuilder.delete(i--, str.length()));
                j++;
            }
            for(int c = j - 1; c >= 0; c--){
                str += str.charAt(c);
            }
            System.out.println(str);



    }





}
