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
public class LeftFragment extends Fragment {
    private EditText mEditTextLeft;
    private CallBacks mCallBacks;

    public interface CallBacks{
        void updateEdit(String string);
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBacks = (CallBacks) context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        mEditTextLeft = (EditText) view.findViewById(R.id.editor_left);
        mEditTextLeft.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextContent.get().setStringContent(s.toString());
                mCallBacks.updateEdit(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallBacks = null;
    }
}
*/
public class LeftFragment extends Fragment {
    private EditText mEditTextLeft;
    private CallBacks mCallBacks;

    public interface CallBacks{
        void updateEdit();
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBacks = (CallBacks) context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        mEditTextLeft = (EditText) view.findViewById(R.id.editor_left);
        mEditTextLeft.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextContent.get().setStringContent(s.toString());
                mCallBacks.updateEdit();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallBacks = null;
    }
}

