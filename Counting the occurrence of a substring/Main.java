import java.util.Scanner;
import java.io.*;
/*class Main{
  public static void main(String args[]) {
   	
  } 
}*/
class Main { 
      
    static int countFreq(String pat, String txt) {         
        int M = pat.length();         
        int N = txt.length();         
        int res = 0; 
  
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) { 
            /* For current index i, check for  
        pattern match */
            int j;             
            for (j = 0; j < M; j++) { 
                if (txt.charAt(i + j) != pat.charAt(j)) { 
                    break; 
                } 
            } 
  
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
            if (j == M) {                 
                res++;                 
                j = 0;                 
            }             
        }         
        return res;         
    } 
  
    /* Driver program to test above function */
    static public void main(String[] args)throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String txt = br.readLine();
        String pat = br.readLine();         
        System.out.println(countFreq(pat, txt));         
    } 
} 