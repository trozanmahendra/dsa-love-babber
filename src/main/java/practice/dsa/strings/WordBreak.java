package practice.dsa.strings;

import java.util.Comparator;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {

        StringBuilder sb = new StringBuilder();
        wordDict = wordDict.stream().sorted(Comparator.comparing(String::length)).toList();
        for(String str:wordDict){
            sb.append(str);
        }
        String s2 = sb.toString();
        return (s.contains(s2) || s2.contains(s));
    }
}
