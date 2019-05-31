/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solmed.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ItemSolicitacao {
    private ArrayList<Medicamento> medicamento = new ArrayList<>();
    private SolicitacaoMedicamento solicitacao;
    private int quantidade;
    private String unidade;

    public ItemSolicitacao(SolicitacaoMedicamento solicitacao, int quantidade, String unidade) {
        this.solicitacao = solicitacao;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public ArrayList<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(ArrayList<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }

    public SolicitacaoMedicamento getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(SolicitacaoMedicamento solicitacao) {
        this.solicitacao = solicitacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public void adicionaMedicamento(Medicamento med){
        this.medicamento.add(med);
    }
    
}
