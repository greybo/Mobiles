package com.mobiles.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.mobiles.R;
import com.mobiles.fragment.MobileFragment;
import com.mobiles.util.MobileUtils;

public class MainActivity extends AppCompatActivity {
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileUtils.changeFragmentTo(this, getFragment(index), "main");
    }

    private Fragment getFragment(int index) {
        Fragment fragment = null;
        switch (index) {
            case 0:
                fragment = new MobileFragment();
                break;
        }
        return fragment;
    }
}
