package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;


import model.User;

public class UserDAO {
    
    Connection con = null;
    public boolean deletar;
    //Método construtor
    public UserDAO(){
        con = Conexao.abrirConexao();
    }    
    public void salvar(User user){
        try {
            String sql = "INSERT INTO USER(TELEFONE, NOME, MAIL) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getTel());
            ps.setString(2, user.getNome());
            ps.setString(3, user.getEmail());
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            }
           
        } catch (Exception e) {
        }
    }
    
    public List<User> listarTodos(){        
        List<User> lista = new ArrayList<>();
        try {            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM USER");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setTel(rs.getString("Telefone"));
                user.setNome(rs.getString("Nome"));
                user.setEmail(rs.getString("E-mail"));
                lista.add(user);                
            }
            return lista;
        } catch (Exception e) {
        }
        return null;
    }
    
    public void atualizar(int telefone){
        try {
            User user = new User();
            String sql = "UPDATE USER SET NOME = ?, MAIL = ? WHERE TELEFONE = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getTel());
            ps.setString(2, user.getNome());
            ps.setString(3, user.getEmail());
            if(ps.executeUpdate() !=0){
                System.out.println("Dados alterados com sucesso");
            }
        } catch (Exception e) {
        }
    }

    public boolean deletar(int telefone) {
         try {
             
            String sql = "DELETE FROM USER WHERE NUMERO = '"+telefone+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
   
   
    
 }