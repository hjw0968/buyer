package com.smyy.sharetour.buyer.util;

import android.content.Context;
import android.content.Intent;

import com.smyy.sharetour.buyer.LiveActivity;
import com.smyy.sharetour.buyer.MyApplication;
import com.smyy.sharetour.buyer.backpacker.ALIPointsActivity;
import com.smyy.sharetour.buyer.backpacker.BackPackerCertificationActivity;
import com.smyy.sharetour.buyer.backpacker.BackPackerCertificationListActivity;
import com.smyy.sharetour.buyer.backpacker.BackPackerHomeActivity;
import com.smyy.sharetour.buyer.backpacker.BackpackAllEvaluationActivity;
import com.smyy.sharetour.buyer.backpacker.bomepage.BackpackCommentsActivity;
import com.smyy.sharetour.buyer.backpacker.bomepage.BackpackHomePageActivity;
import com.smyy.sharetour.buyer.backpacker.certification.ALiCertificationActivity;
import com.smyy.sharetour.buyer.backpacker.certification.ALiCertificationFinishActivity;
import com.smyy.sharetour.buyer.backpacker.certification.BackpackCertificationActivity1;
import com.smyy.sharetour.buyer.backpacker.certification.BackpackCertificationActivity2;
import com.smyy.sharetour.buyer.backpacker.certification.BackpackCertificationActivity3;
import com.smyy.sharetour.buyer.backpacker.certification.BackpackerModeActivity;
import com.smyy.sharetour.buyer.backpacker.payPwd.BackpackSetPayPwdActivity;
import com.smyy.sharetour.buyer.backpacker.payPwd.BackpackSettingActivity;
import com.smyy.sharetour.buyer.backpacker.payPwd.BackpackValidationPhoneActivity;
import com.smyy.sharetour.buyer.bean.CommentsBean;
import com.smyy.sharetour.buyer.home.comment.ui.MyReciveCommentActivity;
import com.smyy.sharetour.buyer.home.comment.ui.MyReciveLikeActivity;
import com.smyy.sharetour.buyer.home.detail.HomeDetailActivity;
import com.smyy.sharetour.buyer.home.message.MessageListActivity;
import com.smyy.sharetour.buyer.home.message.SystemMessageListActivity;
import com.smyy.sharetour.buyer.home.search.activity.SearchActivity;
import com.smyy.sharetour.buyer.home.search.activity.SearchDetailActivity;
import com.smyy.sharetour.buyer.module.my.AccountSettingsActivity;
import com.smyy.sharetour.buyer.module.my.CommentListActivity;
import com.smyy.sharetour.buyer.require.PublishRequireActivity;
import com.smyy.sharetour.buyer.require.RequireListActivity;
import com.smyy.sharetour.buyer.travel.SellerTravelDetailActivity;
import com.smyy.sharetour.buyer.travel.SellerTravelListActivity;
import com.smyy.sharetour.buyer.ui.ConfirmOrderActivity;
import com.smyy.sharetour.buyer.ui.GuideLoginActivity;
import com.smyy.sharetour.buyer.ui.LoginActivity;
import com.smyy.sharetour.buyer.ui.MainActivity;
import com.smyy.sharetour.buyer.ui.MoreReplyActivity;
import com.smyy.sharetour.buyer.ui.MyCollectionActivity;
import com.smyy.sharetour.buyer.ui.NoteDetailsActivity;
import com.smyy.sharetour.buyer.ui.PayFinishActivity;
import com.smyy.sharetour.buyer.ui.PersonalTagActivity;
import com.smyy.sharetour.buyer.ui.PwdLoginActivity;
import com.smyy.sharetour.buyer.ui.RegisterActivity;
import com.smyy.sharetour.buyer.ui.ReportActivity;
import com.smyy.sharetour.buyer.ui.SelectAreaCodeActivity;
import com.smyy.sharetour.buyer.ui.SetPwdActivity;
import com.smyy.sharetour.buyer.ui.SkinList.SkinListActivity;
import com.smyy.sharetour.buyer.ui.SkinList.SkinPeelerActivity;
import com.smyy.sharetour.buyer.ui.SmallBackpack.SmallBackpackActivity;
import com.smyy.sharetour.buyer.ui.Test1Activity;
import com.smyy.sharetour.buyer.ui.VerifyPhoneActivity;
import com.smyy.sharetour.buyer.ui.VideoDetailsActivity;
import com.smyy.sharetour.buyer.ui.buyCommodity.BuyHomePageActivity;
import com.smyy.sharetour.buyer.ui.buyCommodity.RecommendBuyActivity;
import com.smyy.sharetour.buyer.ui.test2.Test2Activity;

