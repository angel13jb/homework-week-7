package week7;

public class Wall {
    //class wall with two instance variable
    double width;
    double height;


    public Wall() {//constructor without parameters
    }

    public Wall(double width, double height) {//constructor with parameters
        this.width = width;
        this.height = height;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
    }

    public double getWidth() {//instance method no parameters with return value
        return width;
    }

    public double getHeight() {//instance method with return value
        return height;
    }

    public void setWidth(double width) {//instance method with parameters and set value
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {//instance method with parameters and set value
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {//instance method
        double area = height * width;//area statmment
        return area;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area=" + wall.getArea());//20

        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());//5
        System.out.println("height=" + wall.getHeight());//0
        System.out.println("area=" + wall.getArea());//0

    }


}
