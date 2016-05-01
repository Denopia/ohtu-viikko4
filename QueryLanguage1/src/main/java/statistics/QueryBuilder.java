package statistics;

import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Not;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;
import statistics.matcher.True;

class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        this.matcher = new True();
    }

    public QueryBuilder playsIn(String team) {
        this.matcher = new And(new PlaysIn(team), this.matcher);
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        this.matcher = new And(new HasFewerThan(value, category), this.matcher);
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        this.matcher = new And(new HasAtLeast(value, category), this.matcher);
        return this;
    }

    public QueryBuilder not() {
        this.matcher = new Not(this.matcher);
        return this;
    }

    public Matcher build() {
        Matcher m = this.matcher;
        this.matcher = new True();
        return m;
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new Or(matchers);
        return this;
    }

}
