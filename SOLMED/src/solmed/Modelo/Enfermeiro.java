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
public class Enfermeiro extends Pessoa{
    
    private String codigoIdentificacao;
    private String coren;
    private Unidade unidadeTrabalha;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Unidade getUnidadeTrabalha() {
        return unidadeTrabalha;
    }

    public void setUnidadeTrabalha(Unidade unidadeTrabalha) {
        this.unidadeTrabalha = unidadeTrabalha;
    }

    public String getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }
    
    
}
