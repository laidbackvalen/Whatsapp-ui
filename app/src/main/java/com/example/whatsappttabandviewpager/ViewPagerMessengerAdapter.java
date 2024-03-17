package com.example.whatsappttabandviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {
    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GroupsFragment();
        } else if (position == 1) {
            return new ChatsFragment();
        } else if (position == 2) {
            return new StatusFragment();
        } else {
            return new CallsFragment();
        }


    }

    @Override
    public int getCount() {
        return 4;  //no.s of tab
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Group";
        } else if (position == 1) {
            return "Chat";
        } else if (position == 2) {
            return "Status";
        } else {
            return "Calls";
        }
    }
}

