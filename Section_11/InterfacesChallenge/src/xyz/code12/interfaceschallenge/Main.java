package xyz.code12.interfaceschallenge;

import xyz.code12.interfaceschallenge.markers.Colors;
import xyz.code12.interfaceschallenge.markers.Marker;
import xyz.code12.interfaceschallenge.markers.Shapes;
import xyz.code12.interfaceschallenge.marks.GeometryType;

public class Main {
    public static void main(String[] args) {
        Test test = new Test("White House", GeometryType.POINT, Marker.CreateMarker(Shapes.STAR, Colors.WHITE));
        System.out.println(test.toJSON());
    }
}
