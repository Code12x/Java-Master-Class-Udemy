package xyz.code12.interfaceschallenge.marks;

public abstract class Poi extends Mark {

    private String usage;

    public Poi(GeometryType type, String label, String marker, String usage) {
        super(type, label, marker);
        this.usage = usage;
    }

    @Override
    public String toJSON() {
        return String.format(super.toJSON(), " usage: \"" + usage + "\"%s");
    }
}
