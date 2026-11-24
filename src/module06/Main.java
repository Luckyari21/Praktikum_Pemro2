package module06;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        TableView<Student> table = new TableView<>();

        TableColumn<Student, String> nimColumn = new TableColumn<>("NIM");
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Student, String> nameColumn = new TableColumn<>("Nama");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        table.getColumns().add(nimColumn);
        table.getColumns().add(nameColumn);

        ObservableList<Student> students = FXCollections.observableArrayList(
                new Student(1, "John", "123"),
                new Student(2, "Jane", "124"),
                new Student(3, "Jono", "124123"),
                new Student(4, "Agus", "1241234"),
                new Student(5, "Budi", "2510817210017"),
                new Student(6, "Siti", "2610817320002"),
                new Student(7, "Dewi", "2410817220014"),
                new Student(8, "Rina", "2310817220028"),
                new Student(9, "Andi", "2310817210010"),
                new Student(10, "Lina", "2410817220006")
        );

        table.setItems(students);

        Scene scene = new Scene(table, 300, 450);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}