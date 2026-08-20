import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        return fun("", digits);
    }

    public static final String[] keywords = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static ArrayList<String> fun(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(p);
            return baseResult;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        String letter = keywords[digit];
        for (int i = 0; i < letter.length(); i++) {
            ans.addAll(fun(p + letter.charAt(i), up.substring(1)));
        }
        return ans;
    }
}
