class countndremovespacesusingforeach {
    public static void main(String[] args) {
        String str="I love india";
int count=0;
String result="";
for(char ch :str.toCharArray()){  
if(ch ==' '){
count++;
}else{
    result=result+ch;
}
}
System.out.println(count);
System.out.println(result);
    }
}

