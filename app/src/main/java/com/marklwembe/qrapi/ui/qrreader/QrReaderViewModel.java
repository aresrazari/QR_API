package com.marklwembe.qrapi.ui.qrreader;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QrReaderViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QrReaderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}