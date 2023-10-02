package com.br.riccskn.service;

import com.br.riccskn.dto.request.DespesaRequestDTO;
import com.br.riccskn.dto.response.DespesaResponseDTO;
import com.br.riccskn.model.DespesaModel;

public interface DespesasService {

    DespesaResponseDTO getDespesaById(int id);

    DespesaResponseDTO getDespesaEntity(int id);

    DespesaResponseDTO updateDespesaById(int id, DespesaRequestDTO dto);

    DespesaResponseDTO deleteDespesaById(int id);


}
