package com.yanghaoyi.presentation.presenter;

import com.yanghaoyi.presentation.model.SearchModel;
import com.yanghaoyi.presentation.view.ISearchView;

/**
 * @author : YangHaoYi on  2019/4/3010:54.
 * Email  :  yang.haoyi@qq.com
 * Description :搜索逻辑控制中心
 * Change : YangHaoYi on  2019/4/3010:54.
 * Version : V 1.0
 */
public class SearchPresenter {

    /** 搜索数据Model **/
    private SearchModel searchModel;
    /** 搜索View接口 **/
    private ISearchView searchView;

    public SearchPresenter(ISearchView searchView) {
        this.searchView = searchView;
        searchModel = new SearchModel();
    }

    /** 执行搜索 **/
    public void nearbySearch(){
        searchView.showSearchResult(searchModel.doNearbySearch());
    }

}
