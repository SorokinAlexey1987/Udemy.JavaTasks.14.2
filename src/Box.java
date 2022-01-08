public class Box {
    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }

    double volume() {
        return width * height * length;
    }

    void setDiemens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            //System.out.println("1>2");
            result = 1;
        } else if (thisVolume < boxVolume) {
            //System.out.println("1<2");
            result = -1;
        } else {
            //System.out.println("1=2");
            result = 0;
        }
        return result;
    }

    Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }
}