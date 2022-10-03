module com.silverlink.fxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.silverlink.fxpractice to javafx.fxml;
    exports com.silverlink.fxpractice;
}