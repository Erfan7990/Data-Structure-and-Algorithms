public class SearchInString {
    public static void main(String[] args) {
        String name = "Erfan";
        char ch = 'a';

        System.out.println(linearSearch(name, ch));
    }

    static boolean linearSearch(String str, char value){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == value){
                return true;
            }
        }

        return false;
    }
}
