package com.example.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//MainActivity = view no biz logic in it-- notice board
public class MainActivity extends AppCompatActivity implements MainContract.View{
    MainContract.Presenter presenter;//9

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);//10
    }

    public void clickHandler(View view) {//2
        //hey mr presenter somebody clicked my button what should i do
        presenter.onButtonClicked();//11
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setText(String text) {
        TextView resTextView = findViewById(R.id.textViewresult);
        resTextView.setText(text);//ff

    }
}
