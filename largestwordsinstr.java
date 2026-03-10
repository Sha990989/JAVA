//write a program to find the largest words in the given string
//["i","am","a","java","developer"]
public class largestwordsinstr {
  public static void main(String[] args) {
    String str="I am a java developer";
    String[] words=str.split(" ");
    String largest="";
    for(int i=1;i<words.length;i++){
     if(largest.length()<words[i].length())
     {
        largest=words[i];
     }
  }  
  System.out.println(largest);
  
}
}