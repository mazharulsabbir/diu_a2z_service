package edu.daffodilvarsity.a2zservice.ServicesFragment;


import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import edu.daffodilvarsity.a2zservice.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    private View myfragment;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ServicePagerAdapter pagerAdapter;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myfragment = inflater.inflate(R.layout.fragment_events, container, false);
        tabLayout = myfragment.findViewById(R.id.servicesTAB);
        viewPager = myfragment.findViewById(R.id.fragmentViewPager);
        return myfragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tabLayout.addTab(tabLayout.newTab().setText("Service"));
        tabLayout.addTab(tabLayout.newTab().setText("Ongoing"));
        tabLayout.addTab(tabLayout.newTab().setText("Upcoming"));
        tabLayout.setTabTextColors(Color.CYAN,Color.WHITE);
        tabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        pagerAdapter = new ServicePagerAdapter(getFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        //viewPager.addOnAdapterChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private class ServicePagerAdapter extends FragmentPagerAdapter {
        public ServicePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new ServiceFragment();
                case 1:
                    return new OngoingFragment();
                case 3:
                    return new UpcomingFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
