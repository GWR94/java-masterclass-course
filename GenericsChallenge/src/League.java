import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    private String leagueName;
    private ArrayList<T> league = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public ArrayList<T> getLeague() {
        return league;
    }

    public boolean addTeam(T team) {
        if(league.contains(team)) {
            System.out.println(team.getName() + " is already in the league");
            return false;
        }
        else {
            league.add(team);
            System.out.println(team.getName() + " added to " + this.leagueName);
            return true;
        }
    }

    public void printLeagueTable() {
        ArrayList teamsToSort = this.getLeague();
        Collections.sort(teamsToSort);
        System.out.println("____________________");
        for(T t : league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
        System.out.println("____________________");

    }

}
