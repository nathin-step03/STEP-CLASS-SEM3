import java.util.*;
public class FantasyLeagueAutoDraftRankingEngine {
    static int[] rankPlayers(String[] names,int[] scores){Integer[] idx=new Integer[names.length];for(int i=0;i<idx.length;i++)idx[i]=i;Arrays.sort(idx,(a,b)->Integer.compare(scores[b],scores[a]));int[] ranking=new int[idx.length];for(int i=0;i<idx.length;i++){ranking[i]=idx[i];System.out.println((i+1)+". "+names[idx[i]]+" - "+scores[idx[i]]);}return ranking;}
    public static void main(String[] args){rankPlayers(new String[]{"A","B","C"},new int[]{40,90,65});}
}
