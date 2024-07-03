class Complex {
    int real;
    int imag;

    // Default constructor
    Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // Parameterized constructor
    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    // Method to add two complex numbers
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    // Method to subtract two complex numbers
    public static Complex sub(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    // Method to multiply two complex numbers
    public static Complex multiply(Complex a, Complex b) {
        int realPart = a.real * b.real - a.imag * b.imag;
        int imagPart = a.real * b.imag + a.imag * b.real;
        return new Complex(realPart, imagPart);
    }

    // Method to print a complex number
    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else if (real == 0 && imag == 0) {
            System.out.println("0");
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

    public static void main(String[] args) {
        Complex a = new Complex(7, 8);
        Complex b = new Complex(5, 6);
        
        // Addition
        Complex resultAdd = Complex.add(a, b);
        System.out.print("Addition: ");
        resultAdd.printComplex();
        
        // Subtraction
        Complex resultSub = Complex.sub(a, b);
        System.out.print("Subtraction: ");
        resultSub.printComplex();
        
        // Multiplication
        Complex resultMul = Complex.multiply(a, b);
        System.out.print("Multiplication: ");
        resultMul.printComplex();
    }
}
