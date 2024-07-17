package July17;
import java.util.*;
public class CodeForces129A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int eve=0,odd=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                eve++;
            }
            else{
                odd++;
            }
        }
        if(odd%2==1){
            System.out.println(odd);
        }
        else{
            System.out.println(eve);
        }
    }
}
