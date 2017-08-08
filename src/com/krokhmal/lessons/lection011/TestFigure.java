package com.krokhmal.lessons.lection011;

import com.krokhmal.lessons.lection011.Circle;
import com.krokhmal.lessons.lection011.Figure;
import com.krokhmal.lessons.lection011.Square;

import java.awt.*;

public class TestFigure {
    public static void main(String[] argv) {

        Rectangle rectangle = new Rectangle(40, 20);
        Square square = new Square(20);


        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());
        System.out.println(square.getPerimeter());
        System.out.println(square.getSquare());

        Circle circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());

        Figure[] figures = {rectangle, square, circle};
        for (Figure figure: figures) {
            System.out.println(figure);
        }

        Figure figure = rectangle;

        System.out.println(figure);

        Rectangle r = (Rectangle) figure;
        System.out.println(r);

        System.out.println(r instanceof Figure);

        r = (Rectangle) square;
        Square s = (Square) r;

        System.out.println(s);
    }
}
