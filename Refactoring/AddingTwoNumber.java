package Refactoring;

public class AddingTwoNumber {

    
    public int addTwoNumbers(int firstNumber, int secondNumber) 
    {
        return firstNumber + secondNumber;
    }

    public void testAddTwoNumbers()
    {
      
        assert addTwoNumbers(10, 20) == 30 : "Test Case 1 Failed";

       
        
    }

    public static void main(String[] args) {
        AddingTwoNumber object = new AddingTwoNumber();

       
        int firstNumber = 10;
        int secondNumber = 20;
        int result = object.addTwoNumbers(firstNumber, secondNumber);

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + result);

        
        object.testAddTwoNumbers();
    }
}
