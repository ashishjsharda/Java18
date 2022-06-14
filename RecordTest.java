record Vehicle(int id,String name){}
record Person(String name ,int age){}

/**
 * Example using Records
 * @author ashish
 */
public class RecordTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle(100,"Toyota");
        System.out.println(vehicle.id());
        System.out.println(vehicle.name());
        Person person=new Person("Abhinav",35);
        System.out.println(person.age());
        System.out.println(person.name());
    }
}
