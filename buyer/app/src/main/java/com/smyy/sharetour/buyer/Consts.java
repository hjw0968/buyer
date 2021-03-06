package com.smyy.sharetour.buyer;

/**
 * Created by 伍振飞 on 2018/4/8 14:28
 * E-Mail Address：wuzf2012@sina.com
 */
public class Consts {
    /**
     * 判断是否平台账号
     */
    public static boolean isPhoneNum(String num) {
        boolean isPhoneNum = false;
        for (int i = 0; i < mTitles.length; i++) {
            if (mTitles[i].equals(num)) {
                isPhoneNum = true;
            }
        }
        return isPhoneNum;
    }

    /**
     * 默认账号
     */
    private static String[] mTitles = {"18680445592", "15607003736", "12345678901"};
    /**
     * 默认密码
     */
    public static String DEFAULT_LOGIN_PWD = "123456";
    /**
     * 默认验证码
     */
    public static String DEFAULT_SMS_CODE = "111111";
    /**
     * 默认倒计时时间
     */
    public static int DEFAULT_COUNTDOWN_TIME = 60;
    /**
     * 默认手机最小长度
     */
    public static int MIN_PHONE_LENGTH = 10;
    /**
     * 默认密码最小长度
     */
    public static int MIN_PWD_LENGTH = 5;
    /**
     * 默认验证码最小长度
     */
    public static int MIN_SMS_LENGTH = 5;

    public static String noteDetailsData = "{\n" +
            "\t\"mainList\": [{\n" +
            "\t\t\"imageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\"name\": \"老王\",\n" +
            "\t\t\"praise\": 88,\n" +
            "\t\t\"content\": \"看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？\",\n" +
            "\t\t\"time\": \"12-03\",\n" +
            "\t\t\"csList\": [{\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"老赵\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}]\n" +
            "\t}, {\n" +
            "\t\t\"imageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\"name\": \"老王\",\n" +
            "\t\t\"praise\": 88,\n" +
            "\t\t\"content\": \"看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？\",\n" +
            "\t\t\"time\": \"12-03\",\n" +
            "\t\t\"csList\": []\n" +
            "\t}, {\n" +
            "\t\t\"imageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\"name\": \"老王\",\n" +
            "\t\t\"praise\": 88,\n" +
            "\t\t\"content\": \"看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？\",\n" +
            "\t\t\"time\": \"12-03\",\n" +
            "\t\t\"csList\": [{\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"老赵\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}]\n" +
            "\t}, {\n" +
            "\t\t\"imageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\"name\": \"老王\",\n" +
            "\t\t\"praise\": 88,\n" +
            "\t\t\"content\": \"看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？\",\n" +
            "\t\t\"time\": \"12-03\",\n" +
            "\t\t\"csList\": [{\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"老赵\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}]\n" +
            "\t}, {\n" +
            "\t\t\"imageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\"name\": \"老王\",\n" +
            "\t\t\"praise\": 88,\n" +
            "\t\t\"content\": \"看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？\",\n" +
            "\t\t\"time\": \"12-03\",\n" +
            "\t\t\"csList\": [{\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"老赵\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}]\n" +
            "\t}, {\n" +
            "\t\t\"imageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\"name\": \"老王\",\n" +
            "\t\t\"praise\": 88,\n" +
            "\t\t\"content\": \"看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？看起来不错，不知道实际用了会怎样？\",\n" +
            "\t\t\"time\": \"12-03\",\n" +
            "\t\t\"csList\": [{\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"老赵\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}, {\n" +
            "\t\t\t\"TImageUrl\": \"http://cdn.haidii.com/v/1519779911/app/swg_xhzd/swg_xhzd_r_1.png\",\n" +
            "\t\t\t\"TName\": \"老王\",\n" +
            "\t\t\t\"TPassiveName\": \"\",\n" +
            "\t\t\t\"TContent\": \"应该是蛮好的，我自己试过了呢～应该是蛮好的，我自己试过了呢～\",\n" +
            "\t\t\t\"TPraise\": 88\n" +
            "\t\t}]\n" +
            "\t}]\n" +
            "}";

    //需求的状态
    public static final int REQUIRE_STATE_WAIT_SELLER = 0;
    public static final int REQUIRE_STATE_WAIT_POINT = 1;
    public static final int REQUIRE_STATE_WAIT_SEND_GOOD = 2;
    public static final int REQUIRE_STATE_WAIT_RECEIVE_GOOD = 3;
    public static final int REQUIRE_STATE_REQUIRE_DONE = 4;
    public static final int REQUIRE_STATE_INVALID = 5;

    public static final String[] REQUIRE_SELLER_STATE_STRINGS = {"待受理", "等待买家指定", "待发货", "已发货", "已完成", "已失效"};
    public static final String[] REQUIRE_STATE_STRINGS = {"等待买手受理", "待指定", "买手已受理", "买手已发货", "已完成", "已失效"};

    //用户类型
    public static final String USER_TYPE = "user_type";
    public static final int USER_TYPE_BUYER = 1;
    public static final int USER_TYPE_BACK_PACKER = 2;
    public static final int USER_TYPE_SELLER = 3;

    //交易明细类型
    public static final int STATEMENT_TYPE_IN = 1;//进账
    public static final int STATEMENT_TYPE_OUT = 2;//出账

    /**
     * 客服电话
     */
    public static final String SERVICE_TEL = "400 - 385385 -363";

    public static final int  COMMENT_SELECT_PICTURE_NUM = 6;
}
