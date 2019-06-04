/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Modelo;

/**
 *
 * @author Filipe Colares
 */
public interface IGerenciadorDados {
    public boolean cadastrarDados();
    public void consultarDados();
    public void atualizarDados();
    public void deletarDados();
}
