package Shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Circle")
@Scope("prototype")
public class Circle implements Shape {

    private Float x;
    private Float y;
    @Value("5")
    private Float r;

    @Autowired
    public Circle(Coords centerCoords){
        this.x = centerCoords.getX();
        this.y = centerCoords.getY();
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

    public Float getR() {
        return r;
    }

    public void setR(Float r) {
        this.r = r;
    }
    @Override
    public String draw(){
        return ("Окружность с координатами X = " + x + "; Y = " + y + "; и радиусом R = " + r + " нарисована! " + this.toString());
    }
}
