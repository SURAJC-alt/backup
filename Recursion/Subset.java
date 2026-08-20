import java.util.ArrayList;

public class Subset {

    public static void main(String[] args) {
        String name = "abc";
        System.out.println(stringSubSet("", name));
    }

    // static void stringSubSet(String p, String up) {
    // if (up.isEmpty()) {
    // System.out.print(p + " ");
    // return;
    // }
    // char c = up.charAt(0);
    // stringSubSet(p + c, up.substring(1));
    // stringSubSet(p, up.substring(1));
    // }

    static ArrayList<String> stringSubSet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(p);
            return baseResult;
        }
        char c = up.charAt(0);
        ArrayList<String> left = stringSubSet(p + c, up.substring(1));
        ArrayList<String> right = stringSubSet(p, up.substring(1));
        left.addAll(right);
        return left;

    }
}
