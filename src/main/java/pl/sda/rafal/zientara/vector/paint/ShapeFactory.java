package pl.sda.rafal.zientara.vector.paint;

import pl.sda.rafal.zientara.vector.paint.shapes.Line;
import pl.sda.rafal.zientara.vector.paint.shapes.Rectangle;
import pl.sda.rafal.zientara.vector.paint.shapes.Shape;
import pl.sda.rafal.zientara.vector.paint.shapes.Triangle;

public class ShapeFactory {
    public Shape get(String string) {
        String[] data = string.split(";");
        String shapeName = data[0].toLowerCase();
        
        switch (shapeName) {
            case "line":
                return getLine(data);
            case "rectangle":
                return getRect(data);
            case "triangle":
                return getTria(data);
        }
        
        return null;
    }

    private Shape getLine(String[] data) {
        //Line;144.0;258.0;334.0;182.0;0xffc0cbff;0xd2691eff;
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Line.Builder builder = new Line.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getRect(String[] data) {
        //Rectangle;144.0;258.0;334.0;182.0;0xffc0cbff;0xd2691eff;
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Rectangle.Builder builder = new Rectangle.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getTria(String[] data) {
        //Triangle;142.0;84.0;311.0;84.0;226.5;72.0;0xffc0cbff;0xd2691eff;
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        double x3 = Double.parseDouble(data[5]);
        double y3 = Double.parseDouble(data[6]);
        String fillColor = data[7];
        String strokeColor = data[8];

        Triangle.Builder builder = new Triangle.Builder()
                .setPoint1(x1, y1)
                .setPoint2(x2, y2)
                .setPoint3(x3, y3)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }
}
