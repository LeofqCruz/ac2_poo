public class Main {

   public static void main(String[] args) {
      Departamento tecnologia = new Departamento("Tecnologia");

      Funcionario f = new Funcionario("João", 3000);
      Gerente g = new Gerente("Maria", 5000, 20);
      Diretor d = new Diretor("Daniel", 10000, 30, 2000);

      tecnologia.adicionarFuncionario(f);
      tecnologia.adicionarFuncionario(g);
      tecnologia.adicionarFuncionario(d);

      System.out.println("Folha de pagamento total do departamento Tecnologia: " + tecnologia.calcularFolhaPagamento());

      tecnologia.imprimirSalariosFuncionarios();
   }
}
