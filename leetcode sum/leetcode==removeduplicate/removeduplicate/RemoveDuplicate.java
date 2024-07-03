class RemoveDuplicate {
    public static int removeDuplicate(int[] ar) {
        if (ar.length == 0) {
            return 0;
        }

        int rd = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[rd] != ar[i]) {
                rd++;
                ar[rd] = ar[i];
            }
        }
        return rd + 1;
    }

    public static void main(String[] args) {
        int[] ar = {1, 1, 5, 5, 6, 9, 6, 7, 9};

        System.out.println("Original array:");
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sorting the array to ensure duplicates are adjacent
        java.util.Arrays.sort(ar);

        int newLength = removeDuplicate(ar);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
