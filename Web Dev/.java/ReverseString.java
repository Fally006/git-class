public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String reversedString = reverseString(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}