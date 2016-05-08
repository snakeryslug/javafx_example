package snakeryslug.javafx_spring_example;
import org.springframework.context.annotation.*;
// import java.beans.*;
// import java.beans.beancontext.*;

@Configuration
public class SampleAppFactory {

    @Bean
    public Person person() {
        return new Person("Richard");
    }

    @Bean
    public SampleController sampleController() {
        return new SampleController();
    }
}
