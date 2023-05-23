public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // Criou um objeto chamado 'funcionario', do tipo 'Funcionario'

        Funcionario gerente = new Gerente();        // Objetos do tipo 'Funcionario', mas criados a partir de
        Funcionario vendedor = new Vendedor();      // suas subclasses (upcast).
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();  //Objeto do tipo 'Vendedor', mas criado a partir da
                                                            //classe mãe (downcast). NÃO ACONSELHADO.

    }
}
