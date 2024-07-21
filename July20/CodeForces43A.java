package July20;
import java.util.*;
public class CodeForces43A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] team=new String[n];
        int g1=0,g2=0;
        String t1=null,t2=null;
        for(int i=0;i<n;i++){
            team[i]=sc.next();
        }
        Arrays.sort(team);
        t1 = team[0];
        for(int i=0;i<n;i++){
            if(team[i].equals(t1)){
                g1++;
            } else{
                t2 = team[i];
            }
        }
        g2 = n-g1;
        if(g1>g2){
            System.out.println(t1);
        } else{
            System.out.println(t2);
        }
    }
}
