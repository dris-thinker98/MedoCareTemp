package com.mobcomp.medocaretemp.ui.change_password;

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
import com.mobcomp.medocaretemp.R;
import com.mobcomp.medocaretemp.ui.profile.ProfileViewModel;

public class ChangePwdFragment extends Fragment {

    private ChangePwdViewModel changePwdViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        changePwdViewModel =
                new ViewModelProvider(this).get(ChangePwdViewModel.class);
        View root = inflater.inflate(R.layout.fragment_changepwd, container, false);
        final TextView textView = root.findViewById(R.id.text_password);
        changePwdViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}