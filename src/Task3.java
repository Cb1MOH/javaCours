public class Task3 {
    public static void main(String[] args) {

        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int days = d % 24;
        int w = (d - days) / 7;
        int week = w % 7;



//        System.out.println("s = " + s);
//        System.out.println("sec = " + sec);
//        System.out.println("m = " + m);
//        System.out.println("min = " + min);
//        System.out.println("h = " + h);
//        System.out.println("hour = " + hour);
//        System.out.println("d = " + d);
//        System.out.println("days = " + days);
//        System.out.println("w = " + w);
//        System.out.println("week = " + week);


        System.out.println("A) " + m + " минут " + sec + " секунд");
        System.out.println("B) " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println("C) " + d + " дней " + hour + " часов " + m + " минут " + sec + " секунд");
        System.out.println("D) " + w + " недель " + days + " дней " + hour + " часов " + m + " минут " + sec + " секунд");

    }


}
