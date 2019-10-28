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
public class Gerente extends Pessoa {
    private String setor;
    private double salario;
    private int qtdadePessoasGerencia;
            
    public Gerente(String setor, double salario, int qtdadePessoasGerencia, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.setor = setor;
        this.salario = abonoSalario(salario);
        this.qtdadePessoasGerencia = qtdadePessoasGerencia;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        this.setSalario(salario);
        return salario;
    }

    public void setSalario(double salario) {
       this.salario = abonoSalario(salario);
       
    }

    public int getQtdadePessoasGerencia() {
        return qtdadePessoasGerencia;
    }

    public void setQtdadePessoasGerencia(int qtdadePessoasGerencia) {
        this.qtdadePessoasGerencia = qtdadePessoasGerencia;
    }
    @Override
        public void exibirDados(){
        /**
         * Opção por utilizar os getters  
         * dispensa a reescrita de código
         * para acesso das subclasses
         */           
        System.out.println("\nGerente, setor: " + this.getSetor() + " Qt. Pessoas " +this.getQtdadePessoasGerencia());
        System.out.println("\tSalário R$ " + this.getSalario());
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
       public double abonoSalario(double salario) {
        /**
         * se a quantidade de pessoas gerenciadas for superior a 10, atribuir um
         * aumento de 10% sobre o salário.
         */
        if (this.getQtdadePessoasGerencia() > 10) {
            this.salario += salario * 0.10;
        
        }
          /**
          * se o setor gerenciado for compras, atribuir um aumento de 5% sobre o
          * salário.
          */
        else if (this.getSetor().compareToIgnoreCase("compras") == 0) {
            this.salario += salario * 0.05;
        } else 
            this.salario = salario;
        return this.salario;
    }
    //MÉTODO ESPECIAL
    public void emailEquipe(String assunto){
      
        System.out.println("\t=====================================");
        System.out.println("\temail para equipe " + this.getSetor());
        System.out.println("\tAssunto:  " +assunto);
        System.out.println("\tEmail enviado para " + this.getQtdadePessoasGerencia()+" pessoas.");
        System.out.println("\t=====================================");
    }
    
    
}
