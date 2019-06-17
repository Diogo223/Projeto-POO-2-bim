/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javax.swing.JOptionPane;
import view.Palco;


public class FXMLPaginaInicialController implements Initializable {

 @FXML
    private MenuBar menuBar;

    @FXML
    private Menu cad;

    @FXML
   void cadUser() {
        Palco.cadastroUser();
    }

    @FXML
   void visuUser() {
        Palco.mostrarUser();
    }
@FXML
    void Sair() {
       
    }
   

   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
