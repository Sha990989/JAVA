//count words in arraystring 

/* this is the program using split function: 
public class countwordsinarraystring {
    public static void main(String[]args){
        String[] arr={"hello world", "java programming language", "openai chatgpt"};
        System.out.println("Word count in each string of the array:");
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            String[] words=str.split(" ");
            System.out.println(str+" has "+words.length);
        }
    }
}*/
     
//count words in string without using split():-
   class countwordsinarr {
    public static void main(String[] args) {
        String str="I am Sana";
        int count=1;
        for(int i=0;i<str.length();i++){  //stringlength starts from 1 
            if(str.charAt(i)==' '&&str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("count of the words in the string is: "+(count));
    
    }
}
