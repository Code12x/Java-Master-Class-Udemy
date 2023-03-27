package xyz.code12.interfaceschallenge;

import xyz.code12.interfaceschallenge.marks.GeometryType;

public interface Mapable {
    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    GeometryType getType();

    String getLabel();

    String getMarker();

    default String toJSON() {
        String json = String.format(JSON_PROPERTY, "\"type\": \"" + getType() + "\"," +
                " \"label\": \"" + getLabel() + "\"," +
                " \"marker\": \"" + getMarker() + "\"%s");
        return json;
    }
}
