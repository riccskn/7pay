package com.br.riccskn.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class DespesaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internId;

    private int id;

    private int anoMovimentacao;

    private int mesMovimentacao;

    private int orgaoCodigo;

    private String orgaoNome;

    private String unidadeCodigo;

    private String unidadeNome;

    private int categoriaEconomicaCodigo;

    private String categoriaEconomicaNome;

    private int grupoDespesaCodigo;

    private String grupoDespesaNome;

    private int modalidadeAplicacaoCodigo;

    private String modalidadeAplicacaoNome;

    private int elementoCodigo;

    private String elementoNome;

    private int subelementoCodigo;

    private String subelementoNome;

    private int funcaoCodigo;

    private String funcaoNome;

    private int subfuncaoCodigo;

    private String subfuncaoNome;

    private int programaCodigo;

    private String programaNome;

    private int acaoCodigo;

    private String acaoNome;

    private int fonteRecursoCodigo;

    private String fonteRecursoNome;

    private int empenhoAno;

    private String empenhoModalidadeNome;

    private int empenhoModalidadeCodigo;

    private int empenhoNumero;

    private String subempenho;

    private String indicadorSubempenho;

    private int credorCodigo;

    private String credorNome;

    private int modalidadeLicitacaoCodigo;

    private String modalidadeLicitacaoNome;

    private String valorEmpenhado;

    private String valorLiquidado;

    private String valorPago;



}
