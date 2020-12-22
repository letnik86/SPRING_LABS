package Shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Point")
@Scope("singleton")
public class Point implements Shape{


    private Float x;
    private Float y;

    @Autowired
    public Point(Coords coords) {
        this.x = coords.getX();
        this.y = coords.getY();
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    @Override
    public String draw(){
        return ("Точка с координатами X = " + x + "; Y = " + y + " нарисована! " + this.toString());
    }
}
