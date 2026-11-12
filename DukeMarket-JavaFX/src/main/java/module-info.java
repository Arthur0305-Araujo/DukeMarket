module br.dev.arthur.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.dev.arthur.dukemarket.javafx to javafx.fxml;
    exports br.dev.arthur.dukemarket.javafx;
}
