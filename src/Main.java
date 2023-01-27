public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(9874789));
    }

    static boolean isPalindrome(int a) {
        int reverseNum = 0, temp = a;
        while (temp != 0) {
            reverseNum = (reverseNum * 10) + temp % 10;
            temp /= 10;
        }
        return reverseNum == a;
    }
}