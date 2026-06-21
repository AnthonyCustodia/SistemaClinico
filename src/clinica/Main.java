package clinica;

import clinica.atendimento.Atendimento;
import clinica.atendimento.ProfissionalIndisponivel;
import clinica.cadastro.CadastroGeral;
import clinica.cadastro.Medico;
import clinica.cadastro.Psicologo;

public class Main {

    public static void main(String[] args) {

        Medico medico = new Medico("Ana Martins", "CRM-12345", "Cardiologia");
        Psicologo psicologo = new Psicologo("Carlos Souza", "CRP-98765", "Terapia Cognitivo-Comportamental");

        CadastroGeral<Medico> cadastroMedico = new CadastroGeral<>();
        CadastroGeral<Psicologo> cadastroPsicologo = new CadastroGeral<>();

        cadastroMedico.adicionar(medico);
        cadastroPsicologo.adicionar(psicologo);

        System.out.println("\nProfissionais cadastrados:\n");
        medico.exibirDados();
        System.out.println();
        psicologo.exibirDados();

        Atendimento atendimento1 = null;

        try {
            atendimento1 = new Atendimento(medico);
        } catch (ProfissionalIndisponivel e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTentando novamente com Ana Martins...");
        try {
            Atendimento atendimento2 = new Atendimento(medico);
        } catch (ProfissionalIndisponivel e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nCancelando atendimento...");
        if (atendimento1 != null) {
            atendimento1.cancelarAtendimento();
        }

        System.out.println("\nDados atualizados:\n");
        medico.exibirDados();
    }
}