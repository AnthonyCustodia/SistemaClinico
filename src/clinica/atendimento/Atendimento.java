package clinica.atendimento;

import clinica.cadastro.Pessoa;
import clinica.cadastro.Profissional;

public class Atendimento {

    private Profissional profissional;

    public Atendimento(Profissional profissional) throws ProfissionalIndisponivel {

        if (!profissional.isDisponivel()) {
            throw new ProfissionalIndisponivel("Erro: Profissional indisponivel para atendimento");
        }

        this.profissional = profissional;
        this.profissional.setDisponibilidade(false);

        String nome = (profissional instanceof Pessoa) ? ((Pessoa) profissional).getNome() : "Profissional";
        System.out.println();
        System.out.println("Atendimento em andamento com " + nome + "...");
        System.out.println("Atendimento registrado com sucesso.");
    }

    public void cancelarAtendimento() {
        this.profissional.setDisponibilidade(true);
        System.out.println("Atendimento cancelado com sucesso.");
    }
}