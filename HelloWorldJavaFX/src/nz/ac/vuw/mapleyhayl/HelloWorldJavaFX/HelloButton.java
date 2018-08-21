package nz.ac.vuw.mapleyhayl.HelloWorldJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;
import javafx.stage.Stage;

public class HelloButton extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello Button");
		
		final Text text = new Text();
		text.setText("No-one has been greeted");
		
		Button btn = new Button();
		btn.setText("Greet you");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			int n = 0;
			public void handle(ActionEvent event) {
				n++;
				text.setText("Hello there! Said " + n + " time(s)");
			}
		});
		
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(5,0,5,0));
		pane.setVgap(4);
		pane.setHgap(4);
		pane.setPrefWrapLength(170);
		pane.setStyle("-fx-background-color: DAE6F3;");
		
		pane.setAlignment(Pos.BASELINE_LEFT);
		pane.getChildren().addAll(btn, text);
		
		primaryStage.setScene(new Scene(pane,300,250));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args); //calls the JavaFX Application constructor
	}

}
