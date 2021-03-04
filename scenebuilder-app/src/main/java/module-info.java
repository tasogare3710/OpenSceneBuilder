module scenebuilder.app {
    requires java.prefs;
    requires java.logging;
    requires javafx.base;
    requires javafx.fxml;
    requires transitive javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.web;
    requires javafx.swing;
    requires scenebuilder.kit;

    opens com.oracle.javafx.scenebuilder.app to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.about to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.info to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.menubar to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.message to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.preferences to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.selectionbar to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.skeleton to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.report to javafx.fxml;
    opens com.oracle.javafx.scenebuilder.app.template to javafx.fxml;

    exports com.oracle.javafx.scenebuilder.app;
    exports com.oracle.javafx.scenebuilder.app.about;
    exports com.oracle.javafx.scenebuilder.app.i18n;
    exports com.oracle.javafx.scenebuilder.app.info;
    exports com.oracle.javafx.scenebuilder.app.menubar;
    exports com.oracle.javafx.scenebuilder.app.message;
    exports com.oracle.javafx.scenebuilder.app.preferences;
    exports com.oracle.javafx.scenebuilder.app.preview;
    exports com.oracle.javafx.scenebuilder.app.report;
    exports com.oracle.javafx.scenebuilder.app.selectionbar;
    exports com.oracle.javafx.scenebuilder.app.skeleton;
    exports com.oracle.javafx.scenebuilder.app.template;
    exports com.oracle.javafx.scenebuilder.app.util;
}
