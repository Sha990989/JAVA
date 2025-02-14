class outer
{
static class inner
{
void innermethod()
{
System.out.print("INNER CLASS METHOD");
}
}
public static void main(String args[])
{
inner i=new inner();
i.innermethod();
}
}