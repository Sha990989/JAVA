//largest or longest word in a sentence like by aplitting space by space

public class largestorlongestwordinasentence{
    public static void main(String[] args){
        String str="Java makes coding simple";//user input 
        String[] words=str.split(" ");
        String largest="";
        for(String word:words){
            if(word.length()>largest.length()){
                largest=word;
            }
        }
        System.out.println("Largest word:"+largest);
    }
}