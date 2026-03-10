//count and remove spaces in the given string
//"i love india"
//o/p:-iloveindia
class countndremovespaces {
    public static void main(String[] args) {
        String str="I love india";
        int spacecount=0;
        for(int i=0;i<str.length();i++){  //stringlength starts from 1 
            if(str.charAt(i)==' '){
                spacecount++;
            }
        }
        String noSpaces = str.replace(" ", "");
        System.out.println("count of spaces in the string is: "+(spacecount));
        System.out.println("String without spaces: " + noSpaces);
    }
}
/*  (OR)

String str="I love india";
int count=0;
String result="";
for(int i=0;i<str.length();i++){  
if(str.charAt(i)==' '){
count++;
}else{
    result=result+str.charAt(i);
}
}
System.out.println(count);
System.out.println(result);

output:-2
       iloveindia

*/
