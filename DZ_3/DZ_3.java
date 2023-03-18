package DZ_3;
import java.util.ArrayList;
import java.util.Arrays;
public class DZ_3 {public static void main(String[] args) 
    {
        ArrayList arrLst = new ArrayList<>(Arrays.asList("word", 0.6, "word31", 62, "word21",  8));
        System.out.println(arrLst);
        int i = 0;
        while (i < arrLst.size())
        {
            if (arrLst.get(i) instanceof Integer == true)
            {
                arrLst.remove(i);
            }
            i++;
        }
        System.out.println(arrLst);
    
}
    
}
