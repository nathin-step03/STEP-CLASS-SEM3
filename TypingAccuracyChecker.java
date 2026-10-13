public class TypingAccuracyChecker {
    static void checkTypingAccuracy(String original, String typed) {
        int total = Math.min(original.length(), typed.length()), matched = 0, first = -1;
        for (int i=0; i<total; i++) { if (original.charAt(i)==typed.charAt(i)) matched++; else if(first==-1) first=i; }
        double accuracy = original.length()==0 ? 100.0 : matched * 100.0 / original.length();
        if (original.length()!=typed.length() && first==-1) first=total;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, original.length(), accuracy);
        if(first==-1 && original.length()==typed.length()) System.out.println(" | No Mismatches");
        else if(first<total) System.out.printf(" | First Mismatch at position %d ('%c' vs '%c')%n", first+1, original.charAt(first), typed.charAt(first));
        else System.out.printf(" | First Mismatch at position %d (length mismatch)%n", first+1);
    }
    public static void main(String[] args) { checkTypingAccuracy("hello world", "hello worlt"); }
}
