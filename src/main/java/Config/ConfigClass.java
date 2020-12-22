package Config;

import Services.Scene;
import Shapes.Circle;
import Shapes.Coords;
import Shapes.Point;
import Shapes.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class ConfigClass {

    @Bean("coords")
    @Scope("prototype")
    public Coords coords(){
        return new Coords();
    }

    @Bean("Circle")
    @Scope("prototype")
    @Autowired
    public Circle circle(Coords coords){
        return new Circle(coords);
    }

    @Bean("MyPoint")
    @Scope("singleton")
    @Autowired
    public Point point(Coords coords){
        return new Point(coords);
    }

    @Bean("listOfShapes")
    public ArrayList<Shape> listOfShapes() {
        ArrayList<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(circle(new Coords()));
        listOfShapes.add(circle(new Coords()));
        listOfShapes.add(circle(new Coords()));
        listOfShapes.add(point(new Coords()));
        listOfShapes.add(point(new Coords()));
        return listOfShapes;
    }

    @Bean("Scene")
    public Scene scene(){
        return new Scene();
    }

}
