package xyz.code12.interfaceschallenge;

import xyz.code12.interfaceschallenge.marks.GeometryType;

public class Test implements Mapable {
    private String label = "";
    private GeometryType geometryType = null;
    private String marker = "";

    public Test(String label, GeometryType geometryType, String marker) {
        this.label = label;
        this.geometryType = geometryType;
        this.marker = marker;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public GeometryType getType() {
        return this.geometryType;
    }

    @Override
    public String getMarker() {
        return this.marker;
    }
}
