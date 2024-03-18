public class Main {
    public static void main(String[] args) {
        String s1 = "expErIence";
        String s2 = "En";
        
        String result = removeCharacters(s1, s2);
        
        System.out.println("Output: s1=\"" + result + "\"");
    }

    public static String removeCharacters(String s1, String s2) {
        String result = "";
        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += c;
            }
        }
        
        return result;
    }
}
