package br.com.dsw.senac.ado.AdoProdutoBd.produtobd.controller;

import br.com.dsw.senac.ado.AdoProdutoBd.produtobd.entidade.Produto;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
    public ModelAndView gerenciamento() {

        ModelAndView mv = new ModelAndView("/1A");
        mensagemExclusao();
        mensagemAdicionado();
        return mv;
    }

    @ModelAttribute
    @GetMapping("/inclAlt")
    public ModelAndView inclusaoAlteracao(@ModelAttribute("produtos") @Valid Produto produtoPreenchido,
            BindingResult bindingResult,
            RedirectAttributes ra) {
        if (bindingResult.hasErrors()) {
            //JEH OLHA
            //Mano se você olhar esse codigo, não foi eu que fiz, então ta bagunçado mesmo, colei aqui só pra tentar entender
            return new ModelAndView("formulario-validacao");
        }

        ModelAndView mv = new ModelAndView("redirect:/mv/inclAlt");
        ra.addFlashAttribute("produto", produtoPreenchido);
        return mv;
    }

    @ModelAttribute("produtoExcluido")
    public int mensagemExclusao() {
        return 1;
    }

    @ModelAttribute("produtoAdicionado")
    public int mensagemAdicionado() {
        return 0;
    }
}
