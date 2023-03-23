package DZ_4;
import java.util.ArrayList;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String n;
            System.out.println("Если хотите удалить предыдущую введенную строку из памяти введите - revert");
            System.out.println("если вывести строки памяти введите - print");
            System.out.println("а если хотите выйти памяти введите - exit");

            System.out.print("Введите строку: ");
            n = sc.next();
            
            if (n.compareTo("print") == 0) {
                printList(list);
            } else if (n.compareTo("revert") == 0) {
                list.remove(list.size() - 1);

            } else if (n.compareTo("exit") == 0) {
                break;
            } else {
                list.add(n);
            }

        }

        sc.close();
    }

        public static void printList(ArrayList<String> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }
}
