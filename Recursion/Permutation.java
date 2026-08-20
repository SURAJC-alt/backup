import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args){
        String srt = "ab";
        System.out.println(printPermutationList("", srt));
    }
    // static void printPermutation(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.print(p+ " ");
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     for(int i = 0; i <= p.length(); i++){
    //         String a = p.substring(0,i);
    //         String b = p.substring(i,p.length());
    //         printPermutation(a+ch+b, up.substring(1));
    //     }
    // }

    static ArrayList<String> printPermutationList(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(p);
            return baseResult;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String a = p.substring(0,i);
            String b = p.substring(i,p.length());
            ans.addAll(printPermutationList(a+ch+b, up.substring(1)));
        }
        return ans;
    }

    // static int printPermutationCount(String p, String up){
    //     if (up.isEmpty()) {
    //         return 1;
    //     }
    //     int count = 0;
    //     char ch = up.charAt(0);
    //     for(int i = 0; i <= p.length(); i++){
    //         String a = p.substring(0,i);
    //         String b = p.substring(i,p.length());
    //         count = count + printPermutationCount(a+ch+b, up.substring(1));
    //     }
    //     return count;
    // }

}
