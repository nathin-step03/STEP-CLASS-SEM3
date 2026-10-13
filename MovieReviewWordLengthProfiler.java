public class MovieReviewWordLengthProfiler {
    static void classifyWordLengths(String review) {
        String cleaned=review.trim(); if(cleaned.isEmpty()){System.out.println("No words");return;}
        String[] words=cleaned.split("\\s+"); int shortWords=0,medium=0,longWords=0;
        for(String word:words){String w=word.replaceAll("^[^\\p{L}]+|[^\\p{L}]+$","");int n=w.length();if(n==0)continue;if(n<=3)shortWords++;else if(n<=6)medium++;else longWords++;}
        System.out.printf("Short (1-3): %d | Medium (4-6): %d | Long (7+): %d%n",shortWords,medium,longWords);
    }
    public static void main(String[] args){classifyWordLengths("A wonderful movie with great acting");}
}
