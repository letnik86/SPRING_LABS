import Services.Scene;
import Shapes.Circle;
import Shapes.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * TODO: DAY2.1 - Make ap with annotations
 * TODO: DAY2.2 - Coords (x,y) - Prototype  Point coords  Circle centerCoords + R (Define baens for point and circle)
 */

public class SpringShapesApp {
   public static void main(String args[]){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       Scene scene = context.getBean("Scene", Scene.class);
       scene.draw();
   }
}
