package com.br.riccskn.helper;

import com.br.riccskn.dto.response.DespesaResponseDTO;
import com.br.riccskn.model.DespesaModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ConversorHelper {

    public static DespesaModel fromDespesaResponseDTO(DespesaResponseDTO dto) {
        DespesaModel model = new DespesaModel();

        model.setId(dto.getId());
        model.setAnoMovimentacao(dto.getAnoMovimentacao());
        model.setMesMovimentacao(dto.getMesMovimentacao());
        model.setOrgaoCodigo(dto.getOrgaoCodigo());
        model.setOrgaoNome(dto.getOrgaoNome());
        model.setUnidadeCodigo(dto.getUnidadeCodigo());
        model.setUnidadeNome(dto.getUnidadeNome());
        model.setCategoriaEconomicaCodigo(dto.getCategoriaEconomicaCodigo());
        model.setCategoriaEconomicaNome(dto.getCategoriaEconomicaNome());
        model.setGrupoDespesaCodigo(dto.getGrupoDespesaCodigo());
        model.setGrupoDespesaNome(dto.getGrupoDespesaNome());
        model.setModalidadeAplicacaoCodigo(dto.getModalidadeAplicacaoCodigo());
        model.setModalidadeAplicacaoNome(dto.getModalidadeAplicacaoNome());
        model.setElementoCodigo(dto.getElementoCodigo());
        model.setElementoNome(dto.getElementoNome());
        model.setSubelementoCodigo(dto.getSubelementoCodigo());
        model.setSubelementoNome(dto.getSubelementoNome());
        model.setFuncaoCodigo(dto.getFuncaoCodigo());
        model.setFuncaoNome(dto.getFuncaoNome());
        model.setSubfuncaoCodigo(dto.getSubfuncaoCodigo());
        model.setSubfuncaoNome(dto.getSubfuncaoNome());
        model.setProgramaCodigo(dto.getProgramaCodigo());
        model.setProgramaNome(dto.getProgramaNome());
        model.setAcaoCodigo(dto.getAcaoCodigo());
        model.setAcaoNome(dto.getAcaoNome());
        model.setFonteRecursoCodigo(dto.getFonteRecursoCodigo());
        model.setFonteRecursoNome(dto.getFonteRecursoNome());
        model.setEmpenhoAno(dto.getEmpenhoAno());
        model.setEmpenhoModalidadeNome(dto.getEmpenhoModalidadeNome());
        model.setEmpenhoModalidadeCodigo(dto.getEmpenhoModalidadeCodigo());
        model.setEmpenhoNumero(dto.getEmpenhoNumero());
        model.setSubempenho(dto.getSubempenho());
        model.setIndicadorSubempenho(dto.getIndicadorSubempenho());
        model.setCredorCodigo(dto.getCredorCodigo());
        model.setCredorNome(dto.getCredorNome());
        model.setModalidadeLicitacaoCodigo(dto.getModalidadeLicitacaoCodigo());
        model.setModalidadeLicitacaoNome(dto.getModalidadeLicitacaoNome());
        model.setValorEmpenhado(dto.getValorEmpenhado());
        model.setValorLiquidado(dto.getValorLiquidado());
        model.setValorPago(dto.getValorPago());

        return model;
    }

    public static DespesaResponseDTO toDespesaResponseDTO(DespesaModel model) {
        DespesaResponseDTO dto = new DespesaResponseDTO();

        dto.setId(model.getId());
        dto.setAnoMovimentacao(model.getAnoMovimentacao());
        dto.setMesMovimentacao(model.getMesMovimentacao());
        dto.setOrgaoCodigo(model.getOrgaoCodigo());
        dto.setOrgaoNome(model.getOrgaoNome());
        dto.setUnidadeCodigo(model.getUnidadeCodigo());
        dto.setUnidadeNome(model.getUnidadeNome());
        dto.setCategoriaEconomicaCodigo(model.getCategoriaEconomicaCodigo());
        dto.setCategoriaEconomicaNome(model.getCategoriaEconomicaNome());
        dto.setGrupoDespesaCodigo(model.getGrupoDespesaCodigo());
        dto.setGrupoDespesaNome(model.getGrupoDespesaNome());
        dto.setModalidadeAplicacaoCodigo(model.getModalidadeAplicacaoCodigo());
        dto.setModalidadeAplicacaoNome(model.getModalidadeAplicacaoNome());
        dto.setElementoCodigo(model.getElementoCodigo());
        dto.setElementoNome(model.getElementoNome());
        dto.setSubelementoCodigo(model.getSubelementoCodigo());
        dto.setSubelementoNome(model.getSubelementoNome());
        dto.setFuncaoCodigo(model.getFuncaoCodigo());
        dto.setFuncaoNome(model.getFuncaoNome());
        dto.setSubfuncaoCodigo(model.getSubfuncaoCodigo());
        dto.setSubfuncaoNome(model.getSubfuncaoNome());
        dto.setProgramaCodigo(model.getProgramaCodigo());
        dto.setProgramaNome(model.getProgramaNome());
        dto.setAcaoCodigo(model.getAcaoCodigo());
        dto.setAcaoNome(model.getAcaoNome());
        dto.setFonteRecursoCodigo(model.getFonteRecursoCodigo());
        dto.setFonteRecursoNome(model.getFonteRecursoNome());
        dto.setEmpenhoAno(model.getEmpenhoAno());
        dto.setEmpenhoModalidadeNome(model.getEmpenhoModalidadeNome());
        dto.setEmpenhoModalidadeCodigo(model.getEmpenhoModalidadeCodigo());
        dto.setEmpenhoNumero(model.getEmpenhoNumero());
        dto.setSubempenho(model.getSubempenho());
        dto.setIndicadorSubempenho(model.getIndicadorSubempenho());
        dto.setCredorCodigo(model.getCredorCodigo());
        dto.setCredorNome(model.getCredorNome());
        dto.setModalidadeLicitacaoCodigo(model.getModalidadeLicitacaoCodigo());
        dto.setModalidadeLicitacaoNome(model.getModalidadeLicitacaoNome());
        dto.setValorEmpenhado(model.getValorEmpenhado());
        dto.setValorLiquidado(model.getValorLiquidado());
        dto.setValorPago(model.getValorPago());

        return dto;
    }

}
