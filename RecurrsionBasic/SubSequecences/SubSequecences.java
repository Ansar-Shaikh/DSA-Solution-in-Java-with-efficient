import java.util.HashSet;

class SubSequecences {
    public static void SubSequecences(String str, int idx, String newstr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currchar = str.charAt(idx);
        // to be
        SubSequecences(str, idx + 1, newstr + currchar, set);
        // not to be added in newstr
        SubSequecences(str, idx + 1, newstr, set);
    }

    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        SubSequecences(str, 0, "", set);
    }
}
