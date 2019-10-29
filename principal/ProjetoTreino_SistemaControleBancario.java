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
        Scanner entrada = new Scanner(System.in);
        
        //Instancia os objetos de todas as classes. 
        //P(String indicacao, int anoNascimento, String nome, String fone, String email, double idade, String cpf)
        Presidente obj1 = new Presidente("X",1970, "Stark","(11)11111-1111","aaa@override.com",49,"98765432111");
        Presidente obj2 = new Presidente("W", 1965, "Baratheon", "(22)22222-2222","bbb@override.com", 54,"98745632112");
        //D(int anoCargo, String situacao, String nome, String fone, String email, double idade, String cpf)
        Diretor obj3 = new Diretor(2015,"Ativo","Lannister", "(11)33333-3333","ccc@override.com", 62, "987456321");
        Diretor obj4 = new Diretor(2012,"Ativo","Targaryen","(22)44444-4444","ddd@override.com", 57, "98765413215");
        //G(String setor, double salario, int qtdadePessoasGerencia, String nome, String fone, String email, double idade, String cpf)
        Gerente obj5 = new Gerente("Compras",5378.20,20,"Mormont", "(11)55555-5555","eee@override.com",38,"98745654532");
        Gerente obj6 = new Gerente("Segurança",4800,15,"Conceição","(11)66555-6656","fff@override.com", 36,"9876547865");
        //E(String projeto, String sexo, double altura, double peso, String nome, String fone, String email, double idade, String cpf)
        Engenheiro obj7 = new Engenheiro("Novo Andar", "F", 1.71, 68.5, "Igritte","(22)77766-7677","ggg@override.com", 29, "98775847692");
        Engenheiro obj8 = new Engenheiro("Cofre", "Masculino", 1.83, 106.5,"Hodor","(11)88568-8878","hhh@override.com", 33,"9887763214");
        
        //item 9.
        Gerente obj9 = new Gerente("Compras",5378.20,20,"Mormont", "(11)55555-5555","eee@override.com",38,"33333333333");
        Gerente obj10 = new Gerente("Compras",5378.20,20,"Mormont", "(11)55555-5555","eee@override.com",38,"77777777777");
        
        //item 7.
        //Adiciona os objetos instanciados em uma lista tipada.
        ArrayList<Pessoa> listaFuncionarios = new ArrayList<Pessoa>();
       listaFuncionarios.add(obj1);
       listaFuncionarios.add(obj2);
       listaFuncionarios.add(obj3);
       listaFuncionarios.add(obj4);
       listaFuncionarios.add(obj5);
       listaFuncionarios.add(obj6);
       listaFuncionarios.add(obj7);
       listaFuncionarios.add(obj8);
       
       //item 9.
       listaFuncionarios.add(obj9);
       listaFuncionarios.add(obj10);
       
       //item 8.
       //Pesquisa um nome e a posição em que está na lista.
        System.out.println("Pesquisa Funcionário no sistema:");
        System.out.println("Digite o nome: \t");
        //String funcionario = entrada.next();
        String funcionario = "Mormont";
        boolean encontrado = false;
       for (int i = 0; i < listaFuncionarios.size(); i++) {
           if ( listaFuncionarios.get(i).getNome().contentEquals(funcionario) ) {
               encontrado = true;
               System.out.print("Funcionário: " + listaFuncionarios.get(i).getNome());
               System.out.println(" - Posição da lista: " + (1+i) );
           }
        }//fim for.
       if (!encontrado){
               System.out.println("Nome não consta na lista.");
       }
       for (int j = 0; j < listaFuncionarios.size(); j++ ) {
           System.out.println("" + listaFuncionarios.get(j).exibirDados());
       }
       //Métodos Especiais:
        System.out.println("============Métodos Especiais=======================");
        System.out.println("====================================================");
      
        System.out.println("\n"+obj1.getClass());
        System.out.println("\tAcessar contas: ");obj1.acessarContas(123456);
        System.out.println("\tComunicado: ");obj1.comunicado("O norte se lembra!");
                
        System.out.println("\n"+obj2.getClass());
        System.out.println("\tAcessar contas: ");obj2.acessarContas(456123);
        System.out.println("\tComunicado: ");obj2.comunicado("Promovido ao Banco de Braavos!");
                
        System.out.println("\n"+obj3.getClass());
        obj3.acessarContas(123452);
        
        System.out.println("\n"+obj4.getClass());
        obj4.acessarContas(123456);
        
        System.out.println("\n"+obj5.getClass());
        System.out.println("\tAbono" +obj5.abonoSalario(1));
        obj5.emailEquipe("\tOverride sempre paga suas dívidas!");
        
        System.out.println("\n"+obj6.getClass());
        System.out.println("\tAbono" +obj6.abonoSalario(5));
        obj6.emailEquipe("\tHodor");
     
       
    }//FIM CODIGO PRINCIPAL
    
}
