package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> secondList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        System.out.println(compareTwoArray(firstList,secondList));


    }
    public static boolean compareTwoArray(ArrayList<Integer> array1,ArrayList<Integer> array2){
        boolean result= false;
        for (int i = 0; i < array1.size(); i++) {
            if (array2.get(i) == array1.get(i))
                return true;
        }
        return false;
    }
}


