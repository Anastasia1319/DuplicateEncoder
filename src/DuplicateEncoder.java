public class DuplicateEncoder {
    public static String encode(String word) {
        word = word.toLowerCase();
        String result ="";
        for(int i = 0; i<word.length(); i++) {
            char c = word.charAt(i);
            result = result + (word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result;
    }
}
