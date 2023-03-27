package xyz.code12.interfaceschallenge.marks;

import xyz.code12.interfaceschallenge.Mapable;

public abstract class Mark implements Mapable {
    public GeometryType type;
    public String label;
    public String marker;

    public Mark(GeometryType type, String label, String marker) {
        this.type = type;
        this.label = label;
        this.marker = marker;
    }

    @Override
    public GeometryType getType() {
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
}
