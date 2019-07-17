package com.example.todoapp.data.source;

import com.example.todoapp.data.TodoNote;

public interface TodoDataSource {

    void getTodoNote(GetTodoNote callback);



    interface GetTodoNote {

        void onNoteLoaded(TodoNote note);

        void onDataNotAvailable();
    }
}
