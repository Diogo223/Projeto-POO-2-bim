/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User;
import view.Palco;

/**
 * FXML Controller class
 *
 * @author 1º INF
 */
public class FXMLAtuUserController implements Initializable {
     @FXML
    private TextField Email;

    @FXML
    private TextField Telefone;

    @FXML
    private TextField Nome;
    User user = new User();
    private Palco palco;


  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public Palco getPalco() {
        
        return palco;
    }

    public void setPalco(Palco palco) {
        this.palco = palco;
    }

     @FXML
    void AtuUs() {
    }
   @FXML
    void canUs() {
    Palco.cadastroUser();
    }
     @FXML
    void Voltar() {
        Palco.mostrarUser();

    }

    void setStage() {
        Palco.atuUser();
    }
    
     @FXML
    void handleSalvar() {        
        user.setTel(Telefone.getText());
        user.setNome(Nome.getText());
        user.setEmail(Email.getText());
        
        
    }

    @FXML
    void handleCancelar() {
        Palco.cadastroUser();
    }
    
    public void setAluno(User user){
        this.user = user;
        Telefone.setText(String.valueOf(user.getTel()));
        Nome.setText(String.valueOf(user.getNome()));
        Nome.setText(String.valueOf(user.getNome()));
        
    }
}

