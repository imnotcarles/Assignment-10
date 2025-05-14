public enum SoccerPlayer {
    MESSI("Forward", "Argentina", 820, 350, 1000),
    RONALDO("Forward", "Portugal", 850, 280, 1100),
    NEYMAR("Forward", "Brazil", 450, 230, 600),
    MODRIC("Midfielder", "Croatia", 120, 150, 800),
    DE_BRUYNE("Midfielder", "Belgium", 150, 180, 700),
    KANTE("Midfielder", "France", 30, 70, 650),
    VAN_DIJK("Defender", "Netherlands", 40, 50, 500),
    DAVIES("Defender", "Canada", 25, 40, 250),
    COURTOIS("Goalkeeper", "Belgium", 0, 5, 600),
    DONNARUMMA("Goalkeeper", "Italy", 0, 3, 400);

    private String position;
    private String nationality;
    private int goals;
    private int assists;
    private int matchesPlayed;

    SoccerPlayer(String position, String nationality, int goals, int assists, int matchesPlayed) {
        this.position = position;
        this.nationality = nationality;
        this.goals = goals;
        this.assists = assists;
        this.matchesPlayed = matchesPlayed;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public double goalsPerMatch() {
        if (matchesPlayed == 0) {
            return 0;
        }
        return (double) goals / matchesPlayed;
    }

    public double assistsPerMatch() {
        if (matchesPlayed == 0) {
            return 0;
        }
        return (double) assists / matchesPlayed;
    }

    public int totalContributions() {
        return goals + assists;
    }

    public double contributionRate() {
        if (matchesPlayed == 0) {
            return 0;
        }
        return (double) totalContributions() / matchesPlayed;
    }

    public String getPlayerStats() {
        return name() +
                "\nNationality: " + getNationality() +
                "\nPosition: " + getPosition() +
                "\nGoals: " + getGoals() +
                "\nAssists: " + getAssists() +
                "\nMatches Played: " + getMatchesPlayed() +
                "\nGoals per Match: " + String.format("%.2f", goalsPerMatch()) +
                "\nAssists per Match: " + String.format("%.2f", assistsPerMatch()) +
                "\nContribution Rate: " + String.format("%.2f", contributionRate()) +
                "\nTotal Contributions: " + totalContributions();
    }
}