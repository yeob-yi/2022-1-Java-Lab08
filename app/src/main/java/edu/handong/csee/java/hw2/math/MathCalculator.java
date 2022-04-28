package edu.handong.csee.java.hw2.math;

/**
 * This is the MathCalculator class for my calculator.
 * There are several methods like getSum(), getDiff(), and etc.
 */
public class MathCalculator{
    private String name;

    /**
     * This is a setName method, which change the private variable name into input value.
     * @param name change name into input value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is a getName method, which returns value of the private variable, name.
     * @return value of name
     */
    public String getName(){
        return name;
    }

    /**
     * This is a getMax method, which returns the bigger value among two input value.
     * @param n1 int value
     * @param n2 int value
     * @return bigger value
     */
    public int getMax(int n1, int n2) {
        if (n1 > n2)
            return n1;
        return n2;
    }

    /**
     * This is a getMin method, which returns the smaller value among two input value.
     * @param n1 int value
     * @param n2 int value
     * @return smaller value
     */
    public int getMin(int n1, int n2) {
        if (n1 > n2)
            return n2;
        return n1;
    }

    /**
     * This is a getAbs method, which returns the Absolute value of input value.
     * @param num int value
     * @return the absolute value of input value
     */
    public int getAbs(int num) {
        int result = num;
        if(result < 0)
            result *= -1;
        return result;
    }

    /**
     * This is a getSum method, which returns the sum of two input value
     * @param n1 int value
     * @param n2 int value
     * @return Sum of two input value
     */
    public int getSum(int n1, int n2) {
        return n1+n2;
    }

    /**
     * This is a getDiff method, which returns the difference between two input value.
     * @param n1 int value
     * @param n2 int value
     * @return the difference between two input value
     */
    public int getDiff(int n1, int n2) {
        int result = n1-n2;
        return result;
    }

    /**
     * This is a getProduct method, which returns the product of two input value.
     * @param n1 int value
     * @param n2 int value
     * @return the product of two input value
     */
    public int getProduct(int n1, int n2) {
        return n1*n2;
    }

    /**
     * This is a getQuotient method, which returns the quotient of two input value.
     * @param n1 int value
     * @param n2 int value
     * @return the quotient of two input value
     */
    public int getQuotient(int n1, int n2) {
        int result = n1/n2;
        return result;
    }

    /**
     * This is getRemainder method, which returns the remainder of two input value.
     * @param n1 int value
     * @param n2 int value
     * @return the remainder of two input value
     */
    public int getRemainder(int n1, int n2) {
        int result = n1%n2;
        return result;
    }

    /**
     * This is getPower method, which returns the power of two input value.
     * @param n1 int value
     * @param n2 int value
     * @return the power of two input value
     */
    public int getPower(int n1, int n2) {
        int result = 1;
        for(int i=0; i<n2; i++){
            result *= n1;
        }
        return result;
    }

    /**
     * This is getFactorial method, which returns the factorial of input value.
     * @param num int value
     * @return factorial of input value
     */
    public int getFactorial(int num) {
        if(num == 0)
            return  1;
        else
            return num*getFactorial(num-1);
    }

    /**
     * This is getGcd method, which returns the greatest common divisor of two input value.
     * @param n1 int value
     * @param n2 int value
     * @return the greatest common divisor of two input value
     */
    public int getGcd(int n1, int n2) {
        int result = 1;
        int min = getMin(n1, n2);
        int temp = 1;
        while(temp <= min){
            if (n1 % temp == 0 && n2 % temp == 0)
                result = temp;
            temp ++;
        }
        return result;
    }

    /**
     * This is getLcm method, which returns the least common multiple of two input value
     * @param n1 int value
     * @param n2 int value
     * @return the least common multiple of two input value
     */
    public int getLcm(int n1, int n2) {
        int result = getMax(n1, n2);
        while(!(result%n1 == 0 && result%n2 == 0))
            result ++;
        return result;
    }

    /**
     * This is getSquare method, which returns the square of input value
     * @param num int value
     * @return the square of input value
     */
    public int getSquare(int num) {
        int result = num*num;
        return result;
    }

}