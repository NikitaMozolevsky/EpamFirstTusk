package edu.epam.firsttask.solution;

import edu.epam.firsttask.object.Circle;
import edu.epam.firsttask.object.Point;
import edu.epam.firsttask.object.Shape;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Solution {

    private static final Logger log = LogManager.getLogger();

    public Double circleArea (Circle circle) {
        return Math.pow(circle.getRadius(), 2)*Math.PI;//2 - возведение в квадрат
        /*return 3.14*(doubles[0]*doubles[0]);*/
    }

    public Double circlePerimeter (Circle circle) {
        return circle.getRadius()*2*Math.PI;
        /*return 3.14*2*doubles[0];*/
    }

    public String intersectionOfCoordinateAxes (Circle circle, Point point) {
        String result;
        boolean xAxisCrossing = Math.abs(point.getX())<circle.getRadius();
        boolean yAxisCrossing = Math.abs(point.getY())<circle.getRadius();
        if (xAxisCrossing&&yAxisCrossing) {
            result = "X and Y axes intersect";
        }
        else if (xAxisCrossing) {
            result = "X-axis intersects";
        }
        else if (yAxisCrossing) {
            result = "Y-axis intersects";
        }
        else {
            result = "the circle does not intersect the axis";
        }
        return result;
    }

}
