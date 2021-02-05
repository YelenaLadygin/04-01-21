package com.app.painter;
import com.app.shapes.Background;
import com.app.shapes.Circle;
import com.app.shapes.ShapesEnlarger;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( new Background(0.99f,"gold"),4.5 );
        circle.draw();
        ShapesEnlarger c = new ShapesEnlarger( );
        ShapesEnlarger.enlargeCircle(circle);
         circle.draw();
    }
}


package com.app.shapes;
public class Circle {
    Background background;
    private double radius;

    public Circle(Background background, double radius) {
        this.background = background;
        this.radius = radius;
    }
    public void circle (double _radius){
        radius = _radius;
        background = new Background(0.99f,"red" );
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return background.color;
    }
    void enlarge(double scale){
        radius= scale*radius;
    }
    public void draw(){
        System.out.println(String.format("Drawing the circle with %.2f radius in colors: %s", radius, background));
    }
}

package com.app.shapes;
public class Background {
     final float depth;
     final String color;

    public Background(float depth, String color) {
        this.depth = depth;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Background{" +
                "depth=" + depth +
                ", color='" + color + '\'' +
                '}';
    }
    
package com.app.shapes;
public class ShapesEnlarger {
    public static void enlargeCircle(Circle c) {
        c.enlarge(5.0);
    }
}
