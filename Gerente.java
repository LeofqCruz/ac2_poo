public class Gerente extends FuncionarioBase implements Beneficios {
   private double bonusPercentual;

   // construtor
   public Gerente(String nome, double salarioBase, double bonusPercentual) {
      super(nome, salarioBase);
      this.bonusPercentual = bonusPercentual;
   }

   // pega o bônus percentual
   public double getBonusPercentual() {
      return bonusPercentual;
   }

   // seta o bônus percentual
   public void setBonusPercentual(double bonusPercentual) {
      this.bonusPercentual = bonusPercentual;
   }

   // método sobrescrito para calcular salario do gerente
   @Override
   public double calcularSalario() {
      return salarioBase + (salarioBase * bonusPercentual / 100);
   }

   // método sobrecrito para calcular o valor do bônus
   @Override
   public double calcularBonus(double percentual) {
      return this.salarioBase * percentual / 100;
   }

   // método sobrecrito para calcular o valor de auxilioMoradia
   @Override
   public double calcularAuxilioMoradia(double valorAuxilioMoradia) {
      System.out.println("Este funcionário não possui esse benefício");
      return 0;
   }

   // método sobrescrito para exibir informações do gerente
   @Override
   public String toString() {
      return "O(A) gerente " + this.nome + " recebe R$" 
      + calcularSalario() + " de sálario, sendo R$" + calcularBonus(bonusPercentual) +
      " de bonus.";
   }
}