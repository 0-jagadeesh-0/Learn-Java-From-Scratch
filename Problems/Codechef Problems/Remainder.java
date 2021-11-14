import java.util.*;

class Remainder{
    public static void main (String[] args) {
        try{
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for(int i=0; i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            
            int rem = a%b;
            
           System.out.println(rem);
           
        }
        in.close();
        }
        catch(Exception e){
        return;
        }
    }
}