import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {


    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            ArrayList<Integer> arrayListResult = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            String[] str;

            for (int i = 0; i < 3; i++) {
                str = scanner.nextLine().split(" ");
                for (String s : str) {
                    switch (i) {
                        case 0:
                            arrayList1.add(Integer.valueOf(s));
                            break;
                        case 1:
                            arrayList2.add(Integer.valueOf(s));
                            break;
                        case 2:
                            arrayList3.add(Integer.valueOf(s));
                            break;
                    }
                }
            }

            for (int i = 0; i < arrayList1.size(); i++) {
                if (arrayList1.get(i) > 0) {
                    arrayListResult.add(arrayList1.get(i));
                }
            }
            for (int i = 0; i < arrayList2.size(); i++) {
                if (arrayList2.get(i) % 2 == 0) {
                    arrayListResult.add(arrayList2.get(i));
                }
            }
            for (int i = 0; i < arrayList3.size(); i++) {
                if (arrayList3.get(i) % 7 == 0) {
                    arrayListResult.add(arrayList3.get(i));
                }
            }

            Collections.sort(arrayListResult);
            for (int i : arrayListResult) {
                System.out.print(i + " ");
            }
        }

    }


}
