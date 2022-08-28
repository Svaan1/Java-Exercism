import java.util.stream.Collectors;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replace(" ","").replace("-","").toLowerCase();
        Set unique_letters = phrase.chars().boxed().collect(Collectors.toSet());
        return unique_letters.size() == phrase.length();
    }

}
