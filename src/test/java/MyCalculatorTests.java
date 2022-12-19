import org.example.MyCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.ConstructorParameters;

public class MyCalculatorTests {
    @Test
    public void FirstTest(){
        Assertions.assertTrue(true);
    }

    @Test
    public void AdditionTest(){
        int number1 = 5;
        int number2 = 2;
        MyCalculator calculator = new MyCalculator();
        String result = calculator.Addition(number1, number2);
        Assertions.assertEquals("7",result);
    }

    @Test
    public void SubstractionTest(){
        int number1 = 4;
        int number2 = 2;
        MyCalculator calculator = new MyCalculator();
        String result = calculator.Substraction(number1, number2);
        Assertions.assertEquals("2", result);
    }

    @Test
    public void MultiplicationTest(){
        int number1 = 4;
        int number2 = 2;
        MyCalculator calculator = new MyCalculator();
        String result =  calculator.Multiplication(number1, number2);
        Assertions.assertEquals("8", result);
    }

    @Test
    public void DivisionTest(){
        int number1 = 10;
        int number2 = 2;
        MyCalculator calculator = new MyCalculator();
        String result = calculator.Division(number1, number2);
        Assertions.assertEquals("5", result);
    }

    @Test
    public void DivisionTestByZero(){
        int number1 = 10;
        int number2 = 0;
        MyCalculator calculator = new MyCalculator();
        String result = calculator.Division(number1, number2);
        Assertions.assertEquals("Cannot divide by 0", result);
    }
}
