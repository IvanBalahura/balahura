package lesson2;//Create a simple program that calculates and prints the square of a rectangle and a circle. Import and use Math class.

public class Task2 {
    public static void main(String args[])
    {
        double widtRectangle=5;// ширина прямоугольника
        double heightRectangle=10;// высота прямоугольника
        double areaRectangle=(widtRectangle*heightRectangle);// площадь прямоугольника
        System.out.println("Площадь прямоугольника="+areaRectangle);


        double radiusСircle = 3; // радиус круга

        double areaСircle = Math.PI * (radiusСircle * radiusСircle);
        areaСircle = Math.PI * (radiusСircle * radiusСircle);
        System.out.println("Площадь круга равна: " + areaСircle) ;

    }
}
