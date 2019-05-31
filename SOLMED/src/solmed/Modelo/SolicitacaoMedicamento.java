/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Modelo;

/**
 *
 * @author Aluno
 */
public class SolicitacaoMedicamento {
    private String dataSolicitacao;
    private int idSolicitacao;
    private Atendimento atendimentoSolicitacao;
    private Unidade unidadeDestino;

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public Atendimento getAtendimentoSolicitacao() {
        return atendimentoSolicitacao;
    }

    public void setAtendimentoSolicitacao(Atendimento atendimentoSolicitacao) {
        this.atendimentoSolicitacao = atendimentoSolicitacao;
    }

    public Unidade getUnidadeDestino() {
        return unidadeDestino;
    }

    public void setUnidadeDestino(Unidade unidadeDestino) {
        this.unidadeDestino = unidadeDestino;
    }

    @Override
    public String toString() {
        return "SolicitacaoMedicamento{" + "dataSolicitacao=" + dataSolicitacao + ", idSolicitacao=" + idSolicitacao + ", atendimentoSolicitacao=" + atendimentoSolicitacao + ", unidadeDestino=" + unidadeDestino + '}';
    }
    
    
}
