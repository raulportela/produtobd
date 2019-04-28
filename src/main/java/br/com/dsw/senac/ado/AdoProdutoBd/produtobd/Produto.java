package br.com.dsw.senac.ado.AdoProdutoBd.produtobd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
public class Produto {

    @GetMapping("/gerenciamento")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("/1A");
        return mv;
    }
}
