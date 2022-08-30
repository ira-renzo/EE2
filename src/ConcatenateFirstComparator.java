import java.util.Comparator;
import java.util.Map;

public class ConcatenateFirstComparator implements Comparator<Map<String, String>> {
    @Override
    public int compare(Map<String, String> mapOne, Map<String, String> mapTwo) {
        String tempKey = mapOne.keySet().iterator().next();
        String stringOne = tempKey + mapOne.get(tempKey);
        tempKey = mapTwo.keySet().iterator().next();
        String stringTwo = tempKey + mapTwo.get(tempKey);
        return stringOne.compareTo(stringTwo);
    }
}