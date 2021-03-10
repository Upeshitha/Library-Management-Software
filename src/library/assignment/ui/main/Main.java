/**
* The className program implements an application that
* 
*
* @author  Eranda Upeshitha
* @version 1.0
* @since   Mar 10, 2021
*/

package library.assignment.ui.main;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import library.assignment.database.DatabaseHandler;


public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        DatabaseHandler.getInstance();
    }

    public static void main(String[] args) {
        launch(args);
    }

}