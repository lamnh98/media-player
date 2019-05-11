package com.example.nguyenhailam16110370.nowplaying;

import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.nguyenhailam16110370.nowplaying.fragment.NowPlayingPlaylistTab;
import com.example.nguyenhailam16110370.nowplaying.fragment.ThumbnailTab;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new ThumbnailTab());
        list.add(new NowPlayingPlaylistTab());

        pager = findViewById(R.id.viewPager);
        pagerAdapter = new SlidePageAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);
    }
}
