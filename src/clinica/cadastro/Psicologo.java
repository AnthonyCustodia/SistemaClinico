package clinica.cadastro;

public class Psicologo extends Pessoa implements Profissional {

    private String crp;
    private String especialidade;

    public Psicologo(String nome, String crp, String especialidade) {
        super(nome);
        this.crp = crp;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }

    @Override
    public void disponibilidade(boolean status) {

    }

    @Override
    public boolean dispinivel() {
        return false;
    }
}