package com.example.todoapp;

public class MainPresenter implements MainContract.Presenter {
MainContract.View view;

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity;
    }

    @Override
    public void onButtonClicked() {
        //mr view plz show a toast to him
        view.showToast();
    }
}
