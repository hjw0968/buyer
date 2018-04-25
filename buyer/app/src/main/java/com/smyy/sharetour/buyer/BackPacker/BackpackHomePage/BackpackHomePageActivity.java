package com.smyy.sharetour.buyer.BackPacker.BackpackHomePage;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.base.mvp.BaseMvpActivity;
import com.smyy.sharetour.buyer.base.mvp.IBasePresenter;
import com.smyy.sharetour.buyer.util.ActivityLauncher;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class BackpackHomePageActivity extends BaseMvpActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_backpack_home_page;
    }

    @Override
    protected void configToolBar(Toolbar toolbar, TextView title) {

    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState, Intent intent) {
        hideToolBarLayout(true);
        recyclerView.setNestedScrollingEnabled(false);//解决NestedScrollView+RecyclerView滑动冲突问题
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<BackpackHomePageBean> data = new ArrayList<>();
        data.add(new BackpackHomePageBean());
        data.add(new BackpackHomePageBean());
        data.add(new BackpackHomePageBean());
        data.add(new BackpackHomePageBean());
        recyclerView.setAdapter(new BackpackHomePageAdapter(data));
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @OnClick({R.id.ic_close, R.id.tv_editor, R.id.tv_more_comments})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ic_close:
                finish();
                break;
            case R.id.tv_editor:
                ActivityLauncher.viewAccountSettingsActivity(this);
                break;
            case R.id.tv_more_comments:
                ActivityLauncher.viewBackpackCommentsActivity(this);
                break;
        }
    }

    @Override
    protected void initStatusBar() {
        setStatusBar(Color.BLACK);
    }
}