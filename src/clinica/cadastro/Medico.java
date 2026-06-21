package clinica.cadastro;

public class Medico extends Pessoa implements Profissional {

    private String crm;
    private String especialidade;
    private boolean status;

    public Medico(String nome, String crm, String especialidade) {
        super(nome);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Registro: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void disponibilidade(boolean status) {

    }

    @Override
    public boolean dispinivel() {
        return false;
    }
}