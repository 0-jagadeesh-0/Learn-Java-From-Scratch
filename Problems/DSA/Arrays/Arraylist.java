import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i));
        }
        in.close();
    }
}
