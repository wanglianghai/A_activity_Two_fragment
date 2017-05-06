package com.bignerdranch.android.example_tow_fragment_one_activity_communication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
public class MainActivity extends AppCompatActivity implements LeftFragment.CallBacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragmentLeft = fm.findFragmentById(R.id.fragment_left_container);
        if (fragmentLeft == null) {
            addInFm(fm, R.id.fragment_left_container, new LeftFragment());
        }
        Fragment fragmentRight = fm.findFragmentById(R.id.fragment_right_container);
        if (fragmentRight == null) {
            addInFm(fm, R.id.fragment_right_container, new RightFragment());
        }
    }

    private void addInFm(FragmentManager fm, int fragmentId, Fragment fragment){
        fm.beginTransaction()
                .add(fragmentId, fragment)
                .commit();
    }

    @Override
    public void updateEdit(String s) {
        RightFragment rf = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_right_container);
        rf.updateRightEditor(s);
    }
}
*/
public class MainActivity extends FragmentActivity implements LeftFragment.CallBacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragmentLeft = fm.findFragmentById(R.id.fragment_left_container);
        if (fragmentLeft == null) {
            addInFm(fm, R.id.fragment_left_container, new LeftFragment());
        }
        Fragment fragmentRight = fm.findFragmentById(R.id.fragment_right_container);
        if (fragmentRight == null) {
            addInFm(fm, R.id.fragment_right_container, new RightFragment());
        }
    }

    private void addInFm(FragmentManager fm, int fragmentId, Fragment fragment){
        fm.beginTransaction()
                .add(fragmentId, fragment)
                .commit();
    }

    @Override
    public void updateEdit() {
        RightFragment rf = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_right_container);
        rf.updateRightEditor();
    }
}

