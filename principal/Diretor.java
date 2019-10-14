package modelo.principal;

/**
 *
 * @author Usuario
 */
public class Diretor extends Pessoa {
    private int anoCargo;
    private String situacao;

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
        public void exibirDados(){
        /**
         * Opção por utilizar os getters  
         * dispensa a reescrita de código
         * para acesso das subclasses
         */  
            System.out.println("\nDiretor, Ano Cargo: " + this.anoCargo + ", Situção: " + this.getSituacao() );
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
        /**
         * Lucro deve ser maior que R$ 1000000
         * @param lucro 
         */
    public void metaDeLucro(double lucro){
        
        if (lucro >= 1000000){
            System.out.println("Lucro de R$ " + lucro + " Meta cumprida, parabéns a todos");
        }else 
            System.out.println("Lucro de R$ " + lucro + " Cumpriu " + lucro/1000000*100 + "%");
    }
        
        
}
