public class ASCIIvalueofeachchar{
    public static void main(String[] args) 
    {
        String str = "Java";
        //for (int i = 0; i < str.length(); i++) 
          //  char ch = str.charAt(i);
            //int ascii = (int) ch;
            //System.out.println("ASCII value of " + ch + " is: " + ascii);
        
        for(char ch:str.toCharArray()){
          System.out.println(ch+"->"+(int)ch);
        }
    }
}

    


