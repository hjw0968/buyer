package com.smyy.sharetour.buyer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.flyco.tablayout.SlidingTabLayout;
import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.base.mvp.BaseMvpFragment;
import com.smyy.sharetour.buyer.base.mvp.IBasePresenter;
import com.smyy.sharetour.buyer.util.ActivityLauncher;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by hasee on 2018/3/15.
 */

public class FoundFragment extends BaseMvpFragment {
    @BindView(R.id.ttl_fount_search)
    LinearLayout ttlFountSearch;
    @BindView(R.id.tt_fount_scan)
    ImageView ttFountScan;
    @BindView(R.id.tt_fount_message)
    ImageView ttFountMessage;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    @BindView(R.id.stl_fount)
    SlidingTabLayout stlFount;
    @BindView(R.id.vp_fount)
    ViewPager vpFount;
    private MyPagerAdapter mAdapter;
    private final String[] mTitles = {
            "精选", "美容美肤", "潮流时尚"
            , "母婴健康", "文化玩乐", "美容美肤"
    };

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_fragment_fount;
    }

    @Override
    protected void initData(Bundle bundle) {
        changeTitleBarColor();
        for (String title : mTitles) {
            mFragments.add(FountSubclassFragment.getInstance(title));
        }
        mAdapter = new MyPagerAdapter(getActivity().getSupportFragmentManager());
        vpFount.setAdapter(mAdapter);
        stlFount.setViewPager(vpFount, mTitles);
    }

    private void changeTitleBarColor() {
        StatusBarAdapter.changeStatusBarColor(getActivity(), getResources().getColor(R.color.white));
    }


    @OnClick({R.id.ttl_fount_search, R.id.tt_fount_scan, R.id.tt_fount_message})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ttl_fount_search:
                break;
            case R.id.tt_fount_scan:
                break;
            case R.id.tt_fount_message:
                ActivityLauncher.viewGuideLoginActivity(getActivity());
                break;
        }
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }


        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }
}