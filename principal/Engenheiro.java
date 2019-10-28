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
    private double imc;
    private String resultadoIMC;
    private final String tipoEngenheiro = "Civil";

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
    private double getIMC() {
        return imc;
    }
    public String getResultadoIMC() {
        return resultadoIMC;
    }
   //MÉTODOS ESPECIAIS
   /**
    * Indice de Massa Corporal: peso/altura²
    * @return imc
    */
    public double calculaIMC() {
        this.imc = this.getPeso() / (this.getAltura()*this.getAltura());
        return this.imc;
    }
    
    public String resultIMC() {
        this.calculaIMC();
        if ( ( this.sexo.equalsIgnoreCase("F") ) || ( this.sexo.equalsIgnoreCase("FEMININO") ) ) {
            if (this.imc < 19) {
                this.resultadoIMC = "Abaixo do peso ideal.";
            }   else if (this.imc < 25.8) {
                    this.resultadoIMC = "Peso ideal.";
                }   else
                        this.resultadoIMC = "Acima do peso ideal";
        } else if ( ( this.sexo.equalsIgnoreCase("M") ) || ( this.sexo.equalsIgnoreCase("MASCULINO") ) ) {
            if (this.imc < 20.7) {
                this.resultadoIMC = "Abaixo do peso ideal.";
            }   else if (this.imc < 26.4) {
                    this.resultadoIMC = "Peso ideal.";
                }   else
                       this.resultadoIMC = "Acima do peso ideal"; 
            
        } else 
            System.out.println("cadastre 'sexo' MASCULINO ou FEMININO");
        
        return 
                "\n\t======IMC ENGENHEIRO ===============" +
                "\n\t  Tipo: " + this.tipoEngenheiro +
                "\n\tNome: " + this.getNome() +
                "\n\tSexo: " + this.getSexo() +
                "\n\tPeso: " + this.getPeso() +
                "\n\tAltura: " + this.getAltura() +
                "\n\tValor do IMC " + this.getIMC() +
                "\n\tResultado do IMC " + this.getResultadoIMC() +
                "\n\t====================================";
    }

    @Override
    public void exibirDados(){
        System.out.print("Engenheiro");
        System.out.println(", Sexo: " + this.getSexo() + " Altura: " + this.getAltura() + " Peso: " + this.getPeso());
        System.out.print("\tNome: " + this.getNome() );
        System.out.println(", Idade: " + this.getIdade() );
        System.out.print("\tFone: " + this.getFone() );
        System.out.println(", Email: " + this.getEmail() );
        
        //Testa a validação do cpf na exibição de dados:
        if (this.validarCpf(this.getCpf()) ){
            System.out.println("\tCPF: " + this.getCpf());
        }else
            System.out.println("\tCPF Inválido! **digite 11 números**");
        System.out.println("\t== Projeto: " + this.getProjeto() + " ==");
        System.out.printf("" + this.resultIMC());

        
    }





    
}
