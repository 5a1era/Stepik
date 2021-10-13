import java.util.*;

public class IndenticalElementsFromToLists {


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> arrayList = new ArrayList<>();
            String[] strs1 = scanner.nextLine().split(" ");
            String[] strs2 = scanner.nextLine().split(" ");
            for(String s1 : strs1) {
                for (String s2 : strs2) {
                    if(s1.equals(s2)) {
                        arrayList.add(Integer.parseInt(s1));
                        break;
                    }
                }
            }
            Set<Integer> set = new HashSet<>(arrayList);
            ArrayList<Integer> arrayListResult = new ArrayList<>(set);
            Collections.sort(arrayListResult);
            for(int i : arrayListResult) {
                System.out.print(i + " ");
            }


        }

    }


}
