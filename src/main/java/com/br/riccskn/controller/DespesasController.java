package com.br.riccskn.controller;


import com.br.riccskn.dto.request.DespesaRequestDTO;
import com.br.riccskn.dto.response.DespesaResponseDTO;
import com.br.riccskn.model.DespesaModel;
import com.br.riccskn.repository.DespesasRepository;
import com.br.riccskn.service.impl.DespesasServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/despesas")
public class DespesasController {

    @Autowired
    private DespesasServiceImpl service;

    @Autowired
    private DespesasRepository repository;

    @ApiOperation(value = "Retorna informações de uma despesa com um id especifico", produces = "application/json")
    @GetMapping("/{id}")
    public ResponseEntity<DespesaResponseDTO> getDespesa(@ApiParam(name = "id", value = "Id da despesa", required = true) @PathVariable(value = "id")int id) {
        return new ResponseEntity<>(service.getDespesaById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Atualiza informações de uma despesa com um id especifico", produces = "application/json")
    @PutMapping("/{id}")
    public ResponseEntity<DespesaResponseDTO> updateDespesa(@ApiParam(name = "id", value = "Id da despesa", required = true) @PathVariable(value = "id")int id, @RequestBody DespesaRequestDTO dto) {
      return new ResponseEntity<>(service.updateDespesaById(id, dto), HttpStatus.OK);
    }

    @ApiOperation(value = "Deleta uma despesa com um id especifico", produces = "application/json")
    @DeleteMapping("/{id}")
    public ResponseEntity<DespesaResponseDTO> deleteDespesa(@ApiParam(name = "id", value = "Id da despesa", required = true) @PathVariable(value = "id")int id) {
        return new ResponseEntity<>(service.deleteDespesaById(id), HttpStatus.OK);
    }

}
