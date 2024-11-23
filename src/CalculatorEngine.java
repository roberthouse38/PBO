class CalculatorEngine {
    int value;
    int keep;  // two calculator registers
    char toDo;
    boolean isComputed;  // flag to indicate if computation was done

    void binaryOperation(char op) {
        keep = value;   // keep first operand
        value = 0;      // initialize and get ready for second operand
        toDo = op;
        isComputed = false;  // reset the flag
    }

    // Set unary operation
    void unaryOperation(char op) {
        toDo = op;
        compute();
    }

    void add()      { binaryOperation('+'); }
    void subtract() { binaryOperation('-'); }
    void multiply() { binaryOperation('*'); }
    void divide()   { binaryOperation('/'); }
    void squareOf() { unaryOperation('s'); }
    void factorial() { unaryOperation('f'); }

    void compute() {
        if (toDo == '+') {
            value = keep + value;
        } else if (toDo == '-') {
            value = keep - value;
        } else if (toDo == '*') {
            value = keep * value;
        } else if (toDo == '/') {
            if (value != 0) {
                value = keep / value;
            } else {
                value = 0;  // Handle division by zero case
            }
        }
        // Unary operations
        else if (toDo == 's') {
            value = value * value;  // squareOf
        } else if (toDo == 'f') {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            value = result;  // factorial
        }
        keep = 0;
        isComputed = true;  // mark computation done
    }

    void clear() {
        value = 0;
        keep = 0;
        isComputed = false;
    }

    void digit(int x) {
        if (isComputed) {
            value = 0;  // reset value
            isComputed = false;
        }
        value = value * 10 + x;
    }

    int display() {
        return value;
    }

    CalculatorEngine() {
        clear();
    }

    public static void main(String arg[]) {
        CalculatorEngine c = new CalculatorEngine();
        // Test squareOf (5^2 = 25)
        c.digit(5);
        c.squareOf();
        System.out.println(c.display()); // Output: 25

        c.clear();
        // Test factorial (4! = 24)
        c.digit(4);
        c.factorial();
        System.out.println(c.display()); // Output: 24
    }
}
