class outer
{
void outermethod()
{
class inner
{
void innermethod()
{
System.out.print("INNER CLASS METHOD");
}
}
inner i=new inner();
i.innermethod();
}
public static void main(String args[])
{
outer obj=new outer();
obj.outermethod();
}
}