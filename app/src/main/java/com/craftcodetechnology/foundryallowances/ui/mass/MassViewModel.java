package com.craftcodetechnology.foundryallowances.ui.mass;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MassViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MassViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }

}