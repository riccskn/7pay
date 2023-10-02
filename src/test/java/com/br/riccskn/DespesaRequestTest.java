package com.br.riccskn;

import com.br.riccskn.dto.request.DespesaRequestDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DespesaRequestTest {

    @Test
    public void testDeserialization() throws Exception {
        String json = "{"
                + "\"ano_movimentacao\": 2023,"
                + "\"mes_movimentacao\": 2,"
                + "\"orgao_codigo\": 8,"
                + "\"orgao_nome\": \"GABINETE DO CENTRO DO RECIFE\","
                + "\"unidade_codigo\": \"8.01\","
                + "\"unidade_nome\": \"GABINETE DO CENTRO DO RECIFE - ADMINISTRAÇÃO DIRETA\","
                + "\"categoria_economica_codigo\": 3,"
                + "\"categoria_economica_nome\": \"DESPESAS CORRENTES\","
                + "\"grupo_despesa_codigo\": 1,"
                + "\"grupo_despesa_nome\": \"PESSOAL E ENCARGOS SOCIAIS\","
                + "\"modalidade_aplicacao_codigo\": 90,"
                + "\"modalidade_aplicacao_nome\": \"APLICAÇÕES DIRETAS\","
                + "\"elemento_codigo\": 11,"
                + "\"elemento_nome\": \"VENCIMENTOS E VANTAGENS FIXAS - PESSOAL CIVIL\","
                + "\"subelemento_codigo\": 43,"
                + "\"subelemento_nome\": \"13º SALÁRIO\","
                + "\"funcao_codigo\": 4,"
                + "\"funcao_nome\": \"ADMINISTRAÇÃO\","
                + "\"subfuncao_codigo\": 122,"
                + "\"subfuncao_nome\": \"ADMINISTRAÇÃO GERAL\","
                + "\"programa_codigo\": 2160,"
                + "\"programa_nome\": \"GESTÃO DAS POLÍTICAS MUNICIPAIS\","
                + "\"acao_codigo\": 2874,"
                + "\"acao_nome\": \"COORDENAÇÃO, SUPERVISÃO E EXECUÇÃO DAS POLÍTICAS DO GABINETE DO CENTRO DO RECIFE\","
                + "\"fonte_recurso_codigo\": 500,"
                + "\"fonte_recurso_nome\": \"RECURSOS NÃO VINCULADOS DE IMPOSTOS\","
                + "\"empenho_ano\": 2023,"
                + "\"empenho_modalidade_nome\": \"SEM TIPO INFORMADO\","
                + "\"empenho_modalidade_codigo\": 0,"
                + "\"empenho_numero\": 34,"
                + "\"subempenho\": \"82\","
                + "\"indicador_subempenho\": \"x\","
                + "\"credor_codigo\": 0,"
                + "\"credor_nome\": \"CREDOR NÃO INFORMADO\","
                + "\"modalidade_licitacao_codigo\": 0,"
                + "\"modalidade_licitacao_nome\": \"NÃO INFORMADA\","
                + "\"valor_empenhado\": \"750,00\","
                + "\"valor_liquidado\": \"750,00\","
                + "\"valor_pago\": \"750,00\""
                + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        DespesaRequestDTO myModel = objectMapper.readValue(json, DespesaRequestDTO.class);

        assertEquals(2023, myModel.getAnoMovimentacao());
        assertEquals(2, myModel.getMesMovimentacao());
        assertEquals(8, myModel.getOrgaoCodigo());
        assertEquals("GABINETE DO CENTRO DO RECIFE", myModel.getOrgaoNome());
        assertEquals("8.01", myModel.getUnidadeCodigo());
        assertEquals("GABINETE DO CENTRO DO RECIFE - ADMINISTRAÇÃO DIRETA", myModel.getUnidadeNome());
        assertEquals(3, myModel.getCategoriaEconomicaCodigo());
        assertEquals("DESPESAS CORRENTES", myModel.getCategoriaEconomicaNome());
        assertEquals(1, myModel.getGrupoDespesaCodigo());
        assertEquals("PESSOAL E ENCARGOS SOCIAIS", myModel.getGrupoDespesaNome());
        assertEquals(90, myModel.getModalidadeAplicacaoCodigo());
        assertEquals("APLICAÇÕES DIRETAS", myModel.getModalidadeAplicacaoNome());
        assertEquals(11, myModel.getElementoCodigo());
        assertEquals("VENCIMENTOS E VANTAGENS FIXAS - PESSOAL CIVIL", myModel.getElementoNome());
        assertEquals(43, myModel.getSubelementoCodigo());
        assertEquals("13º SALÁRIO", myModel.getSubelementoNome());
        assertEquals(4, myModel.getFuncaoCodigo());
        assertEquals("ADMINISTRAÇÃO", myModel.getFuncaoNome());
        assertEquals(122, myModel.getSubfuncaoCodigo());
    }

}
