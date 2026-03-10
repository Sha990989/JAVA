public class removecharacterspresentinanotherstring {
    public static void main(String[] args) {
        String s1="computer";
        String s2="core";
        for(char ch:s2.toCharArray()){
            s1=s1.replace(Character.toString(ch), "");
        }
        System.out.println("After removal:"+s1);
    }
}
