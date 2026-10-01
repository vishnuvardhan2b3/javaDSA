import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;
class StackExample{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        int[] a={2,6,9,4,5,1,3,8};
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[i]>s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                h.put(a[i],-1);
            }
            else{
                h.put(a[i],s.peek());
            }
            s.push(a[i]);
        }
        System.out.println(h);
    }
}