package com.craftcodetechnology.foundryallowances.ui.dimension;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DimensionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DimensionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}