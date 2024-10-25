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
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TableViewSample extends Application {

    final ObservableList<Person> data = FXCollections.observableArrayList(
            new Person("Jacob", "Smith", "jacob.smith@example.com"),
            new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Person("Ethan", "Williams", "ethan.williams@example.com"),
            new Person("Emma", "Jones", "emma.jones@example.com"),
            new Person("Michael", "Brown", "michael.brown@example.com")
    );
    private TableView table = new TableView(); //Crear dato vacio   

    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);//Imprimir paneles

    }

    @Override
    public void start(Stage stage) throws Exception {//Stage
         Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(500);
 
        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("lastName"));
 
        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("email"));
 
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
//        Scene scene = new Scene(new Group());//Variable anonimas dentro de un espacio 
//        stage.setTitle("Table View Sample");//Guardar titulo de la ventana
//        stage.setWidth(300);//Dimensiones
//        stage.setHeight(500);
//
//        final Label label = new Label("Adress Book");//Texto
//        label.setFont(new Font("Arial", 20));//Tipo de texto 
//        table.setEditable(true);//creas tabla editable
//
//        //Columnas de la tabla y como se llaman
//        TableColumn firstNameCol = new TableColumn("First Name");
//        TableColumn lastNameCol = new TableColumn("Last Name");
//        TableColumn emailCol = new TableColumn("Email");
//
//        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
//
//        final VBox vbox = new VBox();//Tipo panel, agrega label como table
//        vbox.setSpacing(5);
//        vbox.setPadding(new Insets(10, 0, 0, 10));
//        vbox.getChildren().addAll(label, table);
//
//        ((Group) scene.getRoot()).getChildren().addAll(vbox);
//        stage.setScene(scene); //Para guardar la celda que acabamos de crear
//        stage.show(); //Para mostrar la stage generada.
    }

    public static class Person {

        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;

        private Person(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }

        public String getFirstName() {
            return firstName.get();
        }

        public void setFirstName(String fName) {
            firstName.set(fName);
        }

        public String getLastName() {
            return lastName.get();
        }

        public void setLastName(String fName) {
            lastName.set(fName);
        }

        public String getEmail() {
            return email.get();
        }

        public void setEmail(String fName) {
            email.set(fName);
        }

    }

}
