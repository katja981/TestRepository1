module dk.easv.testrepository1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.testrepository1 to javafx.fxml;
    exports dk.easv.testrepository1;
}