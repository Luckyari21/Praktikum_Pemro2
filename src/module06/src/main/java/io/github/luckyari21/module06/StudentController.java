package io.github.luckyari21.module06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> studentNameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        studentNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Luckya Ari Getsemane Simangunsong", "2510817310015"),
                new Student(2, "Mahou Sama", "9999999999999"),
                new Student(3, "Oni Chan", "2310817110001"),
                new Student(4, "Okaasan", "7210817120001"),
                new Student(5, "Joni", "2610817310099"),
                new Student(6, "Jerome Polin", "2010817110021"),
                new Student(7, "Glenn Julifer", "2210817310069"),
                new Student(8, "Raffa Azisha", "2510817210021"),
                new Student(9, "Nashry Akbar", "2510817210015"),
                new Student(10, "Muhammad Akmal Sulaiman", "2410817210007")
        );

        studentTable.setItems(studentList);
    }
}