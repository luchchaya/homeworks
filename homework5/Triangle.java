package homework5;

public class Triangle extends Figure{

    /*Создайте класс прямоугольных треугольников, описав в нём все необходимые 
    свойства, подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта 
    явно задать все его свойства. Если это необходимо, то проверьте 
    допустимость их значений в конструкторе (например, в классе обыкновенных
    дробей нельзя создавать дробь с нулевым знаменателем).
Создайте в классе метод, вычисляющий длину высоты, опущенной на гипотенузу.
С использованием построенного класса создайте треугольник с катетами 3 и 4.
    Вычилите с помощью метода и выведите на экран длину высоты опущенной
    на гипотенузу.
     */
    
    String name="right triangle";
    double leg1, leg2;

    Triangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            System.out.println("Error. Incorrect value of leg");
        }
        this.leg1 = a;
        this.leg2 = b;
    }

    double hypotenuse() {
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    double height() {
        return leg1 * leg2 / hypotenuse();
    }
}
