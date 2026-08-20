import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.print(combinationDice("", 4));
    }
    static ArrayList<String> combinationDice(String p, int target){
        if (target == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(p);
            return baseResult;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(combinationDice(p+i, target-i));
        }
        return ans;
    }
}
