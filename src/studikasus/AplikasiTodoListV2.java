package studikasus;

import studikasus.repository.TodoListRepository;
import studikasus.repository.TodoListRepositoryImpl;
import studikasus.service.TodoListService;
import studikasus.service.TodoListServiceImpl;
import studikasus.view.TodoListView;

public class AplikasiTodoListV2 {

    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();

    }
}
