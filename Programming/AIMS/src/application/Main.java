package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
    
        Scene scene = new Scene(root, 1366, 786);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
}
}