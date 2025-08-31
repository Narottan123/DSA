public class FindBinaryCombination {
    public static void BinaryCombination(int n, String str) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }
        BinaryCombination(n, str + "0");
        BinaryCombination(n, str + "1");
    }

    public static void main(String[] args) {
        int n = 3;
        BinaryCombination(n, "");
    }
}
