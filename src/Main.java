public class Main {
    public static void main(String[] args) {
        //primitive data types
        int number = 10;
        int number2 = 20;
        double decimal = 10.5;
        char letter = 'A';
        boolean isTrue = true;
        String name = "John";
        //reference data types
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"John", "Jane", "Doe"};
        //operators
        int sum = number + number2;
        int difference = number - number2;
        int product = number * number2;
        int quotient = number / number2;
        int remainder = number % number2;
        //conditional statements
        if (number > number2) {
            System.out.println("Number is greater than number2");
        } else if (number < number2) {
            System.out.println("Number is less than number2");
        } else {
            System.out.println("Number is equal to number2");
        }
        //loops
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
        //functions
        System.out.println(add(10, 20));
        System.out.println(subtract(10, 20));
        System.out.println(multiply(10, 20));
        System.out.println(divide(10, 20));
        System.out.println(modulus(10, 20));
        //classes
        Person person = new Person("John", 30);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.setName("Jane");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
