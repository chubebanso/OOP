import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AWTAXAccumulator extends Application {

    private TextField tfInput; 
    private TextField tfOutput;
    private int sum = 0;

    @Override
    public void start(Stage primaryStage) {
        tfInput = new TextField();
        tfOutput = new TextField();
        tfOutput.setEditable(false);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(String.valueOf(sum));
        });

        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.add(new Label("Enter an Integer"), 0, 0);
        grid.add(tfInput, 1, 0);
        grid.add(new Label("The Accumulated Sum is:"), 0, 1);
        grid.add(tfOutput, 1, 1);
        grid.add(submitButton, 1, 2);

        Scene scene = new Scene(grid, 350, 120);
        primaryStage.setTitle("JavaFX Accumulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
