package clinica.atendimento;

import clinica.cadastro.Paciente;
import clinica.cadastro.Profissional;

public class Atendimento {

    private Profissional profissional;
    private Paciente paciente;

    public Atendimento(Profissional profissional, Paciente paciente) {

        if (!profissional.dispinivel()) {
            System.out.println("Indisponivel ou ocupado.");
            return;
        }

        this.profissional = profissional;
        this.paciente = paciente;

        profissional.disponibilidade(false);
        System.out.println("Atendimento iniciado.");
    }

    public void finalizarAtendimento() {
        profissional.disponibilidade(true);
        System.out.println("Atendimento encerrado.");
    }
}