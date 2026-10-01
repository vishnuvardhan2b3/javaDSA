public class StringVowel{
     public static void main(String[] args) {
        String s="Hello123%%^^";
        s=s.toUpperCase();
       int vcount=0,ccount=0,scount=0; 
       for(int i=0;i<s.length();i++)
        {
           char  ch=s.charAt(i);
           if(Character.isLetter(ch)){
            if(ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               vcount++;
            }
            else{
                ccount++;
            }
           }
           else if(!Character.isDigit(ch)){
               scount++;
           }
        }
        System.out.println("Vowels"+vcount);
        System.out.println("Consonents"+ccount);
        System.out.println("SC"+scount);

     }
}