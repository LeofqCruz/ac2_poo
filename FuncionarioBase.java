public abstract class FuncionarioBase {
   protected String nome;
   protected double salarioBase;
   public char[] toString;

   // Construtor
   public FuncionarioBase(String nome, double salarioBase) {
      this.nome = nome;
      this.salarioBase = salarioBase;
   }

   // pega o nome do funcionário, seja qual for o seu tipo
   public String getNome() {
      return nome;
   }

   // seta o nome do funcionário, seja qual for o seu tipo
   public void setNome(String nome) {
      this.nome = nome;
   }

   // pega o salarioBase do funcionário, seja qual for o seu tipo
   public double getSalarioBase() {
      return salarioBase;
   }

   // seta o salarioBase do funcionário, seja qual for o seu tipo
   public void setSalarioBase(double salarioBase) {
      this.salarioBase = salarioBase;
   }

   // Método abstrato para calcular salario que deve ser herdado
   public abstract double calcularSalario();

   // sobrecarga do método para calcular salário com bonus adicional
   public double calcularSalario(double bonusAdicional) {
   return salarioBase + bonusAdicional;
   };

   // método abstrato para exibir informações que deve ser herdaddo
   @Override
   public abstract String toString();
}
