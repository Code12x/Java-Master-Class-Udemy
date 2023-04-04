package xyz.code12.interfaceschallenge.marks;

public class Point extends Mark{
    private String usage;

    public Point(String label, String marker, String name, String usage) {
        super("POINT", label, marker, name);
        this.usage = usage;

        addJson(", \"usage\": \"" + getUsage() + "\"");
    }

    public String getUsage() {
        return this.usage;
    }
}
