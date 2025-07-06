package practice.dsa.bit.manupulation;


public class IntToBinary {
    public static String toBinary(int num){
        StringBuilder bs = new StringBuilder();
        while(num > 0){
            bs.append(num % 2);
            num = num/2;
        }
        return bs.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toBinary(9555));
    }
}
