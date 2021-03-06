package com.smyy.sharetour.buyer.backpacker.require;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.smyy.sharetour.buyer.Consts;
import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.base.mvp.BaseMvpActivity;
import com.smyy.sharetour.buyer.base.mvp.IBasePresenter;
import com.smyy.sharetour.buyer.bean.RequireBean;
import com.smyy.sharetour.buyer.module.order.OrderDetailActivity;
import com.smyy.sharetour.buyer.module.order.OrderHelper;
import com.smyy.sharetour.buyer.module.order.bean.OrderBean;
import com.smyy.sharetour.buyer.module.order.bean.OrderGoodsInfo;
import com.smyy.sharetour.buyer.tim.ChatActivity;
import com.tencent.imsdk.TIMConversationType;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Liliping
 * @org www.smyy.com
 * @email lilp@stjf.com
 * @package com.smyy.sharetour.buyer.BackPacker.Require
 * @fileName BackPackerRequireDetailsActivity
 * @date on 2018/4/23 0023 11:08
 * @describe 背包客需求详情页
 */
public class BackPackerRequireDetailsActivity extends BaseMvpActivity {


    public static final String REQUIRE_KEY = "require";
    public static final String REQUIRE_SUCCESS_KEY = "show_success";
    public static final String REQUIRE_TAKE_KEY = "take_require";
    public static final int REQUIRE_REQUEST_CANCEL = 100;
    @BindView(R.id.require_detail_time)
    TextView requireDetailTime;
    @BindView(R.id.require_detail_country)
    TextView requireDetailCountry;
    @BindView(R.id.require_detail_budget)
    TextView requireDetailBudget;
    @BindView(R.id.require_state_img)
    ImageView requireStateImg;
    @BindView(R.id.require_state)
    TextView requireState;
    @BindView(R.id.require_reward)
    TextView requireReward;
    @BindView(R.id.point_seller_info)
    TextView pointSellerInfo;
    @BindView(R.id.ready_good_ll)
    LinearLayout readyGoodLl;
    @BindView(R.id.cancel_take_require)
    TextView cancelTakeRequire;
    @BindView(R.id.cancel_frame)
    FrameLayout cancelFrame;
    @BindView(R.id.order_detail_frame)
    FrameLayout orderDetailFrame;
    @BindView(R.id.order_detail)
    TextView orderDetail;

