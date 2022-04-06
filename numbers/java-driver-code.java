import java.util.*;
class Vinay {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       boolean flag = checkNumber(n);
       if(flag) {
           System.out.println("Special");
       }else {
           System.out.println("Regular");
       }
    }
    public static boolean checkNumber(int n) {
        boolean flag= true;
        for(int i=2;i<=9;i++){
            if(n%i==0){
                if(n==2 || n==7) {
                    continue;
                }else {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
