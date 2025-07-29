package com.ordemServico.ordemServico.controller;

import com.ordemServico.ordemServico.model.OrdemServico;
import com.ordemServico.ordemServico.service.OrdemServicoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrdemServicoController {

    //Objeto e construtor da classe service para utilizacao dos metodos
    private final OrdemServicoService servico;
    public OrdemServicoController(OrdemServicoService servico) {
        this.servico = servico;
    }

    //Metodo para redirecionar a url
    @GetMapping("/")
    public String redirecionamentoCadastro(){
        return "redirect:/criar-servico";
    }

    //Metodo para mostrar a página de criacao
    @GetMapping("/criar-servico")
    public ModelAndView pagCadastro(){
        return new ModelAndView("index");
    }

    //Metodo que realiza a criacao do servico no banco de dados PostgreSQL
    @PostMapping("/criar-servico")
    public String salvarServico(@ModelAttribute OrdemServico ordem){
        servico.salvarServico(ordem);
        return "redirect:/criar-servico";
    }

    //Metodo para listar os servicos cadastrados
    @GetMapping("/historico")
    public String listarServicos(Model model){
        List<OrdemServico> ordens = servico.listarServicos();
        model.addAttribute("ordens", ordens);
        return "historico";
    }

    //Metodo para excluir um servico cadastrado
    @GetMapping("/historico/{id}")
    public String excluirServico(@PathVariable Integer id){
        servico.excluirServico(id);
        return "redirect:/historico";
    }

    //Metodo que busca o ID para realizar a edição do servico
    @GetMapping("/historico/editar/{id}")
    public String pagEdicao(@PathVariable Integer id, Model model){
        OrdemServico ordem = servico.buscarId(id);
        model.addAttribute("ordemServico", ordem);
        return "editar";
    }

    //Metodo que salva o formulario com os dados editados
    @PostMapping("/historico/editar")
    public String editarServico(@ModelAttribute OrdemServico ordemEditada){
        servico.salvarServico(ordemEditada);
        return "redirect:/historico";
    }
}
