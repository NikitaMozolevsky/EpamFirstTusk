package edu.epam.firsttask.solution;

import edu.epam.firsttask.object.Circle;
import edu.epam.firsttask.object.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();
    Point point = new Point(10.0, 4.0);
    Circle circle = new Circle(point, 10.0);
    String result = "X and Y axes intersect";

    @Test
    public void circleAreaTest() {
        double actual = solution.circleArea(circle);
        double expected = 314.1592653589793;
        assertEquals(expected, actual);
    }

    @Test
    public void circlePerimeterTest() {
        double actual = solution.circlePerimeter(circle);
        double expected = 62.83185307179586;
        assertEquals(expected, actual);
    }

    @Test
    public void intersectionOfCoordinateAxesTest() {
        String actual = solution.intersectionOfCoordinateAxes(circle, point);
        String expected = result;
        assertEquals(actual, expected);
    }
}