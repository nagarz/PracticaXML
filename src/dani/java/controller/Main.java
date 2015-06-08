package dani.java.controller;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import dani.java.view.AplicationView;


public class Main extends Application {

	public static Stage stage;
	private int x = 1;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			stage.setMinWidth(640);
			stage.setMinHeight(400);
			stage.setScene(AplicationView.resumScene());
			stage.show();
			stage.maximizedProperty().addListener(new ChangeListener<Boolean>() {
				public void changed(ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					if (t1) {
						x = 3;
					} else {
						x = 1;
					}
					scale.setX(x);
					scale.setY(x);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			});

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
