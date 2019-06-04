/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import solmed.Modelo.Config.Conectar;

/**
 *
 * @author Filipe Colares
 */
public class Paciente extends Pessoa implements IGerenciadorDados{
    private String nomeDaMae;
    private String dataNascimento;

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean cadastrarDados() {
        Conectar c = new Conectar();
        
        Connection con = c.getConexao();
      
        String sql = "INSERT INTO PACIENTE ("
                        +  "SEQ_PACIENTE," 
                        + "NOME_PACIENTE, " 
                        + "NOME_MAE," 
                        + "SEXO_PACIENTE," 
                        + "CPF_PACIENTE,"
                        + "DATA_NASCIMENTO)"
                   + "VALUES (SEQ_PACIENTE.NEXTVALUE,"
                        + "?" //NOME_PACIENTE
                        + "?" //NOME_MAE
                        + "?" //SEXO_PACIENTE
                        + "?" 
                        + "?"; //CPF_PACIENTE
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,this.getNome());
            ps.setString(2,this.nomeDaMae);
            ps.setString(3,this.getSexo());
            ps.setString(4,this.getCpf());
            ps.setString(5,this.dataNascimento);
            
            ps.executeUpdate();
            
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        
        return false;
    }

    @Override
    public void consultarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
