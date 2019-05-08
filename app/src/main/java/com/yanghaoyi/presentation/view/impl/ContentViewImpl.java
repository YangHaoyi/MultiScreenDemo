package com.yanghaoyi.presentation.view.impl;

import android.content.Context;
import android.widget.FrameLayout;

import com.yanghaoyi.presentation.view.IContentView;

/**
 * @author : YangHaoYi on  2019/5/510:28.
 * Email  :  yang.haoyi@qq.com
 * Description :根页面实现View
 * Change : YangHaoYi on  2019/5/510:28.
 * Version : V 1.0
 */
public class ContentViewImpl implements IContentView {

    /** 上下文 **/
    private Context context;
    /** 根布局 **/
    private FrameLayout fmContent;

    public ContentViewImpl(Context context, FrameLayout fmContent) {
        this.context = context;
        this.fmContent = fmContent;
    }

    @Override
    public void showSearchPage() {

    }

    @Override
    public void backToMap() {

    }
}
