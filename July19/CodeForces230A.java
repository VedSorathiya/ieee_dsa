package July19;
import java.util.*;
public class CodeForces230A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        int n=sc.nextInt();
        int[] dstr=new int[n];
        int[] bonus=new int[n];
        for(int i=0;i<n;i++){
            dstr[i]=sc.nextInt();
            bonus[i]=sc.nextInt();
        }
        int i=0;
        while(i<n){
            if(str>=dstr[i]){
                str+=bonus[i];
                i++;
            }
            else{
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
