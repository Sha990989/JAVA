//frequency of every characters in a string
//i/p: narayana
//o/p:n=2
//r=1
//y=1
//a=4
class frequencyofcharsinstr {
    public static void main(String[] args) {
        String str = "narayana";
        boolean[] seen=new boolean[str.length()];
        for(int i=0;i<str.length();i++)
        {
            //System.out.println(str.charAt(i));=>gives every character in  string
            if(!seen[i])
            {
                int count=0;
                for(int j=i;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        seen[j]=true;
                        count++;
                    }
                }
                
                    System.out.println(str.charAt(i)+"="+count);
                
            }
        }
    }

    
}
