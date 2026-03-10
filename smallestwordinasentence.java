public class smallestwordinasentence {

    public static void main(String[] args){
        String str="Java makes coding simple";//user input 
        String[] words=str.split(" ");
        String smallest=words[0];  
        for(String word:words){
            if(word.length()<smallest.length()){
                smallest=word;
            }
        }
        System.out.println("Smallest word:"+smallest);
    }   
}
