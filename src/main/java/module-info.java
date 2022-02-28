module com.example.gsb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gsb to javafx.fxml;
    exports com.example.gsb;
}