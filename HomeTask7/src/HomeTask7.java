//Задание 7
//        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.


public class HomeTask7 {
    public static void main(String[] args) {
        double sideA = 3;
        double sideB = 5;
        double radius = 6;
        double requiredRadius = Math.sqrt(((sideA * sideA) + (sideB * sideB)));
        if (radius >= requiredRadius) {
            System.out.println("Rectangle with side A with value " + sideA + " and side B with value " + sideB + " can be covered by circle with r = " + radius);
        } else {
            System.out.println("Rectangle with side A with value " + sideA + " and side B with value " + sideB + " can NOT be covered by circle with r = " + radius);
        }
    }
}

