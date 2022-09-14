package ToDo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> toDo = new ArrayList<>();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        TodoList todoList = new TodoList();
        todoList.add("add");
        todoList.add(1,"addWithIndex");
        System.out.println(todoList.getTodos());
    }

    public void add(String todo) {
        toDo.add(todo);
    }

    public void add(int index, String todo) {
        if (index >= 0 && index <= toDo.size()) {
            toDo.add(index, todo);
        }
    }

    public void edit(String todo, int index) {
        if (index >= 0 && index < toDo.size()) {
            toDo.set(index, todo);
        }
    }

    public void delete(int index) {
        if(index >= 0 && index < toDo.size()) {
            toDo.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        return new ArrayList<>(toDo);
    }
}
