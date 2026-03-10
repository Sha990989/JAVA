class repeatedcharsinstring {
    public static void main(String[] args) {
        String str = "programming";
        str = str.toLowerCase();

        System.out.println("Repeated characters:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check only first occurrence of the character
            if (str.indexOf(ch) == i) {

                // Check if it appears again later
                if (str.indexOf(ch, i + 1) != -1) {
                    System.out.println(ch);
                }
            }
        }
    }
}
