public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = a / b; // Division by zero error

        String greeting = "Hello, World!";
        printGreeting(greeting); 

        for (int i = 0; i <= 10; i++) { 
            System.out.println(i);
        }

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); 

        if (a > 5) { 
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is not greater than 5");
        }

        switch (a) { 
            case 1:
                System.out.println("a is 1");
                break;
            default:
                System.out.println("a is not 1");
        }

        try {
          
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }

      
        System.out.println("This line will not be executed");
    }

    public static void printGreeting(String greeting) {
        System.out.println("Printing greeting: " + greeting);
    }
}
