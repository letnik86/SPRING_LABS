package Shapes;

public class Circle extends Shape {
    private Float x;
    private Float y;
    private Float r;


    public Circle(Float x, Float y, Float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String draw(){
        return ("Окружность с координатами X = " + x + "; Y = " + y + "; и радиусом R = " + r + " нарисована!");
    }
}
