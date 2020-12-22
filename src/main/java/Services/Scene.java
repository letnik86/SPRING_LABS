package Services;

import Shapes.Shape;

import java.util.List;

public class Scene {
    private String color;

    public Scene(String color) {
        this.color = color;
    }

    private List<Shape> shapes;
    public void draw()    {
        System.out.println("Цвет сцены - " + color);
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
}
