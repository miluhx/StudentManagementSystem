module com.system.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.system.studentmanagementsystem to javafx.fxml;
    exports com.system.studentmanagementsystem;
}