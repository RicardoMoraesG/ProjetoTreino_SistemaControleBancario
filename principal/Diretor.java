package modelo.principal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Diretor extends Pessoa implements I_Autenticacao {
    private int anoCargo;
    private String situacao;
    private final int senha = 987654;

    Scanner entrada = new Scanner(System.in);
    public Diretor(int anoCargo, String situacao, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.anoCargo = anoCargo;
        this.situacao = situacao;
    }

    public int getAnoCargo() {
        return anoCargo;
    }

    public void setAnoCargo(int anoCargo) {
        this.anoCargo = anoCargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public String exibirDados(){
        /**
         * Opção por utilizar os getters  
         * dispensa a reescrita de código
         * para acesso das subclasses
         */  
            System.out.println("\nDiretor, Ano Cargo: " + this.anoCargo + ", Situção: " + this.getSituacao() );
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
        return "";
    }
        
    //MÉTODO ESPECIAL
        /**
         * Lucro deve ser maior que R$ 1000000
         * @param lucro 
         */
    public void metaDeLucro(double lucro){
        
        if (lucro >= 1000000){
            System.out.println("\tLucro de R$ " + lucro + " Meta cumprida, parabéns a todos");
        }else 
            System.out.println("\tLucro de R$ " + lucro + " Cumpriu " + lucro/1000000*100 + "%");
    }

       //Conceito de Polimorfismo.
        @Override
    public void acessarContas(int s){
        System.out.println("ACESSAR TODAS AS CONTAS "); 
        if (senha == s){
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Senha incorreta: Acesso negado");
        }
    }
}
