class Arrays
{
void display(int a[])
{
for(int x:a)
{
System.out.print(x+" ");
}
}
public static void main(String args[])
{
int[] arr={2,4,6,7,8};
Arrays A=new Arrays();
A.display(arr);
}
}