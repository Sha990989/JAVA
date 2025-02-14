 
    class person {
        person()
        {
           System.out.println("Base Class");
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
       public class superwithconstructor
       {
        public static void main(String[] args)
        {
            student obj=new student();
        }
       }
