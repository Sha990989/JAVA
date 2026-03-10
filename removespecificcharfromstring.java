public class removespecificcharfromstring{
    public static void main(String[] args) {
        String str = "welcome";
        char remove='l';
        String result=str.replace(Character.toString(remove),  "");
        System.out.println("After removal:"+result);
    }
}