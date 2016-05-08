package snakeryslug.javafx_spring_example;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleController
{
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void print() {
        System.out.println("Well done, " + person.getFirstName() + "!");
    }
}
