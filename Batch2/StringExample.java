import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) { 
       String s="hello how are you";
       String s2="";
       String[] s1=s.split(" ");
       for(int i=s1.length-1;i>=0;i--){
        s2=s2+s1[i]+" ";
    }
    System.out.println(s2.trim());
       
       
    }
}
