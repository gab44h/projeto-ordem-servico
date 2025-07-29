package com.ordemServico.ordemServico.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    private String responsavelExecucao;
    private String codigoEmpresa;
    private String nomeContato;
    private String telContato;
    private String emailCliente;
    private String tipoServico;
    private String descServico;
    private String observacoes;
    private String formaPagamento;

    private Double valServico;
    private Double valDesconto;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAbertura;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate prazoEntrega;

    //Construtores
    public OrdemServico() {
    }

    public OrdemServico(Integer id, Setor setor, String responsavelExecucao, String nomeContato, String codigoEmpresa, String telContato, String emailCliente, String tipoServico, String descServico, String observacoes, Double valServico, String formaPagamento, Double valDesconto, LocalDate dataAbertura, LocalDate prazoEntrega) {
        this.id = id;
        this.setor = setor;
        this.responsavelExecucao = responsavelExecucao;
        this.nomeContato = nomeContato;
        this.codigoEmpresa = codigoEmpresa;
        this.telContato = telContato;
        this.emailCliente = emailCliente;
        this.tipoServico = tipoServico;
        this.descServico = descServico;
        this.observacoes = observacoes;
        this.valServico = valServico;
        this.formaPagamento = formaPagamento;
        this.valDesconto = valDesconto;
        this.dataAbertura = dataAbertura;
        this.prazoEntrega = prazoEntrega;
    }

    //Getters & Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String getResponsavelExecucao() {
        return responsavelExecucao;
    }
    public void setResponsavelExecucao(String responsavelExecucao) {
        this.responsavelExecucao = responsavelExecucao;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }
    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelContato() {
        return telContato;
    }
    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    public String getEmailCliente() {
        return emailCliente;
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTipoServico() {
        return tipoServico;
    }
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescServico() {
        return descServico;
    }
    public void setDescServico(String descServico) {
        this.descServico = descServico;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getValServico() {
        return valServico;
    }
    public void setValServico(Double valServico) {
        this.valServico = valServico;
    }

    public Double getValDesconto() {
        return valDesconto;
    }
    public void setValDesconto(Double valDesconto) {
        this.valDesconto = valDesconto;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }
    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }
}
