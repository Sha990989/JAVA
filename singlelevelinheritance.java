class Birds{
    void get(){
    System.out.println("birds has Beak");
    }
}
class Wings extends Birds{
    void print(){
     System.out.println("birds can fly");
    }
}
public class singlelevelinheritance {
    public static void main(String[] args) {

    Birds b=new Birds();
    Wings w=new Wings();
    b.get();
    w.print();
}
}
