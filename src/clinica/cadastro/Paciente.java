package clinica.cadastro;

public class Paciente extends Pessoa {

    private String historicoMedico;

    public Paciente(String nome, String historicoMedico) {
        super(nome);
        this.historicoMedico = historicoMedico;
    }

    @Override
    public void exibirDados() {
        System.out.println("Paciente: " + getNome());
        System.out.println("Historico: " + this.historicoMedico);
    }
}