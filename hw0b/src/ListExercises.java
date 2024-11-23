import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for (int i = 0; i < L.size(); i++) {
            sum += L.get(i);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evenList = new ArrayList<>();
        for (Integer li : L) {
            if (li % 2 == 0) {
                evenList.add(li);
            }
        }
        return evenList;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commen = new ArrayList<>();
        for (Integer item1 : L1) {
            for (Integer item2 : L2) {
                if (item1 == item2) {
                    commen.add(item1);
                    break;
                }
            }
        }
        return commen;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int sum = 0;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (c == letter) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
