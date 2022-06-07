package com.example.utsakb10119293.View;
// Dwi Irfansyah 10119293 IF-7
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.utsakb10119293.Presenter.SlidePagerAdapter;
import com.example.utsakb10119293.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentAbout extends Fragment{
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_beranda, null, false);
        List<Fragment> list = new ArrayList<>();

        list.add(new Page1());
        list.add(new Page2());
        list.add(new Page3());

        pager = view.findViewById(R.id.page);
        pagerAdapter = new SlidePagerAdapter(getChildFragmentManager(), list);
        pager.setAdapter(pagerAdapter);
        return view;
    }
}
