/*create 4 classes as version1,version2,version3 and version4=>subclasses
version1=>chats
version2=>calls,status
version3=>videocalls,group chatting
version4=>meta AI,Channels

constraint:-if we extract any class it should give all previous class data also
*/
class version1{
    void set()
    {
        System.out.println("version1 is about chats");
    }
}
class version2 extends version1{
    void print()
    {
        set();
        System.out.println("version2 is about calls and status content");
    }
}
class version3 extends version2{
    void get()
    {
     print();
     System.out.println("version3 is about video calls and group chats");

    }
}
class version4 extends version3{
    void exe()
    {
     get();
     System.out.println("version4 is about metaAI and channels");

    }
}
class taskoninheritance{
    public static void main(String[] args) {
        version1 v1=new version1();
        version2 v2=new version2();
        version3 v3=new version3();
        version4 v4=new version4();
         v1.set();
         v2.print();
         v3.get();
         v4.exe();
    }
}