package task1_CalculatorClient;

/**
 * Created by ASUS on 6.11.2016 г..
 */
public class Calculator {

    public int a;
    public int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int sum(int[] numbers) {
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }

        return sum;
    }

    int subtract(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {

            result = numbers[numbers.length - 1] - i;
        }
        return result;
    }

    double multiply(int[] numbers) {
        double multiplyNum = 0;
        for (Integer i : numbers) {
            multiplyNum *= i;
        }
        return multiplyNum;
    }

    double divide(int[] numbers) {
        double divideNum = 0;
        for (Integer i : numbers) {
            divideNum /= i;
        }
        return divideNum;
    }

    double percentage(int[] numbers) {
        double per = 0;
        for (int i = 0; i < numbers.length; i++) {

            per = numbers[numbers.length - 1] * 0.01 * i;
        }
        return per;

    }
}
 //   subtract(a, b)
  //  Изважда b от a
  //  multiply(a, b)
  //  Умножава две числа
//divide(a, b)
   // Разделя а с b
  //  percentage(a, b)
   // Изчислява b % от a
   //