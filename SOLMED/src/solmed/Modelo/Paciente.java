/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import solmed.Modelo.Config.Conectar;

/**
 *
 * @author Filipe Colares
 */
public class Paciente extends Pessoa{
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
                   + "VALUES (SEQ_PACIENTE.NEXTVAL,"
                        + "?," //NOME_PACIENTE
                        + "?," //NOME_MAE
                        + "?," //SEXO_PACIENTE
                        + "?," 
                        + "?)"; //CPF_PACIENTE
        
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


    
    public static List<Paciente> consultarPacientes(){
        ArrayList<Paciente> pac = new ArrayList<>();
        
        Conectar c = new Conectar();
        Connection con = c.getConexao();
        
        String sql = "SELECT * "
                    + "FROM PACIENTE "
                    + "ORDER BY NOME_PACIENTE";
        
        try {
            Statement state = con.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            while(result.next()){
                Paciente p = new Paciente();
                p.setId(result.getString("seq_paciente"));
                p.setNome(result.getString("NOME_PACIENTE"));
                p.setSexo(result.getString("SEXO_PACIENTE"));
                p.setDataNascimento(result.getString("DATA_NASCIMENTO"));
                p.setCpf(result.getString("CPF_PACIENTE"));
                p.setNomeDaMae(result.getString("NOME_MAE"));
                
                pac.add(p);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return pac;
    }
    
    public boolean remove() {
        Conectar c = new Conectar();
        Connection con = c.getConexao();
    
        String sql =  "DELETE FROM paciente WHERE SEQ_PACIENTE = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, getId());//Apenas 1 elemento
            
            ps.executeUpdate();
            
        }catch(SQLException e){
            
            System.out.println("deu caca");
            e.printStackTrace();
            return false;
        }
    
        return true;
    }
    
    
    public boolean update() {
        Conectar c = new Conectar();
        Connection con = c.getConexao();
    
        String sql =  "UPDATE Paciente SET "
                    + "NOME_PACIENTE = ?, " 
                    + "NOME_MAE = ?," 
                    + "SEXO_PACIENTE = ?," 
                    + "CPF_PACIENTE = ?,"
                    + "DATA_NASCIMENTO = ?"
                    + "WHERE  SEQ_PACIENTE = ? ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,this.getNome());
            ps.setString(2,this.nomeDaMae);
            ps.setString(3,this.getSexo());
            ps.setString(4,this.getCpf());
            ps.setString(5,this.dataNascimento);
            
            ps.setString(6, getId());
            
            ps.executeUpdate();           
            
            
        }catch(SQLException e){
            
            System.out.println("deu caca");
            e.printStackTrace();
            return false;
        }
    
        return true;
    }
}
