public class Main {
    public static void main(String[] args) {
        //Box box1 = new Box(10, 10, 10);
        //Box box2 = new Box(15, 20, 25);
        Box box1 = new Box(10);
        Box box2 = new Box(box1);
        //box1.showVolume();
        //box2.showVolume();
        double volume1 = box1.volume();
        double volume2 = box2.volume();
        //System.out.println("Объем 1 = " + volume1);
        //System.out.println("Объем 2 = " + volume2);

        /*
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Барбос";
        dog1.type = "Дворняга";
        dog1.speed = 5;
        dog2.name = "Жучка";
        dog2.type = "Пудель";
        dog2.speed = 3;
        dog1.run();
        dog2.run();
        System.out.println(dog1.info());
        System.out.println(dog2.info());
        */

        int result = box1.compare(box2);
        switch (result) {
            case -1:
                System.out.println("1<2");
                break;
            case 0:
                System.out.println("1=2");
                break;
            case 1:
                System.out.println("1>2");
                break;
        }
    }
}
