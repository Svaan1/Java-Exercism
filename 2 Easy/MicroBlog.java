//The task is to truncate input strings (with unicode characters) to 5 characters.

import java.util.stream.IntStream;

class MicroBlog {
    public String truncate(String input) {
        IntStream stream = input.codePoints().limit(5);
        
        return stream.collect(
        StringBuilder::new,
        StringBuilder::appendCodePoint,
        StringBuilder::append).toString();
    }
}
