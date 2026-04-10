import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Parameterized constructor
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers returning a new Complex object
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading first complex number
        if (scanner.hasNextInt()) {
            int real1 = scanner.nextInt();
            int imag1 = scanner.nextInt();

            // Reading second complex number
            int real2 = scanner.nextInt();
            int imag2 = scanner.nextInt();

            // Create two Complex objects
            Complex c1 = new Complex(real1, imag1);
            Complex c2 = new Complex(real2, imag2);

            // Add them
            Complex sum = Complex.add(c1, c2);

            // Print result in "real + imagi" format
            System.out.println(sum.real + " + " + sum.imag + "i");
        }

        scanner.close();
    }
}
