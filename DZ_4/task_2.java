package DZ_4;
import java.util.Iterator;
import java.util.LinkedList;
public class task_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("Д");
        list.addLast("О");
        list.addLast("В");
        list.addLast("О");
        list.addLast("Д");

        printList(list);
        System.out.println();

        list = reverse(list);

        printList(list);
    }

    public static void printList(LinkedList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static LinkedList<String> reverse(LinkedList<String> list) {
        LinkedList<String> res = new LinkedList<String>();

        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext())
            res.add(itr.next());

        return res;
    }
}
