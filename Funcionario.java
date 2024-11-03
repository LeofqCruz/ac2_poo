public class Funcionario extends FuncionarioBase {

   // construtor
   public Funcionario(String nome, double salarioBase) {
      super(nome, salarioBase);
   }

   // método sobrescrito para calcular o salario do funcionario
   @Override
   public double calcularSalario() {
      return this.salarioBase;
   }

   // método sobrescrito para exibir informações do funcionário
   @Override
   public String toString() {
      return "O(A) funcionário(a) " + this.nome 
      + " recebe R$" + this.salarioBase + " de sálario";
   }
}
