package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Alba", new Date(102,5,26));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
