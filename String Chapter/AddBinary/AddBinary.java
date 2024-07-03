class AddBinary {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int base = 2;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        
        while (n1 >= 0 || n2 >= 0 || c == 1) {
            int t1 = 0, t2 = 0, sum;
            
            if (n1 >= 0) {
                t1 = a.charAt(n1--) - '0';
            }
            
            if (n2 >= 0) {
                t2 = b.charAt(n2--) - '0';
            }
            
            sum = t1 + t2 + c;
            
            if (sum >= base) {
                c = 1;
                sum -= base;
            } else {
                c = 0;
            }
            
            sb.append(sum);
        }
     
       return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        AddBinary sol = new AddBinary();
        String a = "11";
        String b = "1";
        System.out.println(sol.addBinary(a, b));  // Output: "10101"
    }
}
