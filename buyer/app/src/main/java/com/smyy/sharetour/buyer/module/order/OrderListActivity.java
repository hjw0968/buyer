package com.smyy.sharetour.buyer.module.order;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.flyco.tablayout.SlidingTabLayout;
import com.smyy.sharetour.buyer.Consts;
import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.home.search.fragment.SearchBuyerFragment;
import com.smyy.sharetour.buyer.home.search.fragment.SearchProductFragment;
import com.smyy.sharetour.buyer.module.my.base.MyBaseMvpActivity;
import com.smyy.sharetour.buyer.module.my.base.MyBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class OrderListActivity extends MyBaseMvpActivity {
    @BindView(R.id.stl_order_list)
    SlidingTabLayout stlOrderList;
    @BindView(R.id.vp_order_list)
    ViewPager vpOrderList;

    private final String[] mTitles = {"全部", "待付款", "待发货", "待收货", "待评价"};
    private FragmentAdapter mAdapter;

    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_order_list;
    }

    @Override
    protected void configToolBar(Toolbar toolbar, TextView title) {
        title.setText("我的订单");
    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState, Intent intent) {

        mFragments.add(OrderListFragment.getInstance(Consts.ORDER_STATE_ALL));
        mFragments.add(OrderListFragment.getInstance(Consts.ORDER_STATE_AWAIT_PAY));
        mFragments.add(OrderListFragment.getInstance(Consts.ORDER_STATE_AWAIT_SHIPPING));
        mFragments.add(OrderListFragment.getInstance(Consts.ORDER_STATE_AWAIT_CONFIRM));
        mFragments.add(OrderListFragment.getInstance(Consts.ORDER_STATE_AWAIT_REVIEW));

        mAdapter = new FragmentAdapter(this.getSupportFragmentManager());
        vpOrderList.setAdapter(mAdapter);
        stlOrderList.setViewPager(vpOrderList, mTitles);
    }

    @Override
    protected MyBasePresenter createPresenter() {
        return null;
    }

    private class FragmentAdapter extends FragmentPagerAdapter {
        public FragmentAdapter(FragmentManager fm) {
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