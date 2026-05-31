package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private RadioButton penRadioButton;

    @FXML
    private RadioButton eraserRadioButton;

    @FXML
    private ToggleGroup toolsToggleGroup;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle();
        newCircle.setCenterX(event.getX());
        newCircle.setCenterY(event.getY());
        
        // Kiểm tra chế độ được chọn từ ToggleGroup
        if (penRadioButton.isSelected()) {
            newCircle.setRadius(2); // Nét bút nhỏ
            newCircle.setFill(Color.BLACK); // Màu đen
        } else if (eraserRadioButton.isSelected()) {
            newCircle.setRadius(8); // Nét tẩy to hơn
            newCircle.setFill(Color.WHITE); // Tô đè màu trắng để xóa
        }
        
        drawingAreaPane.getChildren().add(newCircle);
    }
}