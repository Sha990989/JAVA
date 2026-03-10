class Birds{
    void get(){
    System.out.println("birds has Beak");
    }
}
class Wings extends Birds{
    void print(){
     System.out.println("birds has wings");
    }
}
class Fly extends Wings{
    void set(){
     System.out.println("birds can fly");
    }
}
public class multilevelinheritance {
    public static void main(String[] args) {

    Birds b=new Birds();
    Wings w=new Wings();
    Fly f=new Fly();
    b.get();
    w.print();
    f.set();
}
}

