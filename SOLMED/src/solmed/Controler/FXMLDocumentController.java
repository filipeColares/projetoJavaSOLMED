/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Controler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import solmed.Modelo.Paciente;

/**
 *
 * @author Filipe Colares
 */
public class FXMLDocumentController implements Initializable {
   
     private ObservableList listaPaciente;
    
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
    @FXML
    private TableView<Paciente> tabelaPaciente;
    @FXML
    private TableColumn<?, ?> cCodigo;
    @FXML
    private TableColumn<?, ?> cNome;
    @FXML
    private TableColumn<?, ?> cDataNascimento;
    @FXML
    private TableColumn<?, ?> cCpf;
    @FXML
    private Button btnDeleta;
    @FXML
    private Button btnSalvar;
    @FXML
    private TableColumn<?, ?> cNomeMae;
    @FXML
    private Button btnCadastrar;
   
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // consultarPaciente();
       
       listaPaciente = tabelaPaciente.getItems();
        
        cCodigo.setCellValueFactory(new PropertyValueFactory("id"));
        cNome.setCellValueFactory(new PropertyValueFactory("nome"));
        cDataNascimento.setCellValueFactory(new PropertyValueFactory("dataNascimento"));
        cCpf.setCellValueFactory(new PropertyValueFactory("cpf"));
        cNomeMae.setCellValueFactory(new PropertyValueFactory("nomeDaMae"));
        
        for (Paciente p: Paciente.consultarPacientes()){
            listaPaciente.add(p);
           
        }
        int n = listaPaciente.size();
        
        System.out.println("Imprimindo classe");
       
        for(int i=0; i<n; i++){
            System.out.println(listaPaciente.get(i));
        }
    }
       
    
    public void limparCampos(){
        txtNome.clear();
        txtSexo.clear();
        txtDataNascimento.clear();
        txtNomeMae.clear();
        txtCpf.clear();
        
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
        
        p.cadastrarDados();
        
        listaPaciente.add(p);
        limparCampos();
        tabelaPaciente.refresh();
        p.toString();
    }
   
    
    public void consultarPaciente(){
        listaPaciente = tabelaPaciente.getItems();
        
        cCodigo.setCellValueFactory(new PropertyValueFactory("SEQ_PACIENTE"));
        cNome.setCellValueFactory(new PropertyValueFactory("NOME_PACIENTE"));
        cDataNascimento.setCellValueFactory(new PropertyValueFactory("DATA_NASCIMENTO"));
        cCpf.setCellValueFactory(new PropertyValueFactory("CPF_PACIENTE"));
        cNomeMae.setCellValueFactory(new PropertyValueFactory("NOME_MAE"));
        
        
   for (Paciente p: Paciente.consultarPacientes()){
            listaPaciente.add(p);
        }
        
    }
    
    public void deletarPaciente(ActionEvent deletaPaciente){  
        Paciente pPaciente = tabelaPaciente.getSelectionModel().getSelectedItem();
        pPaciente.remove();//remove do banco de dados
        listaPaciente.remove(pPaciente);//Remove apenas da interface
    
    }
    
        public void editar(ActionEvent editarPaciente){
        
        btnCadastrar.setVisible(false);
        btnSalvar.setVisible(true);
        
        Paciente pSelecionado = tabelaPaciente.getSelectionModel().getSelectedItem();
        
        txtNome.setText(pSelecionado.getNome());
        txtCpf.setText(pSelecionado.getCpf());
        txtSexo.setText(pSelecionado.getSexo());
        txtDataNascimento.setText(pSelecionado.getDataNascimento());
        txtNomeMae.setText(pSelecionado.getNomeDaMae());
       
        
    }
    
    public void salvarEdicao(){
        Paciente p = tabelaPaciente.getSelectionModel().getSelectedItem();
        
        p.setNome(txtNome.getText());
        p.setSexo(txtSexo.getText());
        p.setCpf(txtCpf.getText());
        p.setNomeDaMae(txtNomeMae.getText());
        p.setDataNascimento(txtDataNascimento.getText());
        
        p.update();
        
        
        tabelaPaciente.refresh();
        
        btnCadastrar.setVisible(true);
        btnSalvar.setVisible(false);
        limparCampos();
    }
    
}
