public class Principal {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        System.out.println("O nome da pessoa é "+p.getNome());
        System.out.println("A idade da pessoa é "+p.getIdade());
        System.out.println("Adicionando a pessoa"+p.getAdicionar());
        System.out.println("Removendo a pessoa"+p.getRemover());
        System.out.println("Pesquisando a pessoa"+p.getPesquisar());
    }
}
