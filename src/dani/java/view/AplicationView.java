package dani.java.view;

import java.io.File;

import dani.java.controller.XMLParser;
import dani.java.model.ProgramacioAula;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class AplicationView {
	
	private static ProgramacioAula programacioAula;

	public static Scene mainScene(){
		GridPane gridPane = new GridPane();
		Scene scene = new Scene(gridPane, 400, 300);
		
		Button button = new Button("Obrir");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				FileChooser fileChooser = new FileChooser();
				fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Arxius XML", "*.xml"));
				File file = fileChooser.showOpenDialog(scene.getWindow());
				programacioAula = XMLParser.readXML(file);
				System.out.println(programacioAula.getResum().getGrup());
			}
		});
		gridPane.add(button, 0, 0);
		
		return scene;
	}
	
}
