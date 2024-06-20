package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class CodeforcesProb141A {
    public static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String args[]){
        String guest, host, pile, sum;
        try (BufferedReader br = new BufferedReader(new FileReader("names.txt"))){
            guest = br.readLine();
            host = br.readLine();
            pile = br.readLine();
            sum = guest + host;
            if(sort(pile).equals(sort(sum))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
