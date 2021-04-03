import java.util.Arrays;
import java.util.Hashtable;

public class FindCommonItems {
    // Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.
// 2 parameters - arrays - no size limit
// return true or false

    public static void main(String args[]) {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'j', 'y', 'i', 'a'};
        //boolean result = findMethodWithOn2Complexity(array1, array2);
        boolean result2 = findMethodWithOptimizedComplexity(array1, array2);

    }

    public static boolean findMethodWithOn2Complexity(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                /*System.out.println("Array 1 Data: " + array1[i] + " Array 2 Data: " + array2[j]);*/
                if (array1[i] == array2[j]) {
                    System.out.println("Matching Value Found : " + array1[i]);
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean findMethodWithOptimizedComplexity(char[] array1, char[] array2) {
        Hashtable<Integer, Character> storeValue1 = new Hashtable<Integer, Character>();
        for (int i = 0; i < array1.length; i++) {
            storeValue1.put(i, array1[i]);
        }
        System.out.println("storeValue1 : " + storeValue1.toString());
        for (int j = 0; j < array2.length; j++) {
            /*System.out.println("Array 1 Data: " + array1[i] + " Array 2 Data: " + array2[j]);*/
            if (storeValue1.containsValue(array2[j])) {
                System.out.println("Matching Value Found : " + array2[j]);
                return true;
            }
        }
        return false;
    }


}
