package clinica.cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroGeral<T extends Pessoa & Profissional> {

    private List<T> lista = new ArrayList<>();

    public void adicionar(T item) {
        lista.add(item);
    }

    public void listarTodos() {
        for (T item : lista) {
            item.exibirDados();
            System.out.println();
        }
    }
}
