package com.smyy.sharetour.buyer.home.comment.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.base.mvp.BaseMvpFragment;
import com.smyy.sharetour.buyer.base.mvp.IBasePresenter;
import com.smyy.sharetour.buyer.home.comment.ui.adapter.MyReceiveCommentAdapter;
import com.smyy.sharetour.buyer.home.message.MessageListActivity;
import com.smyy.sharetour.buyer.home.message.MessageListAdapter;
import com.smyy.sharetour.buyer.home.model.MessageList;
import com.smyy.sharetour.buyer.home.model.MyReceiveComment;
import com.smyy.sharetour.buyer.tim.ChatActivity;
import com.tencent.imsdk.TIMConversationType;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * create by xuxiarong on 2018/4/13
 */
public class MyReceiveCommentFragment extends BaseMvpFragment {


    @BindView(R.id.rv_my_receive_comment)
    RecyclerView rvMyReceiveComment;

    private MyReceiveCommentAdapter mAdapter;
    public static MyReceiveCommentFragment getInstance(String title) {
        MyReceiveCommentFragment sf = new MyReceiveCommentFragment();
        return sf;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my_recieve_comment;
    }

    @Override
    protected void initData(Bundle bundle) {
        rvMyReceiveComment.setLayoutManager(new LinearLayoutManager(getContext()));
        final List<MyReceiveComment> data = new ArrayList<>();
        data.add(new MyReceiveComment());
        data.add(new MyReceiveComment());
        data.add(new MyReceiveComment());
        mAdapter = new MyReceiveCommentAdapter(data);
        rvMyReceiveComment.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this.getActivity());

    }


}
