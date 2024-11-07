package PPJ05;

public class Task02 {
    public static void main(String[] args) {
        Square square = new Square(6);
        System.out.println(square.show());
        System.out.println();
    }
}

class Square {
    private double side;

    public Square(int side) {
        this.side = side;
    }

    public String show() {
        double area = Math.pow(side, 2);
        double cubeVolume = Math.pow(side, 3);
        return "Square: " + '\n'
                + "side =" + side + '\n'
                + "area =" + area + '\n'
                + "cube volume =" + cubeVolume;
    }

    @Override
    public String toString() {
        return "Square: " + '\n'
                + "side =" + side;
    }
}