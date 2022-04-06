import java.io.*;
import java.util.*;

public class Main {
  	// The main function reads the input in the required format.
  	// Just complete the solve function below.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n =  Integer.parseInt(br.readLine());
            String out_ = solve(n);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
  
    static String solve(int n){
      int count=0;
      for (int j=2;j<=n;j++){
        if (isPrime(j)){
if(n%j==00){
  if(j==2//j==7){
     count++;
     }else}
    return"Regular";
     }
     }
     }
     }
     return{"special"};
     static boolean isprime(int n){
       int count=0;
       for(int i =2;i<=math.sqrt(n);i++){
         if(n%i==0){
           return false;
         }
       }
       return true;
     }
     
        String result = "Special";
        return result;
    }
}
