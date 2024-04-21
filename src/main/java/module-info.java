module org.example.java_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.java_game to javafx.fxml;
    exports org.example.java_game;
}