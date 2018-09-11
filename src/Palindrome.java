public class Palindrome {
    public static boolean isPalindrome(String str){
        if(str == null) {
            throw new IllegalArgumentException("Enter a valid string");
        }

        if(str.length() == 0 || str.length() == 1) {
            return true;
        }

        ArrayStack<Character> leftChars = new ArrayStack<Character>(str.length() / 2 + 1);
        int middleIndex = (str.length() - 1) / 2;
        for (int i = 0; i < middleIndex; i++) {
            leftChars.push(str.charAt(i));
        }

        if(str.length() % 2 == 0) {
            leftChars.push(str.charAt(middleIndex));
        }

        for (int i = middleIndex + 1; i < str.length(); i++) {
            if(leftChars.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(Palindrome.isPalindrome("radar"));
    }
}
