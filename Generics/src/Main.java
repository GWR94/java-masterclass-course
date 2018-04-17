import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AussieRulesPlayer bill = new AussieRulesPlayer("Bill");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        FootballPlayer lampard = new FootballPlayer("Lampard");

        Team<FootballPlayer> chelseaFC = new Team<>("Chelsea FC");
        //chelseaFC.addPlayer(bill);
        //chelseaFC.addPlayer(pat);
        chelseaFC.addPlayer(lampard);

        Team<AussieRulesPlayer> adelaide = new Team<>("Adelaide");

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<AussieRulesPlayer> melbourne = new Team<>("Melbourne");
        AussieRulesPlayer banks = new AussieRulesPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<AussieRulesPlayer> hawthorn = new Team<>("Hawthorn");
        Team<AussieRulesPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaide, 3, 8);

        System.out.println(hawthorn.compareTo(adelaide));
        System.out.println(adelaide.compareTo(melbourne));

    }
}
