class parent1
{
void message()
{
System.out.print("HELLO");
}
}
class parent
{
public static void main(String args[])
{
parent1 p1=new parent1();
p1.message();
parent1 p=new parent1()
{
void message()
{
System.out.print("\t WELCOME");
}
};
p.message();
}
}