import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(sc.nextLine());//a[i]=sc.nextInt();
        }
        Collections.sort(a);
        Collections.reverse(a);
        for (String i : a) {
            System.out.print(i+" ");
        }
    }
}