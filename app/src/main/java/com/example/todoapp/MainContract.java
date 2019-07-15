package com.example.todoapp;

public interface MainContract {//3
    //view interface contains methods which presenter tells to the view
    interface  View{//4
        void showToast();//6
        void setText(String text);
    }

    //view tell to the presenter
    interface Presenter{//5
       void onButtonClicked();//7
    }
}
