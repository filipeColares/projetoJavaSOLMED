/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import solmed.Modelo.Paciente;

/**
 *
 * @author Filipe Colares
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtSexo;
    @FXML
    private TextField txtNomeMae;
    @FXML
    private TextField txtDataNascimento;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnCadastra(ActionEvent cadPaciente){
        //cadastrarPaciente();
        Paciente p = new Paciente();
        
        p.setNome(txtNome.getText());
        p.setSexo(txtSexo.getText());
        p.setCpf(txtCpf.getText());
        p.setNomeDaMae(txtNomeMae.getText());
        p.setDataNascimento(txtDataNascimento.getText());
        
        System.out.println("solmed.FXMLDocumentController.cadastrarPaciente()");
        
        System.out.println(p.getCpf() + p.getNomeDaMae());
        
        p.toString();
    }
    
    public void cadastrarPaciente(){
        Paciente p = new Paciente();
        
        p.setNome(txtNome.getText());
        p.setSexo(txtSexo.getText());
        p.setCpf(txtCpf.getText());
        p.setNomeDaMae(txtNomeMae.getText());
        p.setDataNascimento(txtDataNascimento.getText());
        
        System.out.println("solmed.FXMLDocumentController.cadastrarPaciente()");
        
       X
        
        p.toString();
    }
}
