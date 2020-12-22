package Services;

import Shapes.Circle;
import Shapes.Coords;
import Shapes.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Scene {

    @Value("Красный")
    private String color;

    @Autowired
    @Qualifier("listOfShapes")
    private List<Shape> list;

    @Autowired
    private Shape Circle;

    @Autowired
    private Shape MyPoint;

    public Scene() {}

    public void draw()    {
        System.out.println("Цвет сцены - " + color);
        System.out.println(MyPoint.draw());
        System.out.println(MyPoint.draw());
        System.out.println(Circle.draw());
        System.out.println(Circle.draw());
        System.out.println("Конец Scene");
        System.out.println("Список содержит - " + list.toString());
    }

    public List<Shape> getList() {
        return list;
    }

    public void setList(List<Shape> list) {
        this.list = list;
    }

    public Shape getCircle() {
        return Circle;
    }

    public void setCircle(Shape circle) {
        Circle = circle;
    }

    public Shape getMyPoint() {
        return MyPoint;
    }

    public void setMyPoint(Shape myPoint) {
        MyPoint = myPoint;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
