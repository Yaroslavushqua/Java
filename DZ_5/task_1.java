package DZ_5;
import java.util.HashMap;
import java.util.Scanner;

public class task_1 {
    public static void phonebook(HashMap<Integer, String> map) {
        try (Scanner scanner = new Scanner(System.in)) {
            choice:
            while (true) {
                System.out.print(
                        "Введите:\n1 - для поиска контакта\n2 - для добавления контакта\n" +
                                "3 - для удаления контакта\n4 - для просмотра всей телефонной книги\n" +
                                "q - для выхода \n");
                String input = scanner.nextLine();
                switch (input) {
                    case ("1"):
                        System.out.println("Введите имя контакта");
                        String name = scanner.nextLine();
                        for (var item : map.entrySet())
                            if (item.getValue().equals(name)) {
                                System.out.println("Контакт " + name + " найден: " + item.getKey());
                            }

                        break;

                    case ("2"):
                        System.out.println("Введите имя: ");
                        name = scanner.nextLine();
                        System.out.println("Введите номер телефона: ");
                        int key = scanner.nextInt();
                        map.putIfAbsent(key, name);
                        System.out.println(map);
                        break;
                    case ("3"):
                        System.out
                                .println("Введите номер телефона контакта телефонной книги, который хотите удалить: ");
                        key = scanner.nextInt();
                        ;
                        map.remove(key);
                        System.out.println(map);
                        break;
                    case ("4"):
                        System.out.println(map);
                        break;

                    case ("q"):
                        break choice;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {

        HashMap<Integer, String> phonebook = new HashMap<>();

        phonebook.put(811111111, "Svetlana");
        phonebook.put(822233333, "Victoriya");
        phonebook.put(844455555, "Kristina");
        phonebook.put(866677777, "Anastasiya");
        phonebook.put(888899999, "Stanislav");
        phonebook.put(800000000, "Stanislav");

        System.out.println(phonebook);
        phonebook(phonebook);

    }

}
