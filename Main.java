package sk.kosickaakademia.onofrej.projectmath;

public class Main {

    public static void main(String[] args) {
        Square stvorec1 = new Square(3);
        int result = stvorec1.calcPerimeter();
        System.out.println("Result: "+result);
    }
}
