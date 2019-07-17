package com.example.todoapp.data.source.local;

import com.example.todoapp.data.TodoNote;
import com.example.todoapp.data.source.TodoDataSource;

public class DAO {


    public void getTodoNote(TodoDataSource.GetTodoNote callback) {
        //open the db and query for the note and return the note
        TodoNote note = new TodoNote("mytitle","mysubtitle");
        callback.onNoteLoaded(note);//dd
    }
}
