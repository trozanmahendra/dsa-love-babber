package practice.dsa.arrays;

public class ReverseArray {

    public static String reverseArray(String string){
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : chars){
            stringBuilder.insert(0, c);
        }
        string = stringBuilder.toString();
        return string;
    }
    public static void main(String[] args) {
        System.out.println(reverseArray("Mahendra"));
    }
}
