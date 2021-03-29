package com.marklwembe.qrapi.ui.qrgenerator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QrGeneratorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QrGeneratorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}