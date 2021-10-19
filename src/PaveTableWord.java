import java.util.Scanner;

public class PaveTableWord {

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            char [] chr = scanner.nextLine().toCharArray();
            int len = chr.length;
            char[][] chrs = new char[len][len];


            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {

                    if(i != len - 1 && j != len -1) {
                        chrs[i][j] = '0';
                    } else {
                        chrs[0][j] = chr[j];
                        chrs[i][0] = chr[i];
                        chrs[i][len-1] = chr[len-i-1];
                        chrs[len-1][j] = chr[len-j-1];
                    }

                }
            }

            for (int i = 0; i < len; i++) {
                for(int j = 0; j < len; j++) {
                    System.out.print(chrs[i][j] + " ");
                }
                System.out.println();
            }



        }

    }


}
