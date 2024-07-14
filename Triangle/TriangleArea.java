package Triangle;

import java.util.Scanner;

public class TriangleArea {
    // Non-static method to get base and height
    public void getBaseAndHeight() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        computeTriangleArea(base, height);
        
     
       scanner.close();
    
    }


    // Non-static method
    private void computeTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        displayTriangleArea(area); 
    }

    // Non-static method
    private void displayTriangleArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        TriangleArea calculator = new TriangleArea();
        calculator.getBaseAndHeight();
    }
}
