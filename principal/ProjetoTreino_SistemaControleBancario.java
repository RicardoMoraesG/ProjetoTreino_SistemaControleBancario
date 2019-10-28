package modelo.principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ricardo de Moraes Gonçalves.
 */
public class ProjetoTreino_SistemaControleBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Instancia os objetos de todas as classes.
         */
        Scanner entrada = new Scanner(System.in);
        Presidente pres[] = new Presidente[2];
        //Presidente(String indicacao, int anoNascimento, String nome, String fone, String email, double idade, String cpf) 
        pres[0] = new Presidente("xxx",1964,"Gonçalves","1111111111", "aaa@override", 55, "12345678910");
        pres[0].exibirDados();
        pres[0].comunicado("Meta Atingida!");
        pres[1] = new Presidente("yyy", 1979, "Silva","222222222", "bbb@override", 50, "0132165498");
        pres[1].exibirDados();
        pres[1].comunicado("Reunião ");
        Diretor dir[] = new Diretor[2];
        //Diretor(int anoCargo, String situacao, String nome, String fone, String email, double idade, String cpf)
        dir[0] = new Diretor(2018, "ativo","Ramos", "333333333", "ccc@override", 53, "45612378912");
        dir[0].exibirDados();
        dir[0].metaDeLucro(500000);
        dir[1] = new Diretor(2016, "inativo", "Vieira", "444444444", "ddd@override", 45, "987321654");
        dir[1].exibirDados();
        dir[1].metaDeLucro(1000000);
        //Gerente(String setor, double salario, int qtdadePessoasGerencia, 
        //String nome, String fone, String email, double idade, String cpf)
        Gerente ger0 = new Gerente("Compras", 10000, 15, "Lopes", "555555555", "eee@override", 38, "55555555555");
        ger0.exibirDados();
        ger0.emailEquipe("Novo horário de atendimento");
        Gerente ger1 = new Gerente("Compras",1000,5,"Garcia","666666666","fff@override",43,"6666666666");
        ger1.exibirDados();
        ger1.emailEquipe("Cancela novo horário de atendimento");
        Gerente ger2 = new Gerente("Empréstimo",1000,5,"Andrade","77777777","ggg@override",43,"7777777777");
        ger2.exibirDados();
        ger2.emailEquipe("Reafirma novo horário de atendimento");
        /*
        Engenheiro(String projeto, String sexo, double altura, double peso, 
        String nome, String fone, String email, double idade, String cpf)
        */
        Engenheiro eng0 = new Engenheiro("Novo Andar","f",1.65,65.2,"Ferreira","777777777","fff@override",30,"77777777777");
        eng0.exibirDados();
        
        
        /**
         * Cria uma lista tipada da classe Pessoa.
         */
        
        ArrayList<Pessoa> ListaFuncionarios = new ArrayList<>();
        ListaFuncionarios.add(eng0);
        ListaFuncionarios.add(ger0);
        ListaFuncionarios.add(ger1);
        ListaFuncionarios.add(ger2);
        ListaFuncionarios.add(dir[0]);
        ListaFuncionarios.add(dir[1]);
        ListaFuncionarios.add(pres[0]);
        ListaFuncionarios.add(pres[1]);
        /**
         * Exibe a lista tipada da classe Pessoa
         * através de um loop(for).
         */
        System.out.println("\n============BANCO OVERRIDE==================");
        System.out.println("\tLista Completa de Funcionários\n");
        for (int i = 0; i < ListaFuncionarios.size(); i++) {
            System.out.println("\t" + ListaFuncionarios.get(i).getNome().toUpperCase()
                    + " Email: " + ListaFuncionarios.get(i).getEmail().toLowerCase() );
        }
        System.out.println("=============================================");
        
        
        
    }//FIM CODIGO PRINCIPAL
    
}
