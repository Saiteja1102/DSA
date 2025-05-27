// Arithmetic operators - 2 types
// Binary - 2 operands
// unary - 1 operand

// Binary - add,sub,mul,divide,modulo

// unary - 2 types 
// Pre increment - ++a,--a
// Post increment - a++,a--

public class J01_ArithmeticOperators {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        System.out.println("Add = " + (A+B));
        System.out.println("Sub = " + (A-B));
        System.out.println("Mul = " + (A*B));
        System.out.println("Divide = " + (A/B));
        System.out.println("Modulo(remainder) = " + (A%B));

        // unary
        // Pre increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        // here first a will change and the value is given to b so (a = 11, b = 11)

        //Post increment
        int a1 = 10;
        int b1 = a1--;
        System.out.println(a1);
        System.out.println(b1);
        // here first a1 is given to b1 and then b1 is changed so (a1 = 9, b1 = 10)
    }
}
