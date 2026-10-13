public class MatchDayGridAnalyzer {
    static int totalRuns(int[] match){int total=0;for(int x:match)total+=x;return total;}
    static void analyze(int[][] grid){for(int i=0;i<grid.length;i++){int total=totalRuns(grid[i]);System.out.println("Match "+(i+1)+": "+total+" runs"+(total>=50?" | Power Surge":""));}}
    public static void main(String[] args){analyze(new int[][]{{8,12,10,15,9},{4,5,3,7,6}});}
}
