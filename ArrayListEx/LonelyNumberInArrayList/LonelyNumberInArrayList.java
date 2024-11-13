import java.util.*;

class LonelyNumberInArrayList {
    public static ArrayList<Integer> LonelyNumber(ArrayList<Integer> num) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(num);
        int n = num.size();
        for (int i = 0; i < n; i++) {
            // Check previous and next elements
            if (i != 0 && (num.get(i).equals(num.get(i - 1)) || num.get(i) == num.get(i - 1) + 1)) {
                continue;
            }
            if (i != n - 1 && (num.get(i).equals(num.get(i + 1)) || num.get(i) == num.get(i + 1) - 1)) {
                continue;
            }
            result.add(num.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(15);

        ArrayList<Integer> res = LonelyNumber(list);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i) + " ");
        }
    }
}
