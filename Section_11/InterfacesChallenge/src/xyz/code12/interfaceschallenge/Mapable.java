package xyz.code12.interfaceschallenge;

public interface Mapable {
    String JSON_PROPERTY = """
            "properties": {%s}""";

    String getType();

    String getLabel();

    String getMarker();

    default String toJSON() {
        return String.format(JSON_PROPERTY, "\"type\": \"" + getType() + "\"," +
                " \"label\": \"" + getLabel() + "\"," +
                " \"marker\": \"" + getMarker() + "\"");
    }
}
