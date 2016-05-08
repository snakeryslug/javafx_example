package snakeryslug.javafx_spring_example;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import org.springframework.context.annotation.*;
import org.springframework.context.*;

public class SampleApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(SampleAppFactory.class);
        SpringFxmlLoader loader = new SpringFxmlLoader(context);
        Parent root = (Parent) loader.load("sample.fxml", SampleController.class);
        Scene scene = new Scene(root, 320, 240);
        //scene.getStylesheets().add("/fxmlapp.css");
        stage.setScene(scene);
        stage.setTitle("JFX2.0 Sprung");
        stage.show();
    }
}
