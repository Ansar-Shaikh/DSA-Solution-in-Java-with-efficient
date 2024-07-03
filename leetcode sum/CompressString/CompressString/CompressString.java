class CompressString {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int count = 1;
        sb.append(chars[0]);
        while (i < chars.length) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(chars[i]);
                count = 1;
            }
            i++;
        }
        if (count > 1) {
            sb.append(count);
        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'd', 's', 's'};
        CompressString compressor = new CompressString();
        int length = compressor.compress(chars);
        System.out.print("Compressed array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("Length of compressed array: " + length);
    }
}
