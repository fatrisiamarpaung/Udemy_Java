package studikasus.repository;

import studikasus.entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    boolean remove(Integer number);
}
