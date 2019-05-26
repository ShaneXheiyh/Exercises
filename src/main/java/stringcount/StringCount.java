package stringcount;

public class StringCount {
    public static void main(String[] args) {
        getStringCount();
        System.out.println(getStringCount());
    }

    public static int getStringCount() {
        String x = "Un String cu vocale";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i'
                    || x.charAt(i) == 'o' || x.charAt(i) == 'u'|| x.charAt(i) == 'U') {
                count += 1;
            }
        }
        return count;
    }
}
