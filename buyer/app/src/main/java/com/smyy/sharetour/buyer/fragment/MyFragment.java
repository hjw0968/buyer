package com.smyy.sharetour.buyer.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smyy.sharetour.buyer.MyApplication;
import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.my.AccountSettingsActivity;
import com.smyy.sharetour.buyer.my.SettingsActivity;
import com.smyy.sharetour.buyer.my.base.MyBaseMvpFragment;
import com.smyy.sharetour.buyer.my.bean.UserInfoBean;
import com.smyy.sharetour.buyer.my.contract.IUserContract;
import com.smyy.sharetour.buyer.my.model.UserModel;
import com.smyy.sharetour.buyer.my.presenter.UserPresenter;
import com.smyy.sharetour.buyer.util.ActivityLauncher;
import com.smyy.sharetour.buyer.view.RedImageView;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by hasee on 2018/3/15.
 */

public class MyFragment extends MyBaseMvpFragment<UserPresenter> implements IUserContract.View {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.nsv_my_main)
    NestedScrollView nsvMain;
    @BindView(R.id.tv_my_username)
    TextView tvUsername;
    @BindView(R.id.tv_my_user_intro)
    TextView tvUserIntro;
    @BindView(R.id.iv_my_avatar)
    ImageView ivAvatar;
    @BindView(R.id.riv_my_awaiting_payment)
    RedImageView rivAwaitingPayment;
    @BindView(R.id.riv_my_awaiting_shipment)
    RedImageView rivAwaitingShipment;
    @BindView(R.id.riv_my_awaiting_confirmation)
    RedImageView rivAwaitingConfirmation;
    @BindView(R.id.riv_my_dispute)
    RedImageView rivDispute;

    private int toolbarHeight;

    @Override
    protected int getLayoutId() {
        return R.layout.layout_fragment_my;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void initView() {
        ViewGroup.LayoutParams toolbarParams = toolbar.getLayoutParams();
        toolbarHeight = toolbarParams.height;
    }

    private void setListener() {

        nsvMain.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            float oldAlpha = 0;

            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                float alpha = (float) scrollY / toolbarHeight;
                alpha = Math.min(alpha, 1);
                if (alpha != oldAlpha) {
                    oldAlpha = alpha;
                    toolbar.setBackgroundColor(ColorUtils.blendARGB(Color.TRANSPARENT
                            , ContextCompat.getColor(mActivity, R.color.black), alpha));
                }
            }
        });
    }

    @Override
    protected void initData(Bundle bundle) {
        initView();
        setListener();
    }

    @Override
    public void onResume() {
        super.onResume();
        initUserInfo();
    }

    private void initUserInfo() {
        mPresenter.getUserInfoCache(MyApplication.getApplication());
    }

    @OnClick({R.id.iv_my_setting, R.id.iv_my_msg, R.id.iv_my_edit_username, R.id.iv_my_avatar,
            R.id.tv_my_view_all_orders, R.id.lay_my_awaiting_payment, R.id.lay_my_awaiting_shipment, R.id.lay_my_awaiting_confirmation, R.id.lay_my_dispute,
            R.id.tv_my_cart, R.id.tv_my_demands, R.id.tv_my_reviews, R.id.tv_my_favorites, R.id.tv_my_interests, R.id.tv_help_and_feedback})
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.iv_my_setting:
                ActivityLauncher.viewActivity(mActivity, SettingsActivity.class);
                break;

            case R.id.iv_my_msg:

                break;

            case R.id.iv_my_edit_username:
                ActivityLauncher.viewActivity(mActivity, AccountSettingsActivity.class);
                break;

            case R.id.iv_my_avatar:
                ActivityLauncher.viewActivity(mActivity, AccountSettingsActivity.class);
                break;

            case R.id.tv_my_view_all_orders:

                break;

            case R.id.lay_my_awaiting_payment:

                break;

            case R.id.lay_my_awaiting_shipment:

                break;

            case R.id.lay_my_awaiting_confirmation:

                break;

            case R.id.lay_my_dispute:

                break;

            case R.id.tv_my_cart:

                break;

            case R.id.tv_my_demands:

                break;

            case R.id.tv_my_reviews:

                break;

            case R.id.tv_my_favorites:

                break;

            case R.id.tv_my_interests:

                break;

            case R.id.tv_help_and_feedback:

                break;

            default:
                break;
        }
    }

    @Override
    protected void initStatusBar() {
        setStatusBar(Color.BLACK);
    }

    @Override
    protected UserPresenter createPresenter() {
        return new UserPresenter(this, new UserModel());
    }

    @Override
    public void showUserInfo(UserInfoBean userInfo) {
        String username = userInfo.getUsername();
        if (!TextUtils.isEmpty(username)) {
            tvUsername.setText(username);
        }

        String userIntro = userInfo.getUserIntro();
        if (!TextUtils.isEmpty(userIntro)) {
            tvUserIntro.setText(userIntro);
        }

        String filePath = userInfo.getAvatar();
        if (TextUtils.isEmpty(filePath)) {
            Glide.with(this).load(R.mipmap.user_avatar).into(ivAvatar);
        } else {
            File file = new File(filePath);
            Glide.with(getContext()).load(file).into(ivAvatar);
        }
    }

    @Override
    public void showDialog(String s) {

    }

    @Override
    public void finish() {

    }
}
