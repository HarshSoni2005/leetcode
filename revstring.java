class revstring {
    public static void reverseString(char[] str) {
        int n = str.length;
        char[] revarr = new char[n];
        for (int i = 0; i < n; i++) {
            revarr[i] = str[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            str[i] = revarr[i];
        }
    }
    public static void main(String[] args) {
        char str[] = {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(str);
    }
}
