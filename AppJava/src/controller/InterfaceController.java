package AppJava.src.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.Objects;


public class InterfaceController {

    @FXML
    private Label testeLabel;

    // Ainda não usado
    @FXML
    private VBox sidebar;


    private Stage stage;

    @FXML
    private Button btnMinimize;

    @FXML
    private Button btnClose;

    @FXML
    private BorderPane rootPane;

    // Ainda não usado
   // @FXML
   // private Button btnTela1;

    // Ainda não usado
    //@FXML
   // private Button btnTela2;

    // Método para inicializar a interface com o nome de usuário
    public void initializeInterface(String username) {
        testeLabel.setText("Olá, " + username);
    }

    // Método para fechar a janela
    @FXML
    private void handleClose() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }

    // Método para minimizar a janela
    @FXML
    private void handleMinimize() {
        Stage stage = (Stage) btnMinimize.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void loadTela1() throws IOException {
        // Carregar o FXML de Tela 1
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/AppJava/src/view/tela1.fxml"));
        loader1.setController(this);  // Garantir que o controlador está configurado corretamente
        Region tela1 = loader1.load();
        rootPane.setCenter(tela1);  // Substitui o conteúdo central
    }

    @FXML
    private void loadTela2() throws IOException {
        // Carregar o FXML de Tela 2
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/AppJava/src/view/tela2.fxml"));
        loader2.setController(this);  // Garantir que o controlador está configurado corretamente
        Region tela2 = loader2.load();
        rootPane.setCenter(tela2);  // Substitui o conteúdo central
    }

}
