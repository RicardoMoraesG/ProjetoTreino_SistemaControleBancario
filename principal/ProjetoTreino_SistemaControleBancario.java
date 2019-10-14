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
public class ProjetoTreino_SistemaControleBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[10];
        Presidente pres[] = new Presidente[2];
        //Presidente(String indicacao, int anoNascimento, String nome, String fone, String email, double idade, String cpf) 
        pres[0] = new Presidente("xxx",1964,"Gonçalves","1111111111", "111@111", 55, "12345678910");
        pres[0].exibirDados();
        pres[0].comunicado("Abono de 20% para todos!");
        
        pres[1] = new Presidente("yyy", 1979, "Silva","222222222", "222@222", 50, "0132165498");
        pres[1].exibirDados();
        pres[1].comunicado("Foi bom enquanto durou");
        
        Diretor dir[] = new Diretor[2];
        //Diretor(int anoCargo, String situacao, String nome, String fone, String email, double idade, String cpf)
        dir[0] = new Diretor(2018, "ativo","Ramos", "333333333", "333@333", 53, "45612378912");
        dir[0].exibirDados();
        dir[0].metaDeLucro(500000);
        
        dir[1] = new Diretor(2016, "inativo", "Vieira", "444444444", "444@444", 45, "987321654");
        dir[1].exibirDados();
        dir[1].metaDeLucro(1000000);
        
        //Gerente(String setor, double salario, int qtdadePessoasGerencia, 
        //String nome, String fone, String email, double idade, String cpf)
        Gerente ger0 = new Gerente("Compras", 10000, 15, "Lopes", "555555555", "555@555", 38, "55555555555");
        ger0.exibirDados();
        
        Gerente ger1 = new Gerente("Compras",1000,5,"Garcia","666666666","666@666",43,"6666666666");
        ger1.exibirDados();
        
        Gerente ger2 = new Gerente("Empréstimo",1000,5,"Garcia","666666666","666@666",43,"6666666666");
        ger2.exibirDados();
        
        //Engenheiro(String projeto, String sexo, double altura, double peso, 
        //String nome, String fone, String email, double idade, String cpf)
        Engenheiro eng0 = new Engenheiro("Novo Andar","F",1.65,65.2,"Ferreira","777777777","777@777",30,"77777777777");
        eng0.exibirDados();
        
        
    }//FIM CODIGO PRINCIPAL
    
}
