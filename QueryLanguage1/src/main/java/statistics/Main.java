package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstatistics.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();

        Matcher m = query.oneOf(
                query.playsIn("PHI")
                .hasAtLeast(10, "goals")
                .not()
                .hasFewerThan(20, "assists").build(),
                query.playsIn("EDM")
                .hasAtLeast(50, "points").build()
        ).build();

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }
}
