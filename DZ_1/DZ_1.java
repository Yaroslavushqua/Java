package DZ_1;

public class DZ_1 {
    public static void main(String[] args) {
    
        int[] arr6 = {1, 5, 3, 8, 9, 0};
        int min = arr6[0];
        int max = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (min > arr6[i]) {
                min = arr6[i];
            } else if (max < arr6[i]) {
                max = arr6[i];
            }
        }
        System.out.printf("Минимальный элемент = %s. \n", min);
        System.out.printf("Максимальный элемент = %s.", max);

        System.out.println("\n");
}
}