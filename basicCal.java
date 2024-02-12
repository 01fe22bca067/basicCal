public class basicCal {
      float addition(float op1, float op2) {
            return (op1 + op2);
      }

      float subtraction(float op1, float op2) {
            return (op1 - op2);
      }

      float multiplication(float op1, float op2) {
            return (op1 * op2);
      }

      float division(float op1, float op2) {
            return (op1 / op2);
      }

      public static void main(String[] args) {
            float op1 = 10;
            float op2 = 5;
            basicCal cal = new basicCal();
            // The line `System.out.println(null);` is attempting to print the value `null`
            // to the console. However, since `null` is not a valid value to print, it will
            // result in a `NullPointerException` being thrown at runtime.
            System.out.println("Addition of two number : " + cal.addition(op1, op2));
            System.out.println("Substraction of two number : " + cal.subtraction(op1, op2));
            System.out.println("Multiplication of two number : " + cal.multiplication(op1, op2));
            System.out.println("Division of two number : " + cal.division(op1, op2));
            
      }
}