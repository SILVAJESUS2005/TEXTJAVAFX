package textjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TEXTJAVAFX extends Application {

    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);//Imprimir paneles

    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Hello");//Creas un boton 
        StackPane root = new StackPane();//Creas el StackPane llamado root
        root.getChildren().add(button);//Agregas el boton al StackPane anteriormente creados 
        button.setOnAction(e -> {
            Alert alerta = new Alert(AlertType.INFORMATION, "Hola");
            alerta.showAndWait();
        });//Mostrar Informacion en un boton 
        Scene scene = new Scene(root, 300, 300); // Agrega el espacio para el StackPane del boton y sus dimensiones
        stage.setScene(scene);//Para guardar la celda que acabamos de crear
        stage.show(); //Para mostrar la stage generada con los cambios correspondientes
    }

}