    private RequireBean requireBean;
    private boolean isTakeRequire = false;
    private int reward = 0;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_backpacker_require_details;
    }

    @Override
    protected void configToolBar(Toolbar toolbar, TextView title) {

    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState, Intent intent) {
        Bundle bundle = getBundle();
        requireBean = (RequireBean) bundle.getSerializable(REQUIRE_KEY);
        isTakeRequire = bundle.getBoolean(REQUIRE_TAKE_KEY);
        hideToolBarLayout(true);

        SpannableString spanText = new SpannableString(getString(R.string.pay_price) + getString(R.string.four_space));

        SpannableString spanText1 = new SpannableString(requireBean.getRequire_budget());

        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.txt_main)),
                0, spanText.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.txt_price)),
                0, spanText1.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText1.setSpan(new AbsoluteSizeSpan(17, true),
                0, spanText1.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        requireDetailBudget.setText(spanText);
        requireDetailBudget.append(spanText1);

        spanText = new SpannableString(getString(R.string.expect_time) + getString(R.string.four_space));

        spanText1 = new SpannableString(requireBean.getRequire_time());

        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.txt_main)),
                0, spanText.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.txt_price)),
                0, spanText1.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText1.setSpan(new AbsoluteSizeSpan(15, true),
                0, spanText1.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);

        requireDetailTime.setText(spanText);
        requireDetailTime.append(spanText1);

        spanText = new SpannableString("期望购买地" + getString(R.string.two_space));

        spanText1 = new SpannableString(requireBean.getRequire_buy_place());

        spanText.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.txt_main)),
                0, spanText.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText1.setSpan(new AbsoluteSizeSpan(15, true),
                0, spanText1.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        spanText1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.txt_main)),
                0, spanText1.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        requireDetailCountry.setText(spanText);
        requireDetailCountry.append(spanText1);

        if (requireBean.getReward() != null) {
            reward = Integer.parseInt(requireBean.getReward());
            if (reward != 0) {
                requireReward.setText(getString(R.string.extra_reward) +
                        getString(R.string.four_space) + getString(R.string.money_unit) + reward);
                requireReward.setVisibility(View.VISIBLE);
            }
        }

        if (requireBean.getState() == Consts.REQUIRE_STATE_WAIT_SEND_GOOD || requireBean.getState() == Consts.REQUIRE_STATE_WAIT_RECEIVE_GOOD) {
            cancelFrame.setVisibility(View.GONE);
            switch (requireBean.getState()) {
                case Consts.REQUIRE_STATE_WAIT_SEND_GOOD:
                    pointSellerInfo.setText("请尽快为买家发货，并到订单详情填写物流信息");
                    pointSellerInfo.setTextColor(getResources().getColor(R.color.txt_price));
                    readyGoodLl.setVisibility(View.VISIBLE);
                    break;
            }

        } else if (requireBean.getState() == Consts.REQUIRE_STATE_WAIT_POINT) {
            readyGoodLl.setVisibility(View.VISIBLE);
            setWaitPointButton();
        } else if (requireBean.getState() == Consts.REQUIRE_STATE_INVALID) {
            setCancelButton();
        }

        requireState.setText(Consts.REQUIRE_SELLER_STATE_STRINGS[requireBean.getState()]);

        if (isTakeRequire) {
            setViewRequireButton();
        }
    }


    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUIRE_REQUEST_CANCEL:
                    requireState.setText(R.string.cancel_over);
                    requireBean.setState(Consts.REQUIRE_STATE_INVALID);
                    setCancelButton();
                    startActivity(new Intent(BackPackerRequireDetailsActivity.this, BackPackerRequireCancelSuccessActivity.class));
                    break;
                default:
                    break;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


    private void setWaitPointButton() {
        orderDetailFrame.setVisibility(View.GONE);
        Drawable d = getResources().getDrawable(R.mipmap.ic_undo_require);
        d.setBounds(0, 0, d.getMinimumWidth(), d.getMinimumHeight());
        cancelTakeRequire.setCompoundDrawables(d, null, null, null);
        cancelTakeRequire.setCompoundDrawablePadding(3);
        cancelTakeRequire.setText("取消需求");
    }

    private void setCancelButton() {
        orderDetailFrame.setVisibility(View.GONE);
        Drawable d = getResources().getDrawable(R.mipmap.ic_undo_require);
        d.setBounds(0, 0, d.getMinimumWidth(), d.getMinimumHeight());
        cancelTakeRequire.setCompoundDrawables(d, null, null, null);
        cancelTakeRequire.setCompoundDrawablePadding(3);
        cancelTakeRequire.setText(R.string.delete);
    }


    private void setViewRequireButton() {
        cancelFrame.setVisibility(View.GONE);
        orderDetailFrame.setBackgroundColor(getResources().getColor(R.color.btn_bg_normal));
        orderDetail.setText("去受理");
        orderDetail.setCompoundDrawables(null, null, null, null);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @OnClick({R.id.contact_frame, R.id.cancel_frame, R.id.order_detail_frame, R.id.back_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.contact_frame:
                ChatActivity.navToChat(BackPackerRequireDetailsActivity.this, "我是小桂子", TIMConversationType.C2C);
                break;
            case R.id.cancel_frame:
                if (requireBean.getState() == Consts.REQUIRE_STATE_WAIT_POINT) {
                    Intent intent = new Intent(BackPackerRequireDetailsActivity.this, BackPackerRequireCancelActivity.class);
                    startActivityForResult(intent, REQUIRE_REQUEST_CANCEL);
                } else {
                    finish();
                }
                break;
            case R.id.order_detail_frame:
                if (isTakeRequire) {
                    startActivity(new Intent(BackPackerRequireDetailsActivity.this, BackpackerTakeRequireActivity.class));
                    finish();
                } else {
                    Intent intent = new Intent(BackPackerRequireDetailsActivity.this, OrderDetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString(OrderHelper.ORDER_ID, getFakeData().getOrderId());
                    bundle.putInt(Consts.USER_TYPE, Consts.USER_TYPE_BACK_PACKER);
                    bundle.putSerializable(OrderDetailActivity.FAKE_DATA, getFakeData());
                    intent.putExtra("bundle", bundle);
                    startActivity(intent);
                }
                break;
            case R.id.back_btn:
                finish();
                break;
        }
    }

    private OrderBean getFakeData() {
        OrderGoodsInfo goodsInfo1 = new OrderGoodsInfo("1",
                "NIKE HUARACHE DRIFT (PSE) LALALALALA",
                "黑白/36.5",
                "",
                "￥9,918.00",
                1, "", OrderHelper.GOODS_TYPE_DEMAND, null);
        OrderGoodsInfo goodsInfo2 = new OrderGoodsInfo("2",
                "NIKE HUARACHE DRIFT (PSE) LALALALALA",
                "黑白/34",
                "",
                "￥8,918.00",
                1, "", OrderHelper.GOODS_TYPE_DEMAND, null);
        ArrayList<OrderGoodsInfo> fakeGoodsList2 = new ArrayList<>();
        fakeGoodsList2.add(goodsInfo1);
        fakeGoodsList2.add(goodsInfo2);

        OrderBean orderBean = new OrderBean("1",
                OrderHelper.STATUS_SELLER_AWAIT_SHIPPING,
                "",
                "我是小桂子的桂子",
                "",
                "",
                "我是小桂子",
                "",
                2,
                "￥18,866.00",
                "￥30.00",
                "",
                OrderHelper.GOODS_TYPE_STOCK,
                fakeGoodsList2);

        return orderBean;
    }

}
