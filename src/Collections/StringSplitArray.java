package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringSplitArray {
        public static void main(String[] args) {
            ArrayList<String> myList = new ArrayList<>(Arrays.asList("Java", "is", "really", "fun"));
            ArrayList<String> halfList = cutInHalf(myList);
            System.out.println(halfList);
            cutAndPrint(myList);
        }
        public static ArrayList<String> cutInHalf(ArrayList<String> words){
            int halfString = words.size()/2;
            ArrayList<String> half = new ArrayList<>();
            for (int i=0 ; i < halfString ; i++){
                half.add(words.get(i));
            }
            return half;
        }
        public static void cutAndPrint(ArrayList<String> arr){
            ArrayList<String> half1 = new ArrayList<>();
            ArrayList<String> half2 = new ArrayList<>();
            int stringHalf = arr.size()/2;
            for(int i=0 ; i<stringHalf ; i++){
                half1.add(arr.get(i));
            }
            for(int i=stringHalf ; i < arr.size() ; i++){
                half2.add(arr.get(i));
            }
            System.out.println(half1 + " - "+half2);
        }
    }

