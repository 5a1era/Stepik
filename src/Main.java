import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] str;
        for (int i = 0; i < 3; i++) {
            str = scanner.nextLine().split(" ");
            for (String s : str) {
                switch (i) {
                    case 0: arrayList1.add(Integer.valueOf(s));
                    break;
                    case 1: arrayList2.add(Integer.valueOf(s));
                    break;
                    case 2: arrayList3.add(Integer.valueOf(s));
                    break;
                }
            }

        }

        System.out.print(arrayList1 + "-" + arrayList2 + "-" + arrayList3);





    }
}
