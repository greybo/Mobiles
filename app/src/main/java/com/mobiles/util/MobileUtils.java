package com.mobiles.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.mobiles.R;

/**
 * Created by m on 16.10.2017.
 */

public class MobileUtils {
    public static void changeFragmentTo(FragmentActivity activity, Fragment fragment, String tag) {
        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,fragment,tag)
                .addToBackStack(null)
                .commit();
    }
}
