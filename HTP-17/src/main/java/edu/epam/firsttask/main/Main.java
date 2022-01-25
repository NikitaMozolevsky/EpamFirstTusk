package edu.epam.firsttask.main;

import edu.epam.firsttask.object.Circle;
import edu.epam.firsttask.object.Point;
import edu.epam.firsttask.reader.StringFileName;
import edu.epam.firsttask.solution.Solution;
import edu.epam.firsttask.spliter.Spliter;
import edu.epam.firsttask.validator.Checker;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = StringFileName.reader();
        ArrayList<Double> doubles = Checker.validator(strings);
        double x = doubles.get(1);
        double y = doubles.get(2);
        double radius = doubles.get(0);
        Point point = new Point(x, y);
        Circle circle = new Circle(point, radius);
        Solution solution = new Solution();
        solution.circleArea(circle); //вычисление площади круга
        log.log(Level.INFO, "area = {} ;", solution.circleArea(circle));
        solution.circlePerimeter(circle); //вычисление периметра круга
        log.log(Level.INFO, "perimeter = {} ;", solution.circlePerimeter(circle));
        solution.intersectionOfCoordinateAxes(circle, point);
        log.log(Level.INFO, "result = {} ;", solution.intersectionOfCoordinateAxes(circle, point));
    }
}
