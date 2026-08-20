public class Questions1 {
    public static void main(String[] args) {
        String s = "appleisafruit";
        System.out.print(fun(s));
    }

    static String fun(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if(s.startsWith("apple")){
            return fun(s.substring(5));
        }
        char c = s.charAt(0);
        return c + fun(s.substring(1));
    }
}
