public class TopPerformerTracker {
    static String findMinMaxSpread(int[] scores){int min=scores[0],max=scores[0];for(int x:scores){if(x<min)min=x;if(x>max)max=x;}return "Min: "+min+" | Max: "+max+" | Spread: "+(max-min);}
    public static void main(String[] args){System.out.println(findMinMaxSpread(new int[]{45,82,79,90,33,90,61}));}
}
