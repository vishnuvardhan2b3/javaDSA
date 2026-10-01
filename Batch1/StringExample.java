import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String s1="hello";
        StringBuffer sb=new StringBuffer(s1);
        String[] s2=s1.split(" ");
        for(int i=s2.length-1;i>=0;i--){
                if(s2[i]!=""){
                    sb.append(s2[i]);
                    sb.append(" ");
                }
        }
        System.out.println(sb.toString().trim());
    }
       
}
