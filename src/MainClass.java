/**
 * This class was created for learningn purposes.
 * Students will learn basics of GIT with it
 *
 * @author Alex Ryzhkov
 */

public class MainClass {




    public static void main(String[] args) {
        System.out.println("Hello calculator program");
        int sum = sum(1,2);
        int mmultiply = multiply(4,3);
        System.out.println("Sum is: " + sum + "; multiplication result is: " + mmultiply);


    }

    public static int sum(int i1, int i2){
        return i1 + i2;
    }

    public static int multiply(int i1, int i2) {
        return i1 * i2;
    }

    public static int substruct(int i1, int i2) {
        return i1 - i2;
    }

    public static int divide(int i1, int i2) {
        return i1 / i2;
    }

}
