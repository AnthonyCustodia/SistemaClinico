package clinica.cadastro;

public class Psicologo extends Pessoa implements Profissional {

    private final String crp;
    private final String abordagem;
    private boolean disponivel = true;

    public Psicologo(String nome, String crp, String abordagem) {
        super(nome);
        this.crp = crp;
        this.abordagem = abordagem;
    }

    @Override
    public void exibirDados() {
        System.out.println("Medico: " + getNome());
        System.out.println("Registro: " + crp);
        System.out.println("Abordagem: " + abordagem);
        System.out.println("Disponivel: " + disponivel);
    }

    @Override
    public void setDisponibilidade(boolean status) {
        this.disponivel = status;
    }

    @Override
    public boolean isDisponivel() {
        return this.disponivel;
    }
}