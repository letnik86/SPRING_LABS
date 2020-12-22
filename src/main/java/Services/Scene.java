package Services;

import Shapes.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scene {

    @Value("Красный")
    private String color;

    @Autowired
    private Shape Circle;

    @Autowired
    private Shape Point;

    public Scene() {}


    public void draw()    {
        System.out.println("Цвет сцены - " + color);
        System.out.println(Point.draw());
        System.out.println(Point.draw());
        System.out.println(Circle.draw());
        System.out.println(Circle.draw());
        System.out.println("Конец Scene");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
