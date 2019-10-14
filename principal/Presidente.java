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
public class Presidente extends Pessoa {
    private String indicacao;
    private int anoNascimento;

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
    //MÉTODO ESPECIAL
    public void comunicado(String comunicado){
        
        System.out.println("====COMUNICADO DA PRESIDENCIA====");
        System.out.println("    " +comunicado);
        System.out.println("=================================\n");
    }
}
