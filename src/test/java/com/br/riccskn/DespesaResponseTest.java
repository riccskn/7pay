package com.br.riccskn;

import com.br.riccskn.dto.response.DespesaResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DespesaResponseTest {

    @Test
    public void testDeserialization() throws Exception {
        String json = "{ \"_id\": 5, \"ano_movimentacao\": 2023, \"mes_movimentacao\": 2, \"orgao_codigo\": 8, \"orgao_nome\": \"GABINETE DO CENTRO DO RECIFE\", \"unidade_codigo\": \"8.01\", \"unidade_nome\": \"GABINETE DO CENTRO DO RECIFE - ADMINISTRAÇÃO DIRETA\", \"categoria_economica_codigo\": 3, \"categoria_economica_nome\": \"DESPESAS CORRENTES\", \"grupo_despesa_codigo\": 1, \"grupo_despesa_nome\": \"PESSOAL E ENCARGOS SOCIAIS\", \"modalidade_aplicacao_codigo\": 90, \"modalidade_aplicacao_nome\": \"APLICAÇÕES DIRETAS\", \"elemento_codigo\": 11, \"elemento_nome\": \"VENCIMENTOS E VANTAGENS FIXAS - PESSOAL CIVIL\", \"subelemento_codigo\": 43, \"subelemento_nome\": \"13º SALÁRIO\", \"funcao_codigo\": 4, \"funcao_nome\": \"ADMINISTRAÇÃO\", \"subfuncao_codigo\": 122, \"subfuncao_nome\": \"ADMINISTRAÇÃO GERAL\", \"programa_codigo\": 2160, \"programa_nome\": \"GESTÃO DAS POLÍTICAS MUNICIPAIS\", \"acao_codigo\": 2874, \"acao_nome\": \"COORDENAÇÃO, SUPERVISÃO E EXECUÇÃO DAS POLÍTICAS DO GABINETE DO CENTRO DO RECIFE\", \"fonte_recurso_codigo\": 500, \"fonte_recurso_nome\": \"RECURSOS NÃO VINCULADOS DE IMPOSTOS\", \"empenho_ano\": 2023, \"empenho_modalidade_nome\": \"SEM TIPO INFORMADO\", \"empenho_modalidade_codigo\": 0, \"empenho_numero\": 34, \"subempenho\": \"82\", \"indicador_subempenho\": \"x\", \"credor_codigo\": 0, \"credor_nome\": \"CREDOR NÃO INFORMADO\", \"modalidade_licitacao_codigo\": 0, \"modalidade_licitacao_nome\": \"NÃO INFORMADA\", \"valor_empenhado\": \"750,00\", \"valor_liquidado\": \"750,00\", \"valor_pago\": \"750,00\" }";

        ObjectMapper objectMapper = new ObjectMapper();
        DespesaResponseDTO despesa = objectMapper.readValue(json, DespesaResponseDTO.class);

        assertEquals(5, despesa.getId());
        assertEquals(2023, despesa.getAnoMovimentacao());
        assertEquals(2, despesa.getMesMovimentacao());
        assertEquals(8, despesa.getOrgaoCodigo());
        assertEquals("GABINETE DO CENTRO DO RECIFE", despesa.getOrgaoNome());
        assertEquals("8.01", despesa.getUnidadeCodigo());
        assertEquals("GABINETE DO CENTRO DO RECIFE - ADMINISTRAÇÃO DIRETA", despesa.getUnidadeNome());
        assertEquals(3, despesa.getCategoriaEconomicaCodigo());
        assertEquals("DESPESAS CORRENTES", despesa.getCategoriaEconomicaNome());
        assertEquals(1, despesa.getGrupoDespesaCodigo());
        assertEquals("PESSOAL E ENCARGOS SOCIAIS", despesa.getGrupoDespesaNome());
        assertEquals(90, despesa.getModalidadeAplicacaoCodigo());
        assertEquals("APLICAÇÕES DIRETAS", despesa.getModalidadeAplicacaoNome());
        assertEquals(11, despesa.getElementoCodigo());
        assertEquals("VENCIMENTOS E VANTAGENS FIXAS - PESSOAL CIVIL", despesa.getElementoNome());
        assertEquals(43, despesa.getSubelementoCodigo());
        assertEquals("13º SALÁRIO", despesa.getSubelementoNome());
        assertEquals(4, despesa.getFuncaoCodigo());
        assertEquals("ADMINISTRAÇÃO", despesa.getFuncaoNome());
        assertEquals(122, despesa.getSubfuncaoCodigo());
        assertEquals("ADMINISTRAÇÃO GERAL", despesa.getSubfuncaoNome());
        assertEquals(2160, despesa.getProgramaCodigo());
        assertEquals("GESTÃO DAS POLÍTICAS MUNICIPAIS", despesa.getProgramaNome());
        assertEquals(2874, despesa.getAcaoCodigo());
        assertEquals("COORDENAÇÃO, SUPERVISÃO E EXECUÇÃO DAS POLÍTICAS DO GABINETE DO CENTRO DO RECIFE", despesa.getAcaoNome());
        assertEquals(500, despesa.getFonteRecursoCodigo());
        assertEquals("RECURSOS NÃO VINCULADOS DE IMPOSTOS", despesa.getFonteRecursoNome());
        assertEquals(2023, despesa.getEmpenhoAno());
        assertEquals("SEM TIPO INFORMADO", despesa.getEmpenhoModalidadeNome());
        assertEquals(0, despesa.getEmpenhoModalidadeCodigo());
        assertEquals(34, despesa.getEmpenhoNumero());
        assertEquals("82", despesa.getSubempenho());
        assertEquals("x", despesa.getIndicadorSubempenho());
        assertEquals(0, despesa.getCredorCodigo());
        assertEquals("CREDOR NÃO INFORMADO", despesa.getCredorNome());
        assertEquals(0, despesa.getModalidadeLicitacaoCodigo());
        assertEquals("NÃO INFORMADA", despesa.getModalidadeLicitacaoNome());
        assertEquals("750,00", despesa.getValorEmpenhado());
        assertEquals("750,00", despesa.getValorLiquidado());
        assertEquals("750,00", despesa.getValorPago());
    }

}
