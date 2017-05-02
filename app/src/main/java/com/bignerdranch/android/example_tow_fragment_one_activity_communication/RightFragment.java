package com.bignerdranch.android.example_tow_fragment_one_activity_communication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Administrator on 2017/5/2/002.
 */

/*
public class RightFragment extends Fragment {
    private EditText mEditRight;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        mEditRight = (EditText) view.findViewById(R.id.editor_right);
        mEditRight.setText(TextContent.get().getStringContent());

        return view;
    }

    public void updateRightEditor(String s) {
        mEditRight.setText(s);
    }

}
*/
public class RightFragment extends Fragment {
    private EditText mEditRight;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        mEditRight = (EditText) view.findViewById(R.id.editor_right);
        mEditRight.setText(TextContent.get().getStringContent());

        return view;
    }

    public void updateRightEditor(String s) {
        mEditRight.setText(s);
    }

}

