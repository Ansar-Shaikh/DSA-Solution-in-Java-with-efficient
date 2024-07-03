import java.util.ArrayList;

class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        list.remove(3); // Removes the element at index 3 (which is 40)
        list.remove(2); // Removes the element at index 2 (which is 30)
        System.out.println(list);
        
        list.add(1, 60); // Adds 60 at index 1
        System.out.println(list);
        
        list.set(1, 80); // Sets the element at index 1 to 80
        System.out.println(list);
        
        boolean contains90 = list.contains(90); // Checks if 90 is in the list
        System.out.println(contains90);
    }
}
