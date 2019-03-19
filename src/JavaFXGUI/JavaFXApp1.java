/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXGUI;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class JavaFXApp1 extends Application{
    private ListView ListViewNames;
    private TextField TextFieldName;
    private javafx.scene.control.Button ButtonUpdate;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane = new FlowPane();
        ListViewNames = new ListView();
        ListViewNames.setMaxSize(200, 100);
        ListViewNames.setItems(FXCollections.
                observableArrayList("Ahmad","Saed","Omar"));
        EventHandler eventHandler = new EventHandler();
        ListViewNames.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        TextFieldName = new TextField("Initial Text");
        ButtonUpdate = new Button("Update");
        flowPane.getChildren().addAll(ListViewNames,
                TextFieldName,ButtonUpdate);
        Scene scene = new Scene(flowPane, 200 , 200);
        primaryStage.setScene(scene);
       primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
 private class EventHandler implements javafx.event.EventHandler<Event>{

        @Override
        public void handle(Event event) {
            if(event.getSource() == ListViewNames)
                TextFieldName.setText(
           (String) ListViewNames.getSelectionModel().getSelectedItem());
        }
     
 }
}
