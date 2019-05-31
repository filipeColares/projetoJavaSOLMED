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
public class Atendimento {
    private String dataAtendimento;
    private int idAtendimento;
    private int tipoAtendimento;
    private int motivoAtendimento;
    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public int getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(int tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public int getMotivoAtendimento() {
        return motivoAtendimento;
    }

    public void setMotivoAtendimento(int motivoAtendimento) {
        this.motivoAtendimento = motivoAtendimento;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "dataAtendimento=" + dataAtendimento 
                + ", idAtendimento=" + idAtendimento 
                + ", tipoAtendimento=" + tipoAtendimento 
                + ", motivoAtendimento=" + motivoAtendimento 
                + ", paciente=" + paciente + '}';
    }
    
    
    
}
