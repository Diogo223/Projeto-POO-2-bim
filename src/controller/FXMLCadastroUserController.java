/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.User;
import view.Palco;


public class FXMLCadastroUserController implements Initializable{

   @FXML
    private TextField txtTel;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtEmail;
    
    
      @FXML public void salvarUser() {
        salvar();
    }


   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

      @FXML
    public void salvar() {
         
         User user = new User();
         UserDAO ud = new UserDAO();
         user.setNome(txtNome.getText());
         user.setTel(txtTel.getText());
         user.setEmail(txtEmail.getText());
         
       ud.salvar(user);
       limpar();
         
         JOptionPane.showMessageDialog(null,"Cadastrado realizado com sucesso!");
    }    
     private void limpar() {
       txtTel.setText("");
       txtNome.setText("");
       txtEmail.setText("");
       
    }
    
   @FXML
     void Voltar(){
        Palco.telaPrincipal();
    }
    
    
}
