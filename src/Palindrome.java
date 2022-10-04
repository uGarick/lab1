public class Palindrome {
    public static void main(String[] args) {
        for (int i=0; i < args.length; i++) {
            String str = args[i].toLowerCase();
            System.out.println(isPalindrome(str));
        }
    }

    //метод создает обратное слово
    public static String reverseString(String str) {
        char[] strchar = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i=str.length()-1; i>=0; i--) {
            result.append(strchar[i]);
        }
        return result.toString();
    }

    //метод проверяет на палиндром полученное слово
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}
