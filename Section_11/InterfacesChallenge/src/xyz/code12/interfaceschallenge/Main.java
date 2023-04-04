package xyz.code12.interfaceschallenge;

import xyz.code12.interfaceschallenge.markers.Colors;
import xyz.code12.interfaceschallenge.markers.Marker;
import xyz.code12.interfaceschallenge.markers.Shapes;
import xyz.code12.interfaceschallenge.marks.Point;

public class Main {
    public static void main(String[] args) {
        Point test = new Point("Sydney Town Hall (GOVERNMENT)", Marker.CreateMarker(Shapes.STAR, Colors.RED),
                "Sydney Town Hall", "GOVERNMENT");
        System.out.println(test.toJSON());
    }
}
