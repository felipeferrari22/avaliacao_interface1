public class Principal {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        System.out.println("O nome da pessoa é "+p.getNome());
        System.out.println("A idade da pessoa é "+p.getIdade());
        System.out.println("Adicionar"+p.getAdicionar());
        System.out.println("Remover"+p.getRemover());
        System.out.println("Pesquisar"+p.getPesquisar());
    }
}
