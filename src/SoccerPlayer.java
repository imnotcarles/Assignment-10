public enum SoccerPlayer {
    MESSI("Forward", "Argentina", 820, 350, 1000, 10),
    RONALDO("Forward", "Portugal", 850, 280, 1100, 7),
    NEYMAR("Forward", "Brazil", 450, 230, 600, 11),
    MODRIC("Midfielder", "Croatia", 120, 150, 800, 10),
    DE_BRUYNE("Midfielder", "Belgium", 150, 180, 700, 17),
    KANTE("Midfielder", "France", 30, 70, 650, 13),
    VAN_DIJK("Defender", "Netherlands", 40, 50, 500, 4),
    DAVIES("Defender", "Canada", 25, 40, 250, 19),
    COURTOIS("Goalkeeper", "Belgium", 0, 5, 600, 1),
    DONNARUMMA("Goalkeeper", "Italy", 0, 3, 400, 99);

    private String position;
    private String nationality;
    private int goals;
    private int assists;
    private int matchesPlayed;
    private int jerseyNumber;

    SoccerPlayer(String position, String nationality, int goals, int assists, int matchesPlayed, int jerseyNumber) {
        this.position = position;
        this.nationality = nationality;
        this.goals = goals;
        this.assists = assists;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
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

    public int getJerseyNumber() {
        return jerseyNumber;
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
        return name() + " (" + nationality + ") - " + position + ", #" + jerseyNumber +
                "\n   Goals: " + goals +
                ", Assists: " + assists +
                ", Matches: " + matchesPlayed +
                "\n   Goals/Match: " + String.format("%.2f", goalsPerMatch()) +
                ", Contribution Rate: " + String.format("%.2f", contributionRate()) +
                ", Total Contributions: " + totalContributions();
    }
}