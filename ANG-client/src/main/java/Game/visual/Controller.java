package Game.visual;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Controller {

    boolean gate = false;
    int count = 0;

    @FXML
    private Button button;
    @FXML
    private Slider slider;
    @FXML
    private TextArea text;

    @FXML
    public void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button.setText("SOSI HHHAHAHAHHAHAH");
            }
        });

        slider.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!gate) {
                    button.setLayoutX(400);
                    gate = true;
                }else{
                    button.setLayoutX(0);
                    gate = false;
                }
                text.appendText("A");
                count+=1;
                if(count >= 10) {text.setWrapText(true); count = 0;}
            }
        });
    }

}
