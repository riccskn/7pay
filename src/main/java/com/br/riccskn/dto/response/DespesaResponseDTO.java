package com.br.riccskn.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class DespesaResponseDTO {

    @JsonProperty("_id")
    private int id;

    @JsonProperty("ano_movimentacao")
    private int anoMovimentacao;

    @JsonProperty("mes_movimentacao")
    private int mesMovimentacao;

    @JsonProperty("orgao_codigo")
    private int orgaoCodigo;

    @JsonProperty("orgao_nome")
    private String orgaoNome;

    @JsonProperty("unidade_codigo")
    private String unidadeCodigo;

    @JsonProperty("unidade_nome")
    private String unidadeNome;

    @JsonProperty("categoria_economica_codigo")
    private int categoriaEconomicaCodigo;

    @JsonProperty("categoria_economica_nome")
    private String categoriaEconomicaNome;

    @JsonProperty("grupo_despesa_codigo")
    private int grupoDespesaCodigo;

    @JsonProperty("grupo_despesa_nome")
    private String grupoDespesaNome;

    @JsonProperty("modalidade_aplicacao_codigo")
    private int modalidadeAplicacaoCodigo;

    @JsonProperty("modalidade_aplicacao_nome")
    private String modalidadeAplicacaoNome;

    @JsonProperty("elemento_codigo")
    private int elementoCodigo;

    @JsonProperty("elemento_nome")
    private String elementoNome;

    @JsonProperty("subelemento_codigo")
    private int subelementoCodigo;

    @JsonProperty("subelemento_nome")
    private String subelementoNome;

    @JsonProperty("funcao_codigo")
    private int funcaoCodigo;

    @JsonProperty("funcao_nome")
    private String funcaoNome;

    @JsonProperty("subfuncao_codigo")
    private int subfuncaoCodigo;

    @JsonProperty("subfuncao_nome")
    private String subfuncaoNome;

    @JsonProperty("programa_codigo")
    private int programaCodigo;

    @JsonProperty("programa_nome")
    private String programaNome;

    @JsonProperty("acao_codigo")
    private int acaoCodigo;

    @JsonProperty("acao_nome")
    private String acaoNome;

    @JsonProperty("fonte_recurso_codigo")
    private int fonteRecursoCodigo;

    @JsonProperty("fonte_recurso_nome")
    private String fonteRecursoNome;

    @JsonProperty("empenho_ano")
    private int empenhoAno;

    @JsonProperty("empenho_modalidade_nome")
    private String empenhoModalidadeNome;

    @JsonProperty("empenho_modalidade_codigo")
    private int empenhoModalidadeCodigo;

    @JsonProperty("empenho_numero")
    private int empenhoNumero;

    @JsonProperty("subempenho")
    private String subempenho;

    @JsonProperty("indicador_subempenho")
    private String indicadorSubempenho;

    @JsonProperty("credor_codigo")
    private int credorCodigo;

    @JsonProperty("credor_nome")
    private String credorNome;

    @JsonProperty("modalidade_licitacao_codigo")
    private int modalidadeLicitacaoCodigo;

    @JsonProperty("modalidade_licitacao_nome")
    private String modalidadeLicitacaoNome;

    @JsonProperty("valor_empenhado")
    private String valorEmpenhado;

    @JsonProperty("valor_liquidado")
    private String valorLiquidado;

    @JsonProperty("valor_pago")
    private String valorPago;

}
