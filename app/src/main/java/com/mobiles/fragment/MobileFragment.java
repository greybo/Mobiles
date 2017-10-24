package com.mobiles.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobiles.R;
import com.mobiles.adapter.ListMobilesAdapter;

/**
 * Created by m on 22.10.2017.
 */

public class MobileFragment extends Fragment {
    private ListMobilesAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_mobile_list,container,false);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
