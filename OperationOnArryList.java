import java.util.ArrayList;

import javax.sql.rowset.spi.SyncResolver;

public class OperationOnArryList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 9);
        System.out.println(list);
        // Get operation-o(1);
        int element = list.get(2);
        System.out.println(element);

        // Delete
        list.remove(2);
        System.out.println(list);
        // Set
        list.set(2, 10);
        System.out.println(list);
        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        // Size of Arraylist
        // System.out.println(list.size());

        // Size of ArrayList
        // print the arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
