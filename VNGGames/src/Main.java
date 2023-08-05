import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        while (true){
            int a = scanner.nextInt();
            if (a == 0) break;
            int b = scanner.nextInt();
            if (a == 1){
                set.add(b);
            } else {
                if (set.contains(b)){
                    System.out.println(indexOf(set, b));
                } else {
                    System.out.println(0);
                }
            }
        }
    }

    private static int indexOf(TreeSet<Integer> set,
                               Integer element)
    {
        List<Integer> list = new ArrayList<Integer>(set);

        return list.indexOf(element) + 1;
    }
}