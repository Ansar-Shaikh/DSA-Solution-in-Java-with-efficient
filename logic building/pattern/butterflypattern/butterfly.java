class butterfly {
    public static void butterfly_pattern(int n) {
        //****************first half************************
        for (int i = 1; i <= n; i++) {
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //****************second half******************
        for (int i = n; i >= 1; i--) {
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello butterfly happy!");
        butterfly_pattern(5);
    }
}