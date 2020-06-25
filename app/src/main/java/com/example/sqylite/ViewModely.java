package com.example.sqylite;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModely extends ViewModel {

    DataModel dataModel;

    MutableLiveData<String> mutableLiveData=new MutableLiveData<>();



    public void setUpModel(){

         dataModel=new DataModel("mamdouh");
         getMyname(dataModel.getName());

    }

    public void getMyname(String s){
        mutableLiveData.setValue(s);
    }

}
