package com.yanghaoyi.presentation.view.impl;

import android.widget.TextView;

import com.google.gson.Gson;
import com.yanghaoyi.presentation.model.data.SearchResultData;
import com.yanghaoyi.presentation.view.ISearchView;

/**
 * @author : YangHaoYi on  2019/5/59:41.
 * Email  :  yang.haoyi@qq.com
 * Description :搜索结果实现View
 * Change : YangHaoYi on  2019/5/59:41.
 * Version : V 1.0
 */
public class SearchViewImpl implements ISearchView {

    /** 搜索结果展示 **/
    private TextView tvSearchResult;

    public SearchViewImpl(TextView tvSearchResult) {
        this.tvSearchResult = tvSearchResult;
    }

    /**
     *  展示搜索结果
     * @param resultData 搜索结果数据bean
     * **/
    @Override
    public void showSearchResult(SearchResultData resultData) {
        Gson gson = new Gson();
        String result = gson.toJson(resultData);
        tvSearchResult.setText(result);
    }
}
