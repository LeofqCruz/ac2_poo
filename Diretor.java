public class Diretor extends FuncionarioBase implements Beneficios {
   private double bonusPercentual;
   private double auxilioMoradia;

   // construtor
   public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
      super(nome, salarioBase);
      this.bonusPercentual = bonusPercentual;
      this.auxilioMoradia = auxilioMoradia;
   }

   // seta o bônus percentual
   public void setBonusPercentual(double bonusPercentual) {
      this.bonusPercentual = bonusPercentual;
   }

   // pega o bônus percentual
   public double getBonusPercentual() {
      return bonusPercentual;
   }

   // seta o valor de auxilioMoradia
   public void setAuxilioMoradia(double auxilioMoradia) {
      this.auxilioMoradia = auxilioMoradia;
   }

   //pega o valor de auxilioMoradia
   public double getAuxilioMoradia() {
      return auxilioMoradia;
   }
   // método sobrescrito para calcular salario do diretor
   @Override
   public double calcularSalario() {
      return salarioBase + (salarioBase * bonusPercentual / 100) + auxilioMoradia;
   }
   // método sobrescrito para calcular o valor do bônus
   @Override
   public double calcularBonus(double percentual) {
      double bonus = this.salarioBase * percentual / 100;
      return bonus;
   }
   // método sobrescrito para calcular o valor de auxilioMoradia
   @Override
   public double calcularAuxilioMoradia(double valorAuxilioMoradia) {
      return auxilioMoradia;
   }

   //método sobrescrito para exibir informações do diretor
   @Override
   public String toString() {
      return "O(A) diretor(a) " + this.nome + " recebe R$"
            + calcularSalario() + " de sálario, sendo R$" + calcularBonus(bonusPercentual)
            + " de bonus e R$" + calcularAuxilioMoradia(auxilioMoradia) + " de auxílio moradia";
   }
}
