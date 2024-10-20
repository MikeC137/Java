import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Stage stage = new Stage();

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("HIS A GEEK.png");

        stage.setTitle("Stage Demo Program");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        // stage.setResizable(false);
        // stage.setX(50);
        // stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE UNLESS YOU PRESS 'q'");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
