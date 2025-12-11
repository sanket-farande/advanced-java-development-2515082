package _02_01.before;

import java.util.ArrayList;
import java.util.List; 
import java.awt.Rectangle;; 

public class GenericsExample {

    public static void main(String[] args) {

        // Generics - Type for list elements, RHS infer from LHS so no need to mention
        List <String> shapes = new ArrayList<>();
        shapes.add("Circle");

        // typecasting is needed without generics
        // String circle = (String) shapes.get(0);

        String circle = shapes.get(0);
        System.out.println(circle);

        shapes.add("Rectangle");
        System.out.println(shapes.get(1));

        // This throws err with generics
        // shapes.add(new Rectangle());
        // Integer circle = (Integer) shapes.get(1);

    }

}
