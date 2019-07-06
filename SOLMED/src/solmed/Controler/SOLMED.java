/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Controler;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Filipe Colares
 */
public class SOLMED extends Application {
    
    private static Stage st; 
    
    public static void trocaTela(String caminho){
        
        Parent root = null;
        
        try {
            root = FXMLLoader.load( SOLMED.class.getResource(caminho));//Contexto estático
        } catch (IOException ex) {
            System.out.println("ERRO AO CARREGAR O FXML");
            Logger.getLogger(SOLMED.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene scene = new Scene(root);
        
        st.setScene(scene);
        st.show();
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //Ponteiro | Atribuição da variável singleton ou seja da variavel de janela
        st = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    /*@Override
    public void start(Stage stage) throws Exception {
        
        System.out.println("parent root"); 
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        System.out.println("atx parent root"); 
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        launch(args);
    }*/
   
}
