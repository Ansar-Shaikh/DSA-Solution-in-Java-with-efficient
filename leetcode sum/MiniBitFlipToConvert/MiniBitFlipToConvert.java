class MiniBitFlipToConvert {
    public static int MiniBitFlipToConvert(int start, int end) {
        int n = start ^ end;
        int countsetbit = 0;
        while (n != 0) {
            n = n & (n - 1);
            countsetbit++;
        }
        return countsetbit;
    }

    public static void main(String[] args) {
        // Binary values 10100 and 11001 are equivalent to decimal 20 and 25 respectively
        int start = Integer.parseInt("10100", 2);
        int end = Integer.parseInt("11001", 2);
        System.out.println(MiniBitFlipToConvert(start, end));
    }
}
