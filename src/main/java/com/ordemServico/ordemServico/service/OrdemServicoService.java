package com.ordemServico.ordemServico.service;

import com.ordemServico.ordemServico.model.OrdemServico;
import com.ordemServico.ordemServico.repository.OrdemServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemServicoService {

    //Objeto e construtor da Interface Repository para utilizacao dos metodos Jpa
    private final OrdemServicoRepository repositorio;
    public OrdemServicoService(OrdemServicoRepository repositorio) {
        this.repositorio = repositorio;
    }

    //Metodo para salvar um servico
    public void salvarServico(OrdemServico servico){
        repositorio.save(servico);
    }

    //Metodo para excluir um servico
    public void excluirServico(Integer id){
        repositorio.deleteById(id);
    }

    //Metodo que retorna uma lista com todos os servicos
    public List<OrdemServico> listarServicos(){
        return repositorio.findAll();
    }

    //Metodo que procura um servico pelo ID
    public OrdemServico buscarId(Integer id){
        return repositorio.findById(id).orElseThrow(() -> new RuntimeException("Serviço com ID" + id + "não encontrado!"));
    }
}
