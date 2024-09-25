package Day02;

public class Person {
    //fields
    private final String name;
    private final int age;
    //constructor method
    public Person(){
        this.name = "Unknown person";
        this.age = 0;
    }
    //methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    //Optional main method, which is a main execution entry point
    public static void main(String[] args){
        //Creating a new object that is an instance of the class Person
        Person p = new Person();
        //calling the method of p instance
        //in this case, name will be "Unknown person"
        String name = p.getName();
        //print name
        System.out.println(name);
    }
}
