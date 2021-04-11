import java.util.Arrays;

public class StringReversal {

    public static void main(String args[]) {
        String giveString = "INDIA";
        System.out.println(usingSwapingReverse(giveString));

    }

    public static String reverseWithCharArray(String giveString) {
        char[] stringtoArray = giveString.toCharArray();
        char[] result = new char[stringtoArray.length];
        for (int i = stringtoArray.length - 1; i >= 0; i--) {
            result[stringtoArray.length - i - 1] = stringtoArray[i];
        }
        return Arrays.toString(result);
    }

    public static String reverseWithBytesArray(String giveString) {
        byte[] stringtoArray = giveString.getBytes();
        byte[] result = new byte[stringtoArray.length];
        for (int i = stringtoArray.length - 1; i >= 0; i--) {
            result[stringtoArray.length - i - 1] = stringtoArray[i];
        }
        return new String(result);
    }

    public static String stringBuilderReverse(String giveString) {
        StringBuilder sf = new StringBuilder(giveString);
        sf.reverse();
        return sf.toString();
    }

    public static String usingSwapingReverse(String giveString) {
        char[] stringArray = giveString.toCharArray();
        int left, right = 0;
        right = stringArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;
        }
        return Arrays.toString(stringArray);
    }

}
