/**
 * 
 */
package modelo.principal;

/**
 *
 * @author Usuario
 */
public abstract class  Pessoa {
    private String nome;
    private String fone;
    private String email;
    private double idade;
    private String cpf;

    public Pessoa(String nome, String fone, String email, double idade, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }
    

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
      //METODOS ESPECIAIS
    /**
     * 
     * @param cpf
     * @return true
     */
    public boolean validarCpf(String cpf){
        /*compara se a string cpf tem o tamanho de 11 caracteres*/
        return this.getCpf().length() == 11; 
   }
    
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
        
        /**
         * Testa a validação do cpf na exibição de dados
         */
        if (this.validarCpf(this.getCpf()) ){
            System.out.println("\tCPF: " + this.getCpf());
        }else
            System.out.println("\tCPF Inválido! **digite 11 números**");
        
    }
      
}
