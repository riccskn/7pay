package com.br.riccskn.service.impl;


import com.br.riccskn.dto.request.DespesaRequestDTO;
import com.br.riccskn.dto.response.DespesaResponseDTO;
import com.br.riccskn.exception.DespesaNotFoundException;
import com.br.riccskn.helper.ConversorHelper;
import com.br.riccskn.model.DespesaModel;
import com.br.riccskn.repository.DespesasRepository;
import com.br.riccskn.service.DespesasService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class DespesasServiceImpl implements DespesasService {

    @Autowired
    private DespesasRepository repository;

    private static final String RECIFE_API_URL = "http://dados.recife.pe.gov.br/api/3/action/datastore_search?resource_id=ea074e10-46a1-46a4-a2a4-47d1b331544d&limit=100";

    @Override
    public DespesaResponseDTO getDespesaById(int id) {
        DespesaResponseDTO entity = null;

        if (despesaAlreadyExists(id)) {
            DespesaModel model = findDespesaById(id);
            entity = ConversorHelper.toDespesaResponseDTO(model);
        }else {
            entity = getDespesaEntity(id);
            entity.setId(id);
            repository.save(ConversorHelper.fromDespesaResponseDTO(entity));
        }
         return entity;
    }

    @Override
    public DespesaResponseDTO getDespesaEntity(int id) {

        DespesaResponseDTO entity = null;

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(RECIFE_API_URL, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            ObjectMapper objectMapper = new ObjectMapper();
            String responseBody = response.getBody();

            try {
                Map<String, Object> jsonMap = objectMapper.readValue(responseBody, new TypeReference<Map<String, Object>>() {});
                Map<String, Object> result = (Map<String, Object>) jsonMap.get("result");
                List<Map<String, Object>> records = (List<Map<String, Object>>) result.get("records");

                Map<String, Object> desiredRecord = records.stream()
                        .filter(record -> record.get("_id").equals(id))
                        .findFirst()
                        .orElse(null);

                if (desiredRecord != null) {
                    entity = objectMapper.convertValue(desiredRecord, DespesaResponseDTO.class);
                } else {
                    throw new DespesaNotFoundException(HttpStatus.NOT_FOUND, "Não foi encontrada nenhuma despesa em memória por id "+id);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return entity;
    }

    public boolean despesaAlreadyExists(int id) {
         DespesaModel despesa = repository.findAll()
                .stream()
                .filter(despesaModel -> despesaModel.getId() == id)
                .findFirst()
                .orElse(null);

         return despesa != null;
    }

    public DespesaModel findDespesaById(int id) {
        return repository.findAll()
                .stream()
                .filter(despesaModel -> despesaModel.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public DespesaResponseDTO updateDespesaById(int id, DespesaRequestDTO dto) {

        DespesaResponseDTO entity = null;

        if (despesaAlreadyExists(id)) {
            DespesaModel model = findDespesaById(id);

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

            repository.save(model);

            entity = ConversorHelper.toDespesaResponseDTO(model);
        }else {
            throw new DespesaNotFoundException(HttpStatus.NOT_FOUND, "Não foi encontrada nenhuma despesa em memória por id "+id);
        }

       return entity;
    }

    @Override
    public DespesaResponseDTO deleteDespesaById(int id) {
        DespesaResponseDTO entity = null;
            DespesaModel model = findDespesaById(id);
            entity = ConversorHelper.toDespesaResponseDTO(model);
            if (model == null) {
                throw new DespesaNotFoundException(HttpStatus.NOT_FOUND, "Não foi encontrada nenhuma despesa em memória por id "+id);
            }
            repository.delete(model);

        return entity;
    }
}
