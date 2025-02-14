public class person {
 person()
 {
    System.out.print("Base Class");
 }   
}
class student extends person
{
    student()
    {
        super();
        System.out.println("sub class");
    }
}
class SUPER
 {
  public static void main(String args[])
  {
   student obj=new student();
  }
 }
