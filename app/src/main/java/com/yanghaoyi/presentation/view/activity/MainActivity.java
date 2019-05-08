package com.yanghaoyi.presentation.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.yanghaoyi.presentation.R;
import com.yanghaoyi.presentation.presenter.PresentationPresenter;
import com.yanghaoyi.presentation.view.compoent.FloatButton;
import com.yanghaoyi.presentation.view.page.MapFrameLayout;
import com.yanghaoyi.presentation.view.page.SearchFrameLayout;

/**
 * @author : YangHaoYi on 2019/1/2.
 *         Email  :  yang.haoyi@qq.com
 *         Description :多屏显示示例
 *         Change : YangHaoYi on 2019/1/2.
 *         Version : V 1.0
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener, MapFrameLayout.MapCallBackListener, SearchFrameLayout.SearchCallBack {

    /** 展示第二块屏幕按钮 **/
    private TextView tvShowPresentation;
    /** Presentation逻辑控制中心 **/
    private PresentationPresenter presentationPresenter;
    /** 页面根布局 **/
    private FrameLayout fmActivityContent;
    /** 地图页 **/
    private MapFrameLayout mapFrameLayout;
    /** 搜索页 **/
    private SearchFrameLayout searchFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /** 初始化 **/
    private void init(){
        initView();
        initEvent();
    }

    /** 初始化视图 **/
    private void initView(){
        tvShowPresentation = findViewById(R.id.tvShowPresentation);
        fmActivityContent = findViewById(R.id.fmActivityContent);
        initPage();
    }

    /** 初始化页面 **/
    private void initPage(){
        mapFrameLayout = new MapFrameLayout(this);
        mapFrameLayout.setMapCallBackListener(this);
        fmActivityContent.addView(mapFrameLayout);
        FloatButton floatButton = new FloatButton(this);
        fmActivityContent.addView(floatButton);
    }

    /** 初始化事件 **/
    private void initEvent(){
        presentationPresenter = new PresentationPresenter();
        tvShowPresentation.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvShowPresentation:
                presentationPresenter.openSearchPresentation(MainActivity.this);
                break;
            default:
                break;
        }
    }

    /** 地图页面回调 **/
    @Override
    public void mapCallBackContent(MapFrameLayout.MapEvent event, Object data) {
        switch (event){
            case Search:
                if(null == searchFrameLayout){
                    searchFrameLayout = new SearchFrameLayout(this);
                    searchFrameLayout.setSearchBackListener(this);
                    fmActivityContent.addView(searchFrameLayout);
                }else {
                    fmActivityContent.addView(searchFrameLayout);
                }
                break;
            case Other:
                break;
            default:
                break;
        }
    }

    /** 搜索页面回调 **/
    @Override
    public void searchCallBackContent(SearchFrameLayout.SearchEvent event, Object data) {
        switch (event){
            case Back:
                fmActivityContent.removeView(searchFrameLayout);
                searchFrameLayout = null;
                break;
            case Other:
                break;
            default:
                break;
        }
    }
}
