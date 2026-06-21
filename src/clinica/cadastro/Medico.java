package clinica.cadastro;

public class Medico extends Pessoa implements Profissional {

    private final String crm;
    private final String especialidade;
    private boolean disponivel = true;

    public Medico(String nome, String crm, String especialidade) {
        super(nome);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        System.out.println("Medico: " + getNome());
        System.out.println("Registro: " + crm);
        System.out.println("Especialidade: " + especialidade);
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