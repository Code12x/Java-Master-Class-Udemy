package xyz.code12.interfaceschallenge.marks;

public class Line extends Mark {
    private String utility;

    public Line(String label, String marker, String name, String utility) {
        super("LINE", label, marker, name);
        this.utility = utility;

        addJson(", \"utility\": \"" + getUtility() + "\"");
    }

    public String getUtility() {
        return this.utility;
    }
}
