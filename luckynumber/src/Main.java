import java.util.Scanner;

public class Main {
    public static String s;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                if (checkPrevious(i) && checkNext(i) && checkPost(i + 1)) {
                    System.out.println("YES");
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("NO");
        }

    }

    public static boolean checkPrevious(int id){
        if (id == 0) return true;
        char ch = s.charAt(id - 1);
        if (ch != '1') return true; else return false;
    }

    public static boolean checkPost(int id){
        if (id == s.length() - 1) return true;
        char ch = s.charAt(id + 1);
        if (ch != '1') return true; else return false;
    }

    public static boolean checkNext(int id){
        char ch = s.charAt(id + 1);
        if (ch == '1') return true; else return false;
    }
}