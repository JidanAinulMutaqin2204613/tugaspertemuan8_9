package soal1;

/**
 *
 * @author Jidan Ainul Mutaqin
 */
public class Segitiga extends ObjekGeometris {
    private double side1;
    private double side2;
    private double side3;

    // Konstruktor tanpa argumen yang membuat segitiga default
    public Segitiga() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Konstruktor dengan parameter
    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method pengakses untuk side1
    public double getSide1() {
        return side1;
    }

    // Method pengakses untuk side2
    public double getSide2() {
        return side2;
    }

    // Method pengakses untuk side3
    public double getSide3() {
        return side3;
    }

    // Method untuk menghitung luas segitiga
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method untuk menghitung keliling segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Method toString untuk deskripsi segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}


