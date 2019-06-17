package view;

import dao.UserDAO;
import dao.Conexao;
import java.io.IOException;
import java.sql.Connection;
import model.User;



public class Main {
    public static void main(String[] args) throws IOException {        
        UserDAO ud = new UserDAO();
       
        ud.atualizar(6);
        ud.listarTodos();
        
       
    }    
}