package dani.java.controller;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Rectangle2D;
import javafx.scene.transform.Scale;
import javafx.stage.Screen;
import javafx.stage.Stage;
import dani.java.model.NucliFormatiu;
import dani.java.model.NuclisFormatius;
import dani.java.model.UnitatFormativa;
import dani.java.view.AplicationView;


public class Main extends Application {

	public static Stage stage;
	private double x = 1;

	@Override
	public void start(Stage primaryStage) {
		try {
			Screen screen = Screen.getPrimary();
			Rectangle2D rec = screen.getBounds();
			double h = rec.getHeight();
			double w = rec.getWidth();
			double ratio = w/h;
			
			stage = primaryStage;
			
			//creem dues UFs manualment i les inserim a l'objecte UnitatsFormatives
			UnitatFormativa uf1 = new UnitatFormativa();
			NuclisFormatius nfs = new NuclisFormatius();
			uf1.setNuclisFormatius(nfs);
			NucliFormatiu uf1nf1 = new NucliFormatiu();
			uf1nf1.setId("UF1NF1");
			uf1.setNom("Prog1");
			NucliFormatiu uf1nf2 = new NucliFormatiu();
			uf1nf2.setId("UF1NF2");
			uf1.getNuclisFormatius().getNucliFormatiu().add(uf1nf1);
			uf1.getNuclisFormatius().getNucliFormatiu().add(uf1nf2);
			AplicationView.ufs.getUnitatFormativa().add(uf1);
			AplicationView.uf = AplicationView.ufs.getUnitatFormativa().get(0);
			
			UnitatFormativa uf2 = new UnitatFormativa();
			NuclisFormatius nfs2 = new NuclisFormatius();
			uf2.setNuclisFormatius(nfs2);
			NucliFormatiu uf2nf1 = new NucliFormatiu();
			uf2nf1.setId("UF2NF1");
			uf2.setNom("BBDD");
			NucliFormatiu uf2nf2 = new NucliFormatiu();
			uf2nf2.setId("UF2NF2");
			uf2.getNuclisFormatius().getNucliFormatiu().add(uf2nf1);
			uf2.getNuclisFormatius().getNucliFormatiu().add(uf2nf2);
			
			// Per inserir una segona UF manualment, descomentar la següent linia.
			//AplicationView.ufs.getUnitatFormativa().add(uf2);
			
			stage.setWidth(711);
			stage.setHeight(400);
			stage.setMinWidth(711);
			stage.setMinHeight(400);
			stage.setScene(AplicationView.resumScene());
			stage.show();
			
			//codi per escalar el contingut d'una pantalla al maximitzar la finestra. Obsolet després d'inserir el listener per aumentar 
			//la finestra arrosegant un dels costats de la finestra
			
			/*stage.maximizedProperty().addListener(new ChangeListener<Boolean>() {
				public void changed(ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					if (t1) {
						x = 3;
					} else {
						x = x;
					}
					scale.setX(x);
					scale.setY(x);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			});*/
			
			//Aquests son els dos listeners que escalen el contingut al augmentar la mida de la finestra
			stage.widthProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(
						ObservableValue<? extends Number> observable,
						Number oldValue, Number newValue) {
					stage.setHeight(stage.getWidth()/ratio);
				}
			});
			stage.heightProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(
						ObservableValue<? extends Number> observable,
						Number oldValue, Number newValue) {
					stage.setWidth(stage.getHeight()*ratio);
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					x = x * (newValue.doubleValue()/oldValue.doubleValue());
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
