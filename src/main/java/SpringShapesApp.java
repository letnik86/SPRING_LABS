import Services.Scene;
import Shapes.Circle;
import Shapes.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * TODO: DAY2.1 - Make ap with annotations
 * TODO: DAY2.2 - Coords (x,y) - Prototype  Point coords  Circle centerCoords + R (Define baens for point and circle)
 */

@ComponentScan("./")
public class SpringShapesApp {
   public static void main(String args[]){
//       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       ApplicationContext context = new AnnotationConfigApplicationContext(SpringShapesApp.class);
       Scene scene = context.getBean(Scene.class);
       scene.draw();
   }
}
