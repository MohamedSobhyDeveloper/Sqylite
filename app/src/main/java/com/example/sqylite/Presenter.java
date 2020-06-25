package com.example.sqylite;

public class Presenter {

    Info info;
    public Presenter(Info info) {
        this.info=info;
    }


    public void setUpModel(){

        DataModel dataModel=new DataModel("mamdouh");
           getMyname(dataModel.getName());
    }

    public void getMyname(String s){
        info.getname(s);
    }


}
