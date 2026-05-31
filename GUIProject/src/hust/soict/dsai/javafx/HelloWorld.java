package hust.soict.dsai.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Tạo một nút bấm
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        // Bắt sự kiện khi click vào nút
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        // Xếp nút bấm vào giữa màn hình bằng StackPane
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        // Tạo khung cảnh (Scene) kích thước 300x250
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show(); // Hiển thị cửa sổ
    }

    public static void main(String[] args) {
        launch(args);
    }
}