/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Presidente extends Pessoa implements I_Autenticacao {
    private String indicacao;
    private int anoNascimento;
    private final int senha = 123456;

    Scanner entrada = new Scanner(System.in);
    public Presidente(String indicacao, int anoNascimento, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.indicacao = indicacao;
        this.anoNascimento = anoNascimento;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //METODOS SOBREESCRITOS
    @Override
    public void exibirDados(){
        /**
         * Opção por utilizar os getters  
         * dispensa a reescrita de código
         * para acesso das subclasses
         */ 
        System.out.println("\nPresidente, Indicação: " + this.getIndicacao() + " Nascimento: " + this.getAnoNascimento());
        System.out.print("\tNome: " + this.getNome() );
        System.out.println(", Idade: " + this.getIdade() );
        System.out.print("\tFone: " + this.getFone() );
        System.out.println(", Email: " + this.getEmail() );
        /**
         * Testa a validação do cpf na exibição de dados
         */
        if (this.validarCpf(this.getCpf()) ){
            System.out.println("\tCPF: " + this.getCpf());
        }else
            System.out.println("\tCPF Inválido! **digite 11 números**");
        
    }       
    //MÉTODO ESPECIAL
    public void comunicado(String comunicado){
        
        System.out.println("\t====COMUNICADO DA PRESIDENCIA====");
        System.out.println("\t\t    " +comunicado);
        System.out.println("\t=================================\n");
    }

    @Override
    public boolean autenticar(int s) {
        return (s == this.senha);
    }
    @Override
    public void acessarContas(){
        /*System.out.println("ACESSAR TODAS AS CONTAS ");
        if ( this.autenticar(entrada.nextInt() ){
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Senha incorreta: Acesso negado");
        }*/
    }
}
