public class Dog {
    String name;
    String type;
    int speed;

    void run () {
        String showSpeed = "";
        for (int i = 1; i <= speed; i++) {
            if (i != speed) {
                showSpeed += "бегу, ";
            } else {
                showSpeed += "бегу...";
            }
        }
        System.out.println(showSpeed);
    }

    String info() {
        return "Имя собаки = " + name + " , порода собаки = " + type + " , скорость собаки = " + speed;
    }
 }
