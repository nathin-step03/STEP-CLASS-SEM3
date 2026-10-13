public class TrafficSignalStreakAnalyzer {
    static void findLongestStreak(String log) {
        if (log.isEmpty()) { System.out.println("No signal readings"); return; }
        char best=log.charAt(0), current=best; int run=1, max=1;
        for(int i=1;i<log.length();i++) { char c=log.charAt(i); if(c==current) run++; else {current=c;run=1;} if(run>max){max=run;best=current;} }
        System.out.printf("Longest Streak: '%c' repeated %d times%n",best,max);
    }
    public static void main(String[] args) { findLongestStreak("RRGGGYRR"); }
}
