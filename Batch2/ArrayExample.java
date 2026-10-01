import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a={50,60,10,20,30};
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
