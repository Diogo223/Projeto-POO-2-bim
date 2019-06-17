/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.User;
import view.Palco;

public class FXMLVisualisarController {

   @FXML
    private Button exc;
    @FXML
    private TableColumn<User, String> mail;
   @FXML
    private Button edit;
    @FXML
    private TableColumn<User, String> Telefone;
    @FXML
    private TableColumn<User, String> Nome;   
    @FXML
    private TableView<User> tabel;

        UserDAO ud = new UserDAO();
    private Object Controller;
    
    @FXML
    void Editar() {
   Palco.atuUser();
    }


    @FXML
    void Voltar() {
        Palco.telaPrincipal();
    }
    
  
    public void initialize(URL url, ResourceBundle rb) {
     mostrarUsers();
            
    }    
  
 
    private void limpar() {
       Nome.setText("");
       Telefone.setText("");
       mail.setText("");
       
    }
    @FXML
    void Excluir() {
        User user = new User();
        user = tabel.getSelectionModel().getSelectedItem();
        
        Palco.excUser();
        
        if(user != null){
            if(ud.deletar){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Usuário excluido com sucesso!");
                alert.setHeaderText("Exclusão");
                alert.setContentText("Excluido");
                alert.showAndWait();
                Palco.mostrarUser();
                
            }else{
                System.out.println("Ocorreu um erro durante a exclusão.");
                
            }
    }

   
   
    }
 private void mostrarUsers() {
        Telefone.setCellValueFactory(new PropertyValueFactory<>("Telefone"));
        Nome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        mail.setCellValueFactory(new PropertyValueFactory<>("E-mail"));
        tabel.setItems(listUsers());
    }
    

    private ObservableList<User> listUsers() {
        List<User> lista = ud.listarTodos();
        return (ObservableList<User>) lista;
    }

   
   
}