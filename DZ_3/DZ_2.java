package DZ_3;
import java.util.ArrayList;
import java.util.Random;
public class DZ_2 {public static void main(String[] args) {
    ArrayList<Integer> myArray = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < random.nextInt(50); i++) {
        myArray.add(random.nextInt(100));
    }

    int maxValue = myArray.get(0);
    int minValue = myArray.get(0);
    int mediaValue = 0;

    for (int i = 1; i < myArray.size(); i++) {
        if (myArray.get(i) > maxValue){
            maxValue = myArray.get(i);
        }else if (myArray.get(i) < minValue){
            minValue = myArray.get(i);
        }
        mediaValue += myArray.get(i);
    }

    mediaValue = mediaValue / myArray.size();

    System.out.println(myArray);
    System.out.println("Максимальное значение массива = " + maxValue);
    System.out.println("Минимальное значение массива = " + minValue);
    System.out.println("Среднее арифметическое массива = " + mediaValue);
}
    
}
