package com.smyy.sharetour.buyer.module.order.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smyy.sharetour.buyer.R;
import com.smyy.sharetour.buyer.module.my.bean.ShippingAddressBean;
import com.smyy.sharetour.buyer.module.order.bean.OrderBean;
import com.smyy.sharetour.buyer.util.StringUtil;

import java.util.List;


public class OrderGoodsListAdapter extends RecyclerView.Adapter<OrderGoodsListAdapter.ViewHolder> {

    private Context mContext;
    private List<OrderBean.GoodsInfo> mDatas;

    public OrderGoodsListAdapter(Context context) {
        this.mContext = context;
    }

    public OrderGoodsListAdapter(Context context, List<OrderBean.GoodsInfo> goodsList) {
        this.mContext = context;
        this.mDatas = goodsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_order_goods_list, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final OrderBean.GoodsInfo data = mDatas.get(position);
        if (data != null) {
            holder.ivPic.setImageResource(R.mipmap.fake_goods_pic);
//            Glide.with(mContext).load(data.getGoodsPic()).into(holder.ivPic);//TODO RTRT
            holder.tvName.setText(data.getGoodsName());
            holder.tvSpec.setText(StringUtil.connect("规格：", data.getGoodsSpec()));
            holder.tvPrice.setText(StringUtil.connect("价格：", data.getGoodsPrice()));
            holder.tvCount.setText("× ️" + data.getGoodsCount());

            holder.tvName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemViewClickListener != null) {
                        onItemViewClickListener.onItemViewClick(holder.tvName, position, data);
                    }
                }
            });
            holder.tvSpec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemViewClickListener != null) {
                        onItemViewClickListener.onItemViewClick(holder.tvSpec, position, data);
                    }
                }
            });
            holder.tvPrice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemViewClickListener != null) {
                        onItemViewClickListener.onItemViewClick(holder.tvPrice, position, data);
                    }
                }
            });
            holder.tvCount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemViewClickListener != null) {
                        onItemViewClickListener.onItemViewClick(holder.tvCount, position, data);
                    }
                }
            });
        }
    }

    public List<OrderBean.GoodsInfo> getList() {
        return mDatas;
    }

    // 事件回调监听
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position, ShippingAddressBean data);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    // 事件回调监听
    private OnItemViewClickListener onItemViewClickListener;

    public interface OnItemViewClickListener {
        void onItemViewClick(View view, int position, OrderBean.GoodsInfo data);
    }

    public void setOnItemViewClickListener(OnItemViewClickListener listener) {
        this.onItemViewClickListener = listener;
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    public void setData(List<OrderBean.GoodsInfo> datas) {
        this.mDatas = datas;
        notifyDataSetChanged();
    }

    public void remove(int position) {
        mDatas.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, getItemCount() - position);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPic;
        private TextView tvName;
        private TextView tvSpec;
        private TextView tvPrice;
        private TextView tvCount;

        public ViewHolder(View itemView) {
            super(itemView);
            ivPic = (ImageView) itemView.findViewById(R.id.iv_order_goods_pic);
            tvName = (TextView) itemView.findViewById(R.id.iv_order_goods_name);
            tvSpec = (TextView) itemView.findViewById(R.id.iv_order_goods_spec);
            tvPrice = (TextView) itemView.findViewById(R.id.iv_order_goods_price);
            tvCount = (TextView) itemView.findViewById(R.id.iv_order_goods_count);
        }
    }
}
