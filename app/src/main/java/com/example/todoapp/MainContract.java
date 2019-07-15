package com.example.todoapp;

public interface MainContract {
    //view interface contains methods which presenter tells to the view
    interface  View{
        void showToast();
        void setText(String text);
    }

    //view tell to the presenter
    interface Presenter{
       void onButtonClicked();
    }
}
