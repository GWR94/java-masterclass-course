public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int drawn = 0;
    int lost = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            won++;
            message = " won against ";
        }
        else if(ourScore < theirScore) {
            lost++;
            message = " lost against ";
        }
        else {
            drawn++;
            message = " drew against ";
        }
        played++;
        if(opponent!=null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + drawn;
    }



    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        }
        else if(this.ranking() == team.ranking()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
