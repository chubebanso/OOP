import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class StoreManagerScreen extends Application {

    private Store store;

    public StoreManagerScreen(Store store) {
        this.store = store;
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setTop(createNorth());
        root.setCenter(createCenter());

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();
    }

    private VBox createNorth() {
        VBox north = new VBox(10);
        north.getChildren().addAll(createMenuBar(), createHeader());
        return north;
    }

    private MenuBar createMenuBar() {
        Menu menu = new Menu("Options");
        menu.getItems().add(new MenuItem("View store"));

        Menu smUpdateStore = new Menu("Update Store");
        MenuItem addBookBtn = new MenuItem("Add Bookku");
        MenuItem addCDBtn = new MenuItem("Add CD");
        MenuItem addDiscBtn = new MenuItem("Add DVD");

        // Add action handlers for menu items here...

        smUpdateStore.getItems().addAll(addBookBtn, addCDBtn, addDiscBtn);
        menu.getItems().add(smUpdateStore);

        return new MenuBar(menu);
    }

    private VBox createHeader() {
        VBox header = new VBox(10);
        header.setPadding(new Insets(10));

        Label title = new Label("AIMS");
        title.setFont(Font.font(50));
        title.setTextFill(Color.CYAN);

        header.getChildren().add(title);
        return header;
    }

    private GridPane createCenter() {
        GridPane center = new GridPane();
        center.setHgap(2);
        center.setVgap(2);

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        int size = mediaInStore.size();
        for (int i = 0; i < Math.min(size, 9); i++) {
            JavaFXMediaStore cell = new JavaFXMediaStore(mediaInStore.get(i));
            center.add(cell, i % 3, i / 3);
        }

        return center;
    }

    public static void main(String[] args) {
        // Assuming you have a Store object to pass to the constructor
        Store store = new Store();
        new StoreManagerScreen(store).launch(args);
    }
}
