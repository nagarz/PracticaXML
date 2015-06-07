package dani.java.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class AplicationView {

	public static Scene resumScene() {
		GridPane gridPane = new GridPane();
		Scene scene = new Scene(gridPane, 400, 300);
		
		HBox navHbox = new HBox(15);
		gridPane.add(navHbox, 0, 1);
		
		Text titulText = new Text("PROGRAMACIÓ DE L'LAULA");
		gridPane.add(titulText, 1, 0);
		GridPane.setColumnSpan(titulText, 2);
		
		Label famLabel = new Label("Família");
		gridPane.add(famLabel, 0, 2);
		
		Text famText = new Text();
		gridPane.add(famText, 1, 2);
		
		Label cicleLabel = new Label("Cicle");
		gridPane.add(cicleLabel, 0, 3);
		
		Text cicleText = new Text();
		gridPane.add(cicleText, 1, 3);
		
		Label tipusLabel = new Label("Tipus");
		gridPane.add(tipusLabel, 2, 3);
		
		Text tipusText = new Text();
		gridPane.add(tipusText, 3, 3);
		
		Label mpLabel = new Label("Mòdul professional");
		gridPane.add(mpLabel, 0, 4);
		
		Text mpText = new Text();
		gridPane.add(mpText, 1, 4);
		
		Label codiLabel = new Label("Codi");
		gridPane.add(codiLabel, 2, 4);
		
		Text codiText = new Text();
		gridPane.add(codiText, 3, 4);
		
		Label titularLabel = new Label("Titular");
		gridPane.add(titularLabel, 0, 5);
		
		Text titularText = new Text();
		gridPane.add(titularText, 1, 5);
		
		Label htLabel = new Label("Hores totals");
		gridPane.add(htLabel, 2, 5);
		
		Text htText = new Text();
		gridPane.add(htText, 3, 5);
		
		Label grupLabel = new Label("Grup");
		gridPane.add(grupLabel, 0, 6);
		
		Text grupText = new Text();
		gridPane.add(grupText, 1, 6);
		
		Label tornLabel = new Label("Torn");
		gridPane.add(tornLabel, 2, 6);
		
		Text tornText = new Text();
		gridPane.add(tornText, 3, 6);
		
		Label pcLabel = new Label("Programació comuna");
		gridPane.add(pcLabel, 0, 7);
		
		Text pcText = new Text();
		gridPane.add(pcText, 1, 7);
		
		Label horesLabel = new Label("Hores de lliure disposició");
		gridPane.add(horesLabel, 2, 7);
		
		Text horesText = new Text();
		gridPane.add(horesText, 3, 7);
				
		return scene;
	}
	
}
