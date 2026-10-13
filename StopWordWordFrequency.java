import java.util.*;
public class StopWordWordFrequency {
    static void report(String paragraph){Set<String> stop=Set.of("the","was","and","a","is","of","in");Map<String,Integer> freq=new LinkedHashMap<>();String clean=paragraph.toLowerCase().replaceAll("[.,!?;:]", " ").trim();if(clean.isEmpty())return;for(String word:clean.split("\\s+"))if(!stop.contains(word))freq.put(word,freq.getOrDefault(word,0)+1);for(var e:freq.entrySet())System.out.println(e.getKey()+": "+e.getValue());}
    public static void main(String[] args){report("The event was fun and the event is in the hall.");}
}
