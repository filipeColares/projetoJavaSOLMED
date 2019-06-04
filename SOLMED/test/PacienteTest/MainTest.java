package PacienteTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import solmed.Modelo.Paciente;

/**
 *
 * @author Filipe Colares
 */
public class MainTest {

    
    public void testPacienteCadastro(){
        Paciente p = new Paciente();
        
        p.setNome("Filipe Colares");
        p.setCpf("03895102032");
        p.setDataNascimento("03/03/1999");
        p.setNomeDaMae("Teisi Colares da Silva");
        p.setSexo("M");
        
        p.cadastrarDados();
    }

}

