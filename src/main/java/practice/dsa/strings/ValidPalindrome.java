package practice.dsa.strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
    s = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
    int l = 0, r = s.length()-1;
    while(l <= r){
        if(s.charAt(l) != s.charAt(r)) return false;
        l++;
        r--;
    }
    return true;
}

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
