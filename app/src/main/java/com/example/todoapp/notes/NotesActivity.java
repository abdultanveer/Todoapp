package com.example.todoapp.notes;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.todoapp.R;
import com.example.todoapp.data.source.local.TodoContract.TodoEntry;


public class NotesActivity extends AppCompatActivity implements NotesContract.View {
NotesContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        presenter = new NotesPresenter(this);
        presenter.activityCreated();


    }

    @Override
    public void populateList(Cursor cursor) {
        ListView notesListView = findViewById(R.id.notelistview);
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,R.layout.rv_row,
                cursor,new String[]{TodoEntry.COLUMN_NAME_TITLE,TodoEntry.COLUMN_NAME_SUBTITLE},
               new int[]{R.id.textViewtitle,R.id.textViewsubtitle} );
        notesListView.setAdapter(adapter);

        
        /*RecyclerView mRecyclerView = (RecyclerView)
                findViewById(R.id.recyclerview);
        NotesAdapter mAdapter = new NotesAdapter(cursor,this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new
                LinearLayoutManager(this));*/

    }
}
