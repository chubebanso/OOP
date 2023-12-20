import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Media extends VBox {

    private Media media;

    public JavaFXMediaStore(Media media) {
        this.media = media;
        setAlignment(Pos.CENTER);
        setSpacing(10);

        Label title = new Label(media.getTitle());
        title.setFont(new Font(15));

        Label cost = new Label(media.getCost() + " $");

        VBox container = new VBox(10);
        container.setAlignment(Pos.CENTER);
        if (media instanceof Playable) {
            Button playButton = new Button("Play");
            container.getChildren().add(playButton);
        }

        getChildren().addAll(title, cost, container);
        setStyle("-fx-border-color: black;");
    }
}
