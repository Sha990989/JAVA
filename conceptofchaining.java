/*concept is called "chaining"
the functions calling itself repeatedly in same class we called it as "chaining"
*/
class whatsapp{
    public static void a(){
        System.out.println("chatting");
        dd();
    }
    public static void bb(){
        System.out.println("calls");
        a();

    }
    public static void cc(){
        System.out.println("status");
        bb();
    }
    public static void dd(){
        System.out.println("metaAI");
        cc();
    }
}
public class conceptofchaining {
   public static void main(String[] args) {
    whatsapp wp=new whatsapp();
    wp.a();

   } 
}
