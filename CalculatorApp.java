// vasihnav vijayan
//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        textField1.setPromptText("Enter first number");
        textField2.setPromptText("Enter second number");
 
        // Step 2: Create Buttons for operations
        Button addButton = new Button("+");
        Button subButton = new Button("-");
        Button mulButton = new Button("*");
        Button divButton = new Button("/");

 
        // Step 3: Create Label for result
       Label resultLabel = new Label("Result: ");
        // Step 4: HBox for buttons
       
        // Step 5: VBox main layout
       
        // Step 6: Event handling for buttons
       
        // Step 7: Create scene and show stage
       
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 