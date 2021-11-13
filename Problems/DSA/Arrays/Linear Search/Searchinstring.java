public class Searchinstring {
    public static void main(String[] args) {
        String name = "Jesus";
        char ch = 'd';

        System.out.println(search(name, ch));

    }
     static boolean search(String str, char ch){
         if(str.length() == 0)
         return false;
        
         for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i)==ch)
             {
                 return true;
             }
         }
         return false;
        }
}
