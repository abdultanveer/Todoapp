package com.example.todoapp.data.source;

import com.example.todoapp.data.source.local.LocalDataSource;

/**
 * this class will get data either from localdb or remote db
 * based on the n/w connectivity
 */
public class TodoRepository implements TodoDataSource{

    TodoDataSource localTodoDataSource;

    public TodoRepository(){
        localTodoDataSource = new LocalDataSource();
    }

    @Override
    public void getTodoNote(GetTodoNote callback) {
        //if there is internet it'll get the data from webservice
        localTodoDataSource.getTodoNote(callback);//bb
    }
}
