/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXGUI;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class JavaFXApp2 extends Application{
    @FXML private ListView ListViewNames;
    @FXML private TextField textFieldName;
    @FXML private Button buttonUpdate;
    @FXML private void handleButtonUpdate(){
        
    }
    @FXML private void handleListViewNames(){
        textFieldName.setText((String)
                ListViewNames.getSelectionModel().getSelectedItem());
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().
                getResource("ListViewNames.fxml"));
        loader.setController(this);
        Parent parent = loader.load();
        ListViewNames.setItems(FXCollections.
                observableArrayList("Ahmad","Saed","Omar"));
        Scene scene = new Scene(parent, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
