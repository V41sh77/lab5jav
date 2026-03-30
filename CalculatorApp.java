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
        HBox buttonBox = new HBox();
        buttonBox.setSpacing(10);
        buttonBox.getChildren().addAll(addButton, subButton, mulButton, divButton);
        // Step 5: VBox main layout
        VBox mainLayout = new VBox();
        mainLayout.setSpacing(10);
        mainLayout.getChildren().addAll(textField1, textField2, buttonBox, resultLabel);
        // Step 6: Event handling for buttons
        addButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            } catch (Exception ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        subButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            } catch (Exception ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        mulButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = num1 * num2;
                resultLabel.setText("Result: " + result);
            } catch (Exception ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        divButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                if (num2 == 0) {
                    resultLabel.setText("Error: Division by zero");
                } else {
                    double result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                }
            } catch (Exception ex) {
                resultLabel.setText("Error: Invalid input");
            }
        });

        // Step 7: Create scene and show stage
       Scene scene = new Scene(mainLayout, 300, 200);
        primaryStage.setTitle("Calculator App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 