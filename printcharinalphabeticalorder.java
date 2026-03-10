import java.util.Arrays;
public class printcharinalphabeticalorder {
    public static void main(String[] args) {
        String str="programming";
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted:"+new String(arr ));
    }
}
