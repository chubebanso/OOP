import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NumberGrid extends Application {

    private Button[] btnNumbers = new Button[10];
    private Button btnDelete, btnReset;
    private TextField tfDisplay;

    @Override
    public void start(Stage primaryStage) {
        tfDisplay = new TextField();
        tfDisplay.setEditable(false);

        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(new Insets(10, 10, 10, 10));

        addButtons(grid);

        Scene scene = new Scene(grid, 200, 200);
        primaryStage.setTitle("JavaFX Number Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addButtons(GridPane grid) {
        for (int i = 1; i <= 9; i++) {
            btnNumbers[i] = new Button("" + i);
            grid.add(btnNumbers[i], (i - 1) % 3, (i - 1) / 3);
            int finalI = i;
            btnNumbers[i].setOnAction(e -> tfDisplay.setText(tfDisplay.getText() + finalI));
        }

        btnDelete = new Button("DEL");
        grid.add(btnDelete, 0, 3);
        btnDelete.setOnAction(e -> tfDisplay.setText(tfDisplay.getText().substring(0, tfDisplay.getText().length() - 1)));

        btnNumbers[0] = new Button("0");
        grid.add(btnNumbers[0], 1, 3);
        btnNumbers[0].setOnAction(e -> tfDisplay.setText(tfDisplay.getText() + "0"));

        btnReset = new Button("C");
        grid.add(btnReset, 2, 3);
        btnReset.setOnAction(e -> tfDisplay.setText(""));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
