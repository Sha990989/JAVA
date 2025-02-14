class outer
{
class inner
{
void innermethod()
{
System.out.println("INNER CLASS METHOD");
}
}
void outermethod()
{
System.out.println("OUTER CLASS METHOD");
}
public static void main(String args[])
{
outer o=new outer();
o.outermethod();
outer.inner i=new outer().new inner();
i.innermethod();
}
}
