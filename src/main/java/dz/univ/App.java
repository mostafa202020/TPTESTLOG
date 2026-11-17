
package dz.univ;

public class App {

    public  String getTypeTriangle(double a, double b, double c) {

        // Vérification des valeurs
        if (a <= 0 || b <= 0 || c <= 0) {
            return "BAD_INPUT";
        }

        // Vérification de l'existence du triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NOT_TRIANGLE";
        }

        // Classification du triangle
        if (a == b && b == c) {
            return "EQUILATERAL";
        }

        if (a == b || a == c || b == c) {
            return "ISOSCELES";
        }

        return "SCALENE";
    }

    public static void main(String[] args) {
        App app=new App();
     System.out.println(app.getTypeTriangle(5, 5, 5));
    System.out.println(app.getTypeTriangle(5, 5, 3));
    System.out.println(app.getTypeTriangle(3, 4, 5));
    System.out.println(app.getTypeTriangle(1, 2, 5));
   
}}
