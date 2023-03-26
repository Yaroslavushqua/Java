package DZ_2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DZ_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово: ");
        String word = null;
        try {
            word = iScanner.nextLine();
        } catch (Exception e) {
            System.out.println("Введены неверные данные");
            e.printStackTrace();
        }
        int n = 0;
        try {
            System.out.printf("Введите количество повторений: ");
            n = iScanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введены неверные данные");
            e.printStackTrace();
        }
        iScanner.close();

        RepitRecord(word, n);

    }

    private static void RepitRecord(String s, int n) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }      
        try (PrintWriter pw = new PrintWriter("fileForTask2.txt")){
            pw.println(sb);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    
}
