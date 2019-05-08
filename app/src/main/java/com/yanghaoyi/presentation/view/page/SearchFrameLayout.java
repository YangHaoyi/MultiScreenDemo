package com.yanghaoyi.presentation.view.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.yanghaoyi.presentation.R;
import com.yanghaoyi.presentation.presenter.SearchPresenter;
import com.yanghaoyi.presentation.view.ISearchView;
import com.yanghaoyi.presentation.view.impl.SearchViewImpl;

/**
 * @author : YangHaoYi on  2019/4/3010:18.
 * Email  :  yang.haoyi@qq.com
 * Description :搜索页
 * Change : YangHaoYi on  2019/4/3010:18.
 * Version : V 1.0
 */
public class SearchFrameLayout extends FrameLayout implements View.OnClickListener {

    /** 上下文 **/
    private Context context;
    /** 返回按钮 **/
    private TextView tvSearchBack;
    /** 搜索按钮 **/
    private TextView tvSearchDoSearch;
    /** 搜索结果 **/
    private TextView tvSearchResult;

    /** 搜索View接口 **/
    private ISearchView searchView;
    /** 搜索逻辑中心 **/
    private SearchPresenter searchPresenter;
    /** 搜索事件回调 **/
    private SearchCallBack searchCallBack;


    public SearchFrameLayout(Context context) {
        super(context);
        this.context = context;
        init();
    }

    /** 初始化 **/
    private void init(){
        initView();
        initEvent();
    }

    /** 初始化视图 **/
    private void initView(){
        LayoutInflater.from(context).inflate(R.layout.framelayout_search, this);
        tvSearchBack = findViewById(R.id.tvSearchBack);
        tvSearchDoSearch = findViewById(R.id.tvSearchDoSearch);
        tvSearchResult = findViewById(R.id.tvSearchResult);
        searchView = new SearchViewImpl(tvSearchResult);
    }

    /** 初始化事件 **/
    private void initEvent(){
        tvSearchBack.setOnClickListener(this);
        tvSearchDoSearch.setOnClickListener(this);
        searchPresenter = new SearchPresenter(searchView);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvSearchBack:
                searchCallBack.searchCallBackContent(SearchEvent.Back,null);
                break;
            case R.id.tvSearchDoSearch:
                searchPresenter.nearbySearch();
                break;
            default:
                break;
        }
    }

    /** 设置地图事件回调 **/
    public void setSearchBackListener(SearchCallBack searchCallBack) {
        this.searchCallBack = searchCallBack;
    }

    /** 搜索事件回调 **/
    public interface SearchCallBack{
        void searchCallBackContent(SearchEvent event, Object data);
    }

    /** 搜索事件 **/
    public enum SearchEvent{
        Back,
        Other
    }


    /**  EventBus模拟点击  */
    public void performDoSearch(){
        tvSearchDoSearch.performClick();
    }

    public void performBack(){
        tvSearchBack.performClick();
    }

}
