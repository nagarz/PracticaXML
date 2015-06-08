package dani.java.view;

import java.text.SimpleDateFormat;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Callback;
import dani.java.controller.Main;
import dani.java.model.NucliFormatiu;
import dani.java.model.UnitatFormativa;
import dani.java.model.UnitatsFormatives;

public class AplicationView {

	private static UnitatsFormatives ufs;
	private static UnitatFormativa uf;
	private static Stage stage = Main.stage;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static ObservableList<UnitatFormativa> ufList;
	private static ObservableList<NucliFormatiu> nfList;

	public static Scene resumScene() {
		GridPane gridPane = new GridPane();
		gridPane.setVgap(20);
		gridPane.setHgap(20);
		gridPane.setPadding(new Insets(20,20,20,20));
		Scene scene = new Scene(gridPane, 640, 400);

		Text titolText = new Text("PROGRAMACIÓ DE L'ÀULA");
		HBox hbox0 = new HBox();
		hbox0.getChildren().add(titolText);
		hbox0.setPadding(new Insets(0,200,0,200));
		gridPane.add(hbox0, 0, 0);
		GridPane.setColumnSpan(hbox0, 4);

		HBox navHbox = new HBox(15);
		gridPane.add(navHbox, 0, 1);

		Text resumText = new Text("Resum");
		Separator sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		navHbox.getChildren().addAll(resumText, sep);
		resumText.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				stage.setScene(resumScene());
				if (stage.isMaximized()) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					scale.setX(3);
					scale.setY(3);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			}
		});

		Text modulText = new Text("Mòdul");
		modulText.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				stage.setScene(modulScene());
				if (stage.isMaximized()) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					scale.setX(3);
					scale.setY(3);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			}
		});
		sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		navHbox.getChildren().addAll(modulText, sep);

		if (!(ufs == null)) {
			for (UnitatFormativa uf:ufs.getUnitatFormativa()) {
				Text newText = new Text(uf.getNom());
				sep = new Separator();
				sep.setOrientation(Orientation.VERTICAL);
				navHbox.getChildren().addAll(newText, sep);
				newText.setOnMouseClicked(new EventHandler<Event>() {

					@Override
					public void handle(Event event) {
						stage.setScene(ufScene(uf));
						if (stage.isMaximized()) {
							Scale scale = new Scale();
							scale.setPivotX(0);
							scale.setPivotY(0);
							scale.setX(3);
							scale.setY(3);
							stage.getScene().getRoot().getTransforms().setAll(scale);
						}
					}
				});
			}
		}

		Label famLabel = new Label("Família");
		gridPane.add(famLabel, 0, 2);

		TextField famTextField = new TextField();
		gridPane.add(famTextField, 1, 2);
		famTextField.setMaxWidth(200);

		Label cicleLabel = new Label("Cicle");
		gridPane.add(cicleLabel, 0, 3);

		TextField cicleTextField = new TextField();
		gridPane.add(cicleTextField, 1, 3);
		cicleTextField.setMaxWidth(200);

		Label tipusLabel = new Label("Tipus");
		gridPane.add(tipusLabel, 2, 3);

		TextField tipusTextField = new TextField();
		gridPane.add(tipusTextField, 3, 3);
		tipusTextField.setMaxWidth(200);

		Label mpLabel = new Label("Mòdul professional");
		gridPane.add(mpLabel, 0, 4);

		TextField mpTextField = new TextField();
		gridPane.add(mpTextField, 1, 4);
		mpTextField.setMaxWidth(200);

		Label codiLabel = new Label("Codi");
		gridPane.add(codiLabel, 2, 4);

		TextField codiTextField = new TextField();
		gridPane.add(codiTextField, 3, 4);
		codiTextField.setMaxWidth(200);

		Label titularLabel = new Label("Titular");
		gridPane.add(titularLabel, 0, 5);

		TextField titularTextField = new TextField();
		gridPane.add(titularTextField, 1, 5);
		titularTextField.setMaxWidth(200);

		Label carrecLabel = new Label("Càrrec");
		gridPane.add(carrecLabel, 2, 5);

		TextField carrecTextField = new TextField();
		gridPane.add(carrecTextField, 3, 5);
		carrecTextField.setMaxWidth(200);

		Label htLabel = new Label("Hores totals");
		gridPane.add(htLabel, 0, 6);

		TextField htTextField = new TextField();
		gridPane.add(htTextField, 1, 6);
		htTextField.setMaxWidth(200);

		Label horesLabel = new Label("H lliure disposició");
		gridPane.add(horesLabel, 2, 6);

		TextField horesTextField = new TextField();
		gridPane.add(horesTextField, 3, 6);
		horesTextField.setMaxWidth(200);

		Label pcLabel = new Label("Programació comuna");
		gridPane.add(pcLabel, 0, 7);

		TextField pcTextField = new TextField();
		gridPane.add(pcTextField, 1, 7);

		Label grupLabel = new Label("Grup");
		grupLabel.setMinWidth(50);
		TextField grupTextField = new TextField();
		grupTextField.setMaxWidth(100);
		Label tornLabel = new Label("Torn");
		tornLabel.setMinWidth(50);
		TextField tornTextField = new TextField();
		tornTextField.setMaxWidth(100);

		HBox hbox1 = new HBox(10);
		hbox1.getChildren().addAll(grupLabel, grupTextField, tornLabel, tornTextField);
		gridPane.add(hbox1, 2, 7);
		GridPane.setColumnSpan(hbox1, 2);		

		return scene;
	}

	@SuppressWarnings("unchecked")
	private static Scene modulScene() {
		GridPane gridPane = new GridPane();
		Scene scene = new Scene(gridPane, 640, 400);
		gridPane.setVgap(20);
		gridPane.setHgap(20);
		gridPane.setPadding(new Insets(20,20,20,20));

		Text titolText = new Text("RELACIÓ D'UNITATS FORMATIVES I MÒDULS FORMATIUS");
		HBox hbox0 = new HBox();
		hbox0.getChildren().add(titolText);
		hbox0.setPadding(new Insets(0,200,0,120));
		gridPane.add(hbox0, 0, 0);
		GridPane.setColumnSpan(hbox0, 4);

		HBox navHbox = new HBox(15);
		gridPane.add(navHbox, 0, 1);

		Text resumText = new Text("Resum");
		Separator sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		navHbox.getChildren().addAll(resumText, sep);
		resumText.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				stage.setScene(resumScene());
				if (stage.isMaximized()) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					scale.setX(3);
					scale.setY(3);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			}
		});

		Text modulText = new Text("Mòdul");
		modulText.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				stage.setScene(modulScene());
				if (stage.isMaximized()) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					scale.setX(3);
					scale.setY(3);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			}
		});
		sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		navHbox.getChildren().addAll(modulText, sep);

		if (!(ufs == null)) {
			for (UnitatFormativa uf:ufs.getUnitatFormativa()) {
				Text newText = new Text(uf.getNom());
				sep = new Separator();
				sep.setOrientation(Orientation.VERTICAL);
				navHbox.getChildren().addAll(newText, sep);
				newText.setOnMouseClicked(new EventHandler<Event>() {

					@Override
					public void handle(Event event) {
						stage.setScene(ufScene(uf));
						if (stage.isMaximized()) {
							Scale scale = new Scale();
							scale.setPivotX(0);
							scale.setPivotY(0);
							scale.setX(3);
							scale.setY(3);
							stage.getScene().getRoot().getTransforms().setAll(scale);
						}
					}
				});
			}
		}

		if (ufs != null) {
			for (UnitatFormativa uf:ufs.getUnitatFormativa()) {
				ufList.clear();
				ufList.add(uf);
			}
		}

		TableView<UnitatFormativa> tableUF = new TableView<UnitatFormativa>();
		tableUF.setItems(ufList);
		tableUF.setEditable(true);
		tableUF.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent x) {
                if (x.isPrimaryButtonDown()) {
                    uf = (UnitatFormativa) tableUF.getSelectionModel().getSelectedItem();
                    if (uf!=null) {
            			for (NucliFormatiu nf:uf.getNuclisFormatius().getNucliFormatiu()) {
            				nfList.clear();
            				nfList.add(nf);
            			}
            		}
                }
            }
        });

		TableColumn<UnitatFormativa, String> nomColumn = new TableColumn<>("Nom");
		nomColumn.setMinWidth(120);
		nomColumn.setMaxWidth(120);
		TableColumn<UnitatFormativa, String> horesColumn = new TableColumn<>("Hores");
		horesColumn.setMinWidth(110);
		horesColumn.setMaxWidth(110);
		TableColumn<UnitatFormativa, String> duradaColumn = new TableColumn<>("Durada");
		duradaColumn.setMinWidth(110);
		duradaColumn.setMaxWidth(110);
		TableColumn<UnitatFormativa, String> iniciColumn = new TableColumn<>("Data inici");
		iniciColumn.setMinWidth(120);
		iniciColumn.setMaxWidth(120);
		TableColumn<UnitatFormativa, String> fiColumn = new TableColumn<>("Data fi");
		fiColumn.setMinWidth(120);
		fiColumn.setMaxWidth(120);

		nomColumn.setCellValueFactory(new PropertyValueFactory<>("Nom"));
		horesColumn.setCellValueFactory(new Callback<CellDataFeatures<UnitatFormativa, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<UnitatFormativa, String> param) {
				if (param.getValue() != null) {
					return new SimpleObjectProperty<String>(param.getValue().getHores() + "h + " + param.getValue().getHoresLliureDisposicio() + "h");
				} else {
					return null;
				}
			}

		});
		duradaColumn.setCellValueFactory(new Callback<CellDataFeatures<UnitatFormativa, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<UnitatFormativa, String> param) {
				if (param.getValue() != null) {
					param.getValue().getHores().add(param.getValue().getHoresLliureDisposicio());
					return new SimpleObjectProperty<String>(param.getValue().getHores() + "h");
				} else {
					return null;
				}
			}
		});
		iniciColumn.setCellValueFactory(new Callback<CellDataFeatures<UnitatFormativa, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<UnitatFormativa, String> param) {
				if (param.getValue() != null) {
					return new SimpleObjectProperty<String>(sdf.format(param.getValue().getDataInici().toGregorianCalendar().getTime()));
				} else {
					return null;
				}
			}
		});
		fiColumn.setCellValueFactory(new Callback<CellDataFeatures<UnitatFormativa, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<UnitatFormativa, String> param) {
				if (param.getValue() != null) {
					return new SimpleObjectProperty<String>(sdf.format(param.getValue().getDataFinal().toGregorianCalendar().getTime()));
				} else {
					return null;
				}
			}
		});
		tableUF.getColumns().addAll(nomColumn, horesColumn, duradaColumn, iniciColumn, fiColumn);
		tableUF.setMinSize(580, 100);
		tableUF.setMaxSize(580, 100);
		gridPane.add(tableUF, 0, 2);

		if (uf!=null) {
			for (NucliFormatiu nf:uf.getNuclisFormatius().getNucliFormatiu()) {
				nfList.clear();
				nfList.add(nf);
			}
		}

		TableView<NucliFormatiu> tableNF = new TableView<NucliFormatiu>();
		tableNF.setItems(nfList);
		tableNF.setEditable(true);

		TableColumn<NucliFormatiu, String> nomNFColumn = new TableColumn<>("Nom");
		nomNFColumn.setMinWidth(120);
		nomNFColumn.setMaxWidth(120);
		TableColumn<NucliFormatiu, String> horesNFColumn = new TableColumn<>("Hores");
		horesNFColumn.setMinWidth(110);
		horesNFColumn.setMaxWidth(110);
		TableColumn<NucliFormatiu, String> duradaNFColumn = new TableColumn<>("Durada");
		duradaNFColumn.setMinWidth(110);
		duradaNFColumn.setMaxWidth(110);
		TableColumn<NucliFormatiu, String> iniciNFColumn = new TableColumn<>("Data inici");
		iniciNFColumn.setMinWidth(120);
		iniciNFColumn.setMaxWidth(120);
		TableColumn<NucliFormatiu, String> fiNFColumn = new TableColumn<>("Data fi");
		fiNFColumn.setMinWidth(120);
		fiNFColumn.setMaxWidth(120);

		nomNFColumn.setCellValueFactory(new PropertyValueFactory<>("Nom"));
		horesNFColumn.setCellValueFactory(new Callback<CellDataFeatures<NucliFormatiu, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<NucliFormatiu, String> param) {
				if (param.getValue() != null) {
					return new SimpleObjectProperty<String>(param.getValue().getHores() + "h + " + param.getValue().getHoresLliureDisposicio() + "h");
				} else {
					return null;
				}
			}

		});
		duradaNFColumn.setCellValueFactory(new Callback<CellDataFeatures<NucliFormatiu, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<NucliFormatiu, String> param) {
				if (param.getValue() != null) {
					param.getValue().getHores().add(param.getValue().getHoresLliureDisposicio());
					return new SimpleObjectProperty<String>(param.getValue().getHores() + "h");
				} else {
					return null;
				}
			}
		});
		iniciNFColumn.setCellValueFactory(new Callback<CellDataFeatures<NucliFormatiu, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<NucliFormatiu, String> param) {
				if (param.getValue() != null) {
					return new SimpleObjectProperty<String>(sdf.format(param.getValue().getDataInici().toGregorianCalendar().getTime()));
				} else {
					return null;
				}
			}
		});
		fiNFColumn.setCellValueFactory(new Callback<CellDataFeatures<NucliFormatiu, String>, ObservableValue<String>>(){

			@Override
			public ObservableValue<String> call(
					CellDataFeatures<NucliFormatiu, String> param) {
				if (param.getValue() != null) {
					return new SimpleObjectProperty<String>(sdf.format(param.getValue().getDataFinal().toGregorianCalendar().getTime()));
				} else {
					return null;
				}
			}
		});
		tableNF.getColumns().addAll(nomNFColumn, horesNFColumn, duradaNFColumn, iniciNFColumn, fiNFColumn);
		tableNF.setMinSize(580, 100);
		tableNF.setMaxSize(580, 100);
		gridPane.add(tableNF, 0, 3);

		return scene;
	}

	private static Scene ufScene(UnitatFormativa unitatFormativa) {
		GridPane gridPane = new GridPane();
		Scene scene = new Scene(gridPane, 640, 400);
		gridPane.setVgap(20);
		gridPane.setHgap(20);
		gridPane.setPadding(new Insets(20,20,20,20));

		Text titolText = new Text("UNITAT FORMATIVA X");
		HBox hbox0 = new HBox();
		hbox0.getChildren().add(titolText);
		hbox0.setPadding(new Insets(0,200,0,120));
		gridPane.add(hbox0, 0, 0);
		GridPane.setColumnSpan(hbox0, 4);
		
		HBox navHbox = new HBox(15);
		gridPane.add(navHbox, 0, 1);

		Text resumText = new Text("Resum");
		Separator sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		navHbox.getChildren().addAll(resumText, sep);
		resumText.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				stage.setScene(resumScene());
				if (stage.isMaximized()) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					scale.setX(3);
					scale.setY(3);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			}
		});

		Text modulText = new Text("Mòdul");
		modulText.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				stage.setScene(modulScene());
				if (stage.isMaximized()) {
					Scale scale = new Scale();
					scale.setPivotX(0);
					scale.setPivotY(0);
					scale.setX(3);
					scale.setY(3);
					stage.getScene().getRoot().getTransforms().setAll(scale);
				}
			}
		});
		sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		navHbox.getChildren().addAll(modulText, sep);

		if (!(ufs == null)) {
			for (UnitatFormativa uf:ufs.getUnitatFormativa()) {
				Text newText = new Text(uf.getNom());
				sep = new Separator();
				sep.setOrientation(Orientation.VERTICAL);
				navHbox.getChildren().addAll(newText, sep);
				newText.setOnMouseClicked(new EventHandler<Event>() {

					@Override
					public void handle(Event event) {
						stage.setScene(ufScene(uf));
						if (stage.isMaximized()) {
							Scale scale = new Scale();
							scale.setPivotX(0);
							scale.setPivotY(0);
							scale.setX(3);
							scale.setY(3);
							stage.getScene().getRoot().getTransforms().setAll(scale);
						}
					}
				});
			}
		}
		
		ComboBox<String> comboBox = new ComboBox<>();


		return scene;
	}
}
