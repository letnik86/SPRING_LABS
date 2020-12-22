package Shapes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("coords")
@Scope("prototype")
public class Coords {
    @Value("#{T(java.lang.Math).random * 999}")
    private Float x;
    @Value("#{T(java.lang.Math).random * 999}")
    private Float y;

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
}
