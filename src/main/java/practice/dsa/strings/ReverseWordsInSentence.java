package practice.dsa.strings;

public class ReverseWordsInSentence {
    public static String reverseWords(String s) {
        s = s.replaceAll(" {2}"," ");
        String[] strings = s.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for(int i = strings.length - 1; i >= 0; i--){
            String temp = strings[i].trim();
            if(!temp.isEmpty()) sBuilder.append(temp).append(" ");
        }
        return sBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Process   finished      with              exit code 0 "));
    }
}
