package com.example.kcalmera.ui.cam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.kcalmera.R;

public class CamFragment extends Fragment {

    private CamViewModel camViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        camViewModel =
                ViewModelProviders.of(this).get(CamViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cam, container, false);
        /*
        final TextView textView = root.findViewById(R.id.text_home);
        camViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}