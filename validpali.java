class validpali {
    public static boolean isPalindrome(String str) {
        // Convert to lowercase and remove non-alphanumeric characters
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;   
    }

    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(isPalindrome(str));
    }
}