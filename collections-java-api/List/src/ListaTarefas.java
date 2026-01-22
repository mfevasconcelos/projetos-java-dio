import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        if(!tarefaList.isEmpty()) {
            for (Tarefa tarefa : tarefaList) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover.add(tarefa);
                }
            }
            tarefaList.removeAll(tarefaParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa2");

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.removerTarefa("tarefa2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
