import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversArrayList {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> arrayList = new ArrayList<>();
            String n = scanner.next();
            for (int i = 0; i < Integer.valueOf(n); i++) {
                arrayList.add(Integer.parseInt(scanner.next()));
            }
            String m = scanner.next();
            for (int i = 0; i < Integer.valueOf(m); i++) {
                arrayList.add(Integer.parseInt(scanner.next()));
            }

            Collections.sort(arrayList);
            Collections.reverse(arrayList);
            System.out.print(arrayList);

        }

    }


}
