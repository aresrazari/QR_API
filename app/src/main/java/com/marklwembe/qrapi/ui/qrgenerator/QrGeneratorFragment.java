package com.marklwembe.qrapi.ui.qrgenerator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.marklwembe.qrapi.R;

public class QrGeneratorFragment extends Fragment {

    private QrGeneratorViewModel qrGeneratorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        qrGeneratorViewModel =
                new ViewModelProvider(this).get(QrGeneratorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_qr_generator, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        qrGeneratorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}