/**
 * Created by 伍振飞 on 2018/3/15 18:06
 * E-Mail Address：wuzf2012@sina.com
 */
public class ActivityLauncher {
    public static void viewTest1Activity(Context context) {
        Intent intent = new Intent(context, Test1Activity.class);
        context.startActivity(intent);
    }

    public static void viewTest2Activity(Context context) {
        Intent intent = new Intent(context, Test2Activity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到登录引导
     */
    public static void viewGuideLoginActivity(Context context) {
        Intent intent = new Intent(context, GuideLoginActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到登录
     */
    public static void viewLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到注册
     */
    public static void viewRegisterActivity(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到设置密码
     */
    public static void viewSetPwdActivity(Context context) {
        Intent intent = new Intent(context, SetPwdActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到密码登录
     */
    public static void viewPwdLoginActivity(Context context) {
        Intent intent = new Intent(context, PwdLoginActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到验证手机号找回密码
     */
    public static void viewVerifyPhoneActivity(Context context) {
        Intent intent = new Intent(context, VerifyPhoneActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到选择区号
     */
    public static void viewSelectAreaCodeActivity(Context context) {
        Intent intent = new Intent(context, SelectAreaCodeActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到笔记详情
     */
    public static void viewNoteDetailsActivity(Context context) {
        Intent intent = new Intent(context, NoteDetailsActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到视频详情
     */
    public static void viewVideoDetailsActivity(Context context) {
        Intent intent = new Intent(context, VideoDetailsActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到更多回复
     */
    public static void viewMoreReplyActivityty(Context context, CommentsBean.MainList data) {
        Intent intent = new Intent(context, MoreReplyActivity.class);
        intent.putExtra(MoreReplyActivity.BUNDLE_REPLY_DATA, data);
        context.startActivity(intent);
    }

    /**
     * 跳转到收藏列表
     */
    public static void viewMyCollectionActivity(Context context) {
        Intent intent = new Intent(context, MyCollectionActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到推荐买手
     */
    public static void viewRecommendBuyActivity(Context context) {
        Intent intent = new Intent(context, RecommendBuyActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到买手主页
     */
    public static void viewBuyHomePageActivity(Context context) {
        Intent intent = new Intent(context, BuyHomePageActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到买家个人中心界面
     */
    public static void viewAccountSettingsActivity(Context context) {
        Intent intent = new Intent(context, AccountSettingsActivity.class);
        context.startActivity(intent);
    }

    public static void viewHomeDetail(Context context) {
        Intent intent = new Intent(context, HomeDetailActivity.class);
        context.startActivity(intent);
    }

    public static void viewSearchActivity(Context context,String type) {
        Intent intent = new Intent(context, SearchActivity.class);
        intent.putExtra(SearchActivity.TYPE,type);
        context.startActivity(intent);
    }

    public static void viewSearchDetail(Context context, String type) {
        Intent intent = new Intent(context, SearchDetailActivity.class);
        intent.putExtra(SearchActivity.TYPE,type);
        context.startActivity(intent);
    }

    /**
     * 跳转到个人标签选择页面
     */
    public static void viewPersonalTagActivity(Context context) {
        Intent intent = new Intent(context, PersonalTagActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到发布需求页面
     */
    public static void viewPublishRequireActivity(Context context) {
        Intent intent = new Intent(context, PublishRequireActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到皮肤列表
     */
    public static void viewSkinListActivity(Context context) {
        Intent intent = new Intent(context, SkinListActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到皮肤界面
     */
    public static void viewSkinPeelerActivity(Context context) {
        Intent intent = new Intent(context, SkinPeelerActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到举报界面
     */
    public static void viewReportActivity(Context context) {
        Intent intent = new Intent(context, ReportActivity.class);
        context.startActivity(intent);
    }

    private static boolean isLogin(Context context) {
        if (MyApplication.getApplication().isLogin()) {
            return true;
        }
        viewGuideLoginActivity(context);
        return false;
    }

    /**
     * 跳转到需求列表页面
     */
    public static void viewMyRequireActivity(Context context) {
        Intent intent = new Intent(context, RequireListActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到评价列表页面
     */
    public static void viewMyCommentActivity(Context context) {
        Intent intent = new Intent(context, CommentListActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到小背包
     */
    public static void viewSmallBackpackActivity(Context context) {
        Intent intent = new Intent(context, SmallBackpackActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客首页
     */
    public static void viewBackpackerHomeActivity(Context context) {
        Intent intent = new Intent(context, BackPackerHomeActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到买家首页
     */
    public static void viewBuyerHomeActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到确认订单
     */
    public static void viewConfirmOrderActivity(Context context) {
        Intent intent = new Intent(context, ConfirmOrderActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到支付完成
     */
    public static void viewPayFinishActivity(Context context) {
        Intent intent = new Intent(context, PayFinishActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客认证
     */
    public static void viewBackpackCertificationActivity(Context context) {
        Intent intent = new Intent(context, BackpackCertificationActivity1.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客模式
     */
    public static void viewBackpackerModeActivity(Context context) {
        Intent intent = new Intent(context, BackpackerModeActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到芝麻信用认证界面
     */
    public static void viewALiCertificationActivity(Context context) {
        Intent intent = new Intent(context, ALiCertificationActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到芝麻信用认证完成界面
     */
    public static void viewALiCertificationFinishActivity(Context context) {
        Intent intent = new Intent(context, ALiCertificationFinishActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客认证步骤1
     */
    public static void viewBackpackCertificationActivity1(Context context) {
        Intent intent = new Intent(context, BackpackCertificationActivity1.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客认证步骤2
     */
    public static void viewBackpackCertificationActivity2(Context context) {
        Intent intent = new Intent(context, BackpackCertificationActivity2.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客认证步骤3
     */
    public static void viewBackpackCertificationActivity3(Context context) {
        Intent intent = new Intent(context, BackpackCertificationActivity3.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客个人主页
     */
    public static void viewBackpackHomePageActivity(Context context) {
        Intent intent = new Intent(context, BackpackHomePageActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客全部评价
     */
    public static void viewBackpackAllEvaluationActivity(Context context) {
        Intent intent = new Intent(context, BackpackAllEvaluationActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客管理
     */
    public static void viewBackpackSettingActivity(Context context) {
        Intent intent = new Intent(context, BackpackSettingActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到手机验证
     */
    public static void viewBackpackValidationPhoneActivity(Context context) {
        Intent intent = new Intent(context, BackpackValidationPhoneActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客设置支付密码
     */
    public static void viewBackpackSetPayPwdActivity(Context context) {
        Intent intent = new Intent(context, BackpackSetPayPwdActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到背包客更多评论
     */
    public static void viewBackpackCommentsActivity(Context context) {
        Intent intent = new Intent(context, BackpackCommentsActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到消息列表
     */
    public static void viewMessageListActivity(Context context) {
        Intent intent = new Intent(context, MessageListActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到系统消息
     */
    public static void viewSystemMessageListActivity(Context context) {
        Intent intent = new Intent(context, SystemMessageListActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到认证列表
     */
    public static void viewBackPackerCertificationListActivity(Context context) {
        Intent intent = new Intent(context, BackPackerCertificationListActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转到实名，护照认证详情
     */
    public static void viewBackPackerCertificationActivity(Context context, String type) {
        Intent intent = new Intent(context, BackPackerCertificationActivity.class);
        intent.putExtra(BackPackerCertificationActivity.TYPE,type);
        context.startActivity(intent);
    }

    /**
     * 跳转芝麻信用分展示
     */
    public static void viewALIPointsActivity(Context context) {
        Intent intent = new Intent(context, ALIPointsActivity.class);
        context.startActivity(intent);

    }


    public static void viewMyReciveCommentActivity(Context context) {
        Intent intent = new Intent(context, MyReciveCommentActivity.class);
        context.startActivity(intent);
    }

    public static void viewMyReciveLikeActivity(Context context) {
        Intent intent = new Intent(context, MyReciveLikeActivity.class);
        context.startActivity(intent);
    }

    /**
     * 跳转推荐的行程列表
     */
    public static void viewTravelListActivity(Context context) {
        Intent intent = new Intent(context, SellerTravelListActivity.class);
        context.startActivity(intent);

    }

    /**
     * 跳转行程详情
     */
    public static void viewTravelDetailActivity(Context context) {
        Intent intent = new Intent(context, SellerTravelDetailActivity.class);
        context.startActivity(intent);

    }

    public static void viewLiveActivity(Context context) {
        Intent intent = new Intent(context, LiveActivity.class);
        context.startActivity(intent);

    }
}

