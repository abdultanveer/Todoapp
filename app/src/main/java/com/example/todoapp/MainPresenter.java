package com.example.todoapp;

public class MainPresenter implements MainContract.Presenter {//8
MainContract.View view;//12

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity;//13
    }

    @Override
    public void onButtonClicked() {
        //mr view plz show a toast to him
        view.showToast();//14
    }
}
