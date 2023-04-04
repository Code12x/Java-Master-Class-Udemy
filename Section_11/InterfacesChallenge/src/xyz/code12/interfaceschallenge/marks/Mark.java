package xyz.code12.interfaceschallenge.marks;

import xyz.code12.interfaceschallenge.Mapable;

public abstract class Mark implements Mapable {
    private String type;
    private String label;
    private String marker;
    private String name;
    private String json;

    public Mark(String type, String label, String marker, String name) {
        this.type = type;
        this.label = label;
        this.marker = marker;
        this.name = name;

        json = "\"type\": \"" + getType() + "\"" +
                ", \"label\": \"" + getLabel() + "\"" +
                ", \"marker\": \"" + getMarker() + "\"" +
                ", \"name\": \"" + getName() + "\"";
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public String getMarker() {
        return this.marker;
    }

    public String getName() {
        return this.name;
    }

    public void addJson(String json) {
        this.json += json;
    }

    @Override
    public String toJSON() {
        return String.format(Mapable.JSON_PROPERTY, this.json);
    }
}
