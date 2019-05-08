package com.yanghaoyi.presentation.view.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.yanghaoyi.presentation.R;
import com.yanghaoyi.presentation.view.IMapView;

/**
 * @author : YangHaoYi on  2019/4/3011:09.
 * Email  :  yang.haoyi@qq.com
 * Description :地图实现View
 * Change : YangHaoYi on  2019/4/3011:09.
 * Version : V 1.0
 */
public class MapViewImpl implements IMapView {

    /** 上下文 **/
    private Context context;
    /** 提示信息 **/
    private TextView tvNotice;


    public MapViewImpl(Context context,TextView tvNotice) {
        this.context = context;
        this.tvNotice = tvNotice;
    }

    /** 放大地图 **/
    @Override
    public void zoomInFinish() {
        tvNotice.setText(context.getResources().getString(R.string.zoom_in_success));
    }

    /** 缩小地图 **/
    @Override
    public void zoomOutFinish() {
        tvNotice.setText(context.getResources().getString(R.string.zoom_out_success));
    }
}
