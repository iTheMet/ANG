package Game.visual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String fxmlFile = "/fxml/sample.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        primaryStage.setTitle("ЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТЭТОТЕСТ");
        primaryStage.setScene(new Scene(root, 800, 600));

        InputStream iconStream = getClass().getResourceAsStream("/images/rusticIcon.jpg");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);



        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
