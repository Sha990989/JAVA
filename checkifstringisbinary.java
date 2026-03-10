public class checkifstringisbinary {
    public static void main(String[] args) {
        String str = "1010101";
        boolean isBinary=str.matches("[01]+");
        System.out.println("Is binary:"+isBinary);
    }
}
