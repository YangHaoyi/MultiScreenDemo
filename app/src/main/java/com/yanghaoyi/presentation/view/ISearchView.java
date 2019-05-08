package com.yanghaoyi.presentation.view;

import com.yanghaoyi.presentation.model.data.SearchResultData;

/**
 * @author : YangHaoYi on  2019/4/3017:25.
 * Email  :  yang.haoyi@qq.com
 * Description :搜索View接口
 * Change : YangHaoYi on  2019/4/3017:25.
 * Version : V 1.0
 */
public interface ISearchView {
    /** 显示搜索结果 **/
    void showSearchResult(SearchResultData resultData);
}
