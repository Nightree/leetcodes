package priv.nightree.basic.bignumber;

public class PrintNumber {

    private static int n;
    private static StringBuilder res;
    private static char[] loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static char[] num;

    public static void main(String[] args) {
        n = 2;
        num = new char[n];
        res = new StringBuilder();
        dfs(0);
        System.out.println(res);
    }

    private static void dfs(int i) {
        if (i == n) {
            res.append(String.valueOf(num)).append(',');
            return;
        }
        for (char c : loop) {
            num[i] = c;
            dfs(i + 1);
        }
    }
}
