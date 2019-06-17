
package view;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Israel
 */
public class Palco extends Application {
    
   static Stage palco;
   public static Scene sceneCadUser;
   public static Scene sceneVisualizarUser ;
   public static Scene cena;
    private static Scene atu;
    private static Scene exc;

  
    
    @Override
    public void start(Stage stage) throws IOException{
        palco = stage;
        //Carregar os FXMLs
        Parent user = FXMLLoader.load(getClass().getResource("FXMLPaginaInicial.fxml"));
        Parent cadUser = FXMLLoader.load(getClass().getResource("FXMLCadastroUser.fxml"));
        Parent visualizarUser = FXMLLoader.load(getClass().getResource("FXMLVisualisar.fxml"));
        //Crio as scenas com os fxmls
         cena = new Scene(user, 600, 600);
         sceneCadUser = new Scene(cadUser, 600, 600);
        sceneVisualizarUser = new Scene(visualizarUser, 600, 600);
        stage.setTitle("Tela Principal");
        stage.setScene(cena);
        stage.setResizable(true);
        stage.show();
    }

   

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void cadastroUser(){
        palco.setTitle("Cadastro de Usuário");
        palco.setScene(sceneCadUser);        
    }
    
    public static void mostrarUser(){
        palco.setTitle("Visualizar Usuários");
        palco.setScene(sceneVisualizarUser);
    }
    
    public static void telaPrincipal(){
        palco.setTitle("Tela Principal");
        palco.setScene(cena);
    }
    public static void atuUser(){
        palco.setScene(atu);
    }
    public static void excUser(){
        palco.setScene(exc);
    }
    
    
}
