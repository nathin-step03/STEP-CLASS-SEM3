import java.util.Arrays;
public class FantasyTeamScoreMultiplier {
    static void applyMultipliers(double[] playerScores,int captainIndex,int viceCaptainIndex){playerScores[captainIndex]*=2.0;playerScores[viceCaptainIndex]*=1.5;}
    public static void main(String[] args){double[] s={40,55,30,62};applyMultipliers(s,1,3);System.out.println(Arrays.toString(s));}
}
