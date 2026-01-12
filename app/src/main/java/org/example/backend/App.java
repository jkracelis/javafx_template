package org.example.backend;

import org.example.frontend.routes.MainView;
import com.dlsc.fxmlkit.fxml.FxmlKit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Enable hot reload (call BEFORE creating views)
        FxmlKit.enableDevelopmentMode();
        
        // Use the main layout with navigation
        MainView mainView = new MainView();
        Scene scene = new Scene(mainView, 1200, 800);

        stage.setTitle("javafx_template");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
