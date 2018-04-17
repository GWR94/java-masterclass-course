public class Main {
    public static void main(String[] args) {

        League<Team<FootballPlayer>> bpl = new League<>("Barclays Premier League");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea FC");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal FC");
        Team<FootballPlayer> spurs = new Team<>("Tottenham FC");
        Team<FootballPlayer> westham = new Team<>("West Ham FC");
        Team<BaseballPlayer> baseballplayer = new Team<>("Baseball");
        bpl.addTeam(chelsea);
        bpl.addTeam(arsenal);
        bpl.addTeam(spurs);
        bpl.addTeam(westham);
//        bpl.addTeam(baseballplayer);     TEST FOR FAIL

        chelsea.matchResult(arsenal, 2, 1);
        chelsea.matchResult(spurs, 2,1);
        arsenal.matchResult(spurs, 2,2);
        westham.matchResult(arsenal, 1, 3);

        bpl.printLeagueTable();
    }
}
