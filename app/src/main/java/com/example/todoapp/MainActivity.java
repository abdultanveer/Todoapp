package com.example.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//MainActivity = view no biz logic in it-- notice board
public class MainActivity extends AppCompatActivity implements MainContract.View{
    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
    }

    public void clickHandler(View view) {
        //hey mr presenter somebody clicked my button what should i do
        presenter.onButtonClicked();
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setText(String text) {

    }
}
