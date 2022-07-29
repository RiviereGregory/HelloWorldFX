module gri.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens gri.helloworldfx to javafx.fxml;
    exports gri.helloworldfx;
}