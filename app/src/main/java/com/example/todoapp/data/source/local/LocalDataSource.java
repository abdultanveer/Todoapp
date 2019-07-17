package com.example.todoapp.data.source.local;

import com.example.todoapp.data.source.TodoDataSource;

public class LocalDataSource implements TodoDataSource {

    DAO dao;

    public LocalDataSource() {
        dao = new DAO();
    }

    @Override
    public void getTodoNote(GetTodoNote callback) {
        dao.getTodoNote(callback);//cc
    }
}
