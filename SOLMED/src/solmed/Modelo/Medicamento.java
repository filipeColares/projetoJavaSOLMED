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
class Medicamento {
    private int idMedicamento;
    private String descricao;
    private String tipoMedicamento;

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public Medicamento(int idMedicamento, String descricao, String tipoMedicamento) {
        this.idMedicamento = idMedicamento;
        this.descricao = descricao;
        this.tipoMedicamento = tipoMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "idMedicamento=" + idMedicamento + ", descricao=" + descricao + ", tipoMedicamento=" + tipoMedicamento + '}';
    }
    
}
