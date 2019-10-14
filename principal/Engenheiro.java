/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

/**
 *
 * @author Usuario
 */
public class Engenheiro extends Pessoa {
    private String projeto;
    private String sexo;
    private double altura;
    private double peso;

    public Engenheiro(String projeto, String sexo, double altura, double peso, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.projeto = projeto;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void exibirDados(){
        /**
         * Opção por utilizar os getters  
         * dispensa a reescrita de código
         * para acesso das subclasses
         */               
        System.out.print("Nome: " + this.getNome() );
        System.out.println(", Idade: " + this.getIdade() );
        System.out.print("Fone: " + this.getFone() );
        System.out.println(", Email: " + this.getEmail() );
        System.out.print("CPF: " + this.getCpf());
        /**
         * Testa a validação do cpf na exibição de dados
         */
        if (this.validarCpf(this.getCpf()) ){
            System.out.println(" Válido!");
        }else
            System.out.println(" Inválido! **digite 11 números**");
        
    }
    
}
