/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsw.senac.ado.AdoProdutoBd.produtobd.entidade;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author Raul Portela
 */
@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    
    @NotBlank(message = "Insira o nome do produto.")
    @Size(max = 80)
    private String nome;
    
    @Size(max = 200)
    @NotBlank(message = "Insira a descrição do produto.")
    private String Descricao;
    
    @NotBlank(message = "Insira a quantidade do produto.")
    @Min(1)
    private int quantidade;

    @NotBlank(message = "Informe o status do produto.")
    private boolean status;
    
    @Min(0)
    @NotBlank(message = "Informe o preço de compra do produto.")
    private double precoCompra;
    
    @Min(0)
    @NotBlank(message = "Informe o preço de venda do produto.")
    private double precoVenda;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
}
