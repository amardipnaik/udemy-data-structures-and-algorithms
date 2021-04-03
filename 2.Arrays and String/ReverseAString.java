import java.util.Arrays;

public class ReverseAString {

    public static void main(String args[]) {

        String giveString = "INDIA";
        char[] stringtoArray = giveString.toCharArray();

        for (int i = stringtoArray.length-1; i >= 0; i--) {
            System.out.print(stringtoArray[i]);
        }

    }

}
