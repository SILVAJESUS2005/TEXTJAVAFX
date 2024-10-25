/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* Progrmacion orientada a objetos / Contabilidad y costos.
* TI302 
* Jesús López Silva.
* 24 DE OCTUBRE DEL 2024
* Table View Sample.
* jesuslopezsilva206@gmail.com - mariaisabelperezgarcia0991@gmail.com
 */
package TableView;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TableViewSample extends Application {
        private TableView table = new TableView(); //Crear dato vacio   
        
        public static void main(String[] args) {
        // TODO code application logic here
        launch(args);//Imprimir paneles
        
    }

    @Override
    public void start(Stage stage) throws Exception {//Stage
        Scene scene = new Scene( new Group());//Variable anonimas dentro de un espacio 
        stage.setTitle("Table View Sample");//Guardar titulo de la ventana
        stage.setWidth(300);//Dimensiones
        stage.setHeight(500);
        
        final Label label = new Label("Adress Book");//Texto
        label.setFont(new Font ("Arial", 20) );//Tipo de texto 
        table.setEditable(true);//creas tabla editable
        
        //Columnas de la tabla y como se llaman
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
 
        final VBox vbox = new VBox();//Tipo panel, agrega label como table
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        stage.setScene(scene); //Para guardar la celda que acabamos de crear
        stage.show(); //Para mostrar la stage generada.
    }
    
    
    
}
