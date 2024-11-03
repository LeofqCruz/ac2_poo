import java.util.ArrayList;

public class Departamento {
   private String nome;
   private ArrayList<FuncionarioBase> funcionarios;

   // construtor
   public Departamento(String nome) {
      this.nome = nome;
      this.funcionarios = new ArrayList<FuncionarioBase>();
   }

   // pega o nome do departamento
   public String getNome() {
      return nome;
   }

   // seta o nome do departamento
   public void setNome(String nome) {
      this.nome = nome;
   }

   // método para adicionar um funcionario ao departamento
   public void adicionarFuncionario(FuncionarioBase funcionario) {
      funcionarios.add(funcionario);
   }

   // método para remover um funcionario ao departamento
   public void removerFuncionario(FuncionarioBase funcionario) {
      funcionarios.remove(funcionario);
   }

   //  método para calcular o salário de todos os funcionários do departamento iterando por cada funcionario da coleção
   public double calcularFolhaPagamento() {
      double total = 0;
      for (FuncionarioBase funcionario : funcionarios) {
         total += funcionario.calcularSalario();
      }
      return total;
   }

   // método para imprimir o salario de todos os funcionarios do departamento um por um
   public void imprimirSalariosFuncionarios() {
      for (FuncionarioBase funcionario : funcionarios) {
         System.out.println(funcionario.getNome() + " recebe R$" + funcionario.calcularSalario() + " reais de salário");
      }
   }

}
