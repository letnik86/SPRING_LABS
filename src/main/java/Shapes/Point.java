package Shapes;

public class Point extends Shape{
    private Float x;
    private  Float y;

    public Point(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String draw(){
        return ("Точка с координатами X = " + x + "; Y = " + y + " нарисована!");
    }
}
