import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversArrayList {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> arrayList = new ArrayList<>();
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                arrayList.add(scanner.nextInt());
            }
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                arrayList.add(scanner.nextInt());
            }

            Collections.sort(arrayList);
            Collections.reverse(arrayList);
            for (int i : arrayList) {
                System.out.print(i + " ");
            }


        }

    }


}
