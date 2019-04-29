package br.com.dsw.senac.ado.AdoProdutoBd.produtobd.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raul Portela
 */
@Controller
@RequestMapping("/mv/produto")
public class ProdutoController {

    
    @ModelAttribute
    @GetMapping("/gerenciamento")
    public ModelAndView gerenciamento(RedirectAttributes ra) {
        
        ModelAndView mv = new ModelAndView("/1A");
        mensagemExclusao();
        mensagemAdicionado();
        return mv;
    }
    
    @ModelAttribute
    @GetMapping("/inclAlt")
    public ModelAndView inclusaoAlteracao() {
        ModelAndView mv = new ModelAndView("/2A");
        return mv;
    }
    
    @ModelAttribute("produtoExcluido")
    public int mensagemExclusao() {
        return 1;
    }
    @ModelAttribute("produtoAdicionado")
    public int mensagemAdicionado() {
        return 1;
    }
}
