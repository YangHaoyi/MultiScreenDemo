package com.yanghaoyi.presentation.view.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.yanghaoyi.presentation.R;
import com.yanghaoyi.presentation.presenter.MapPresenter;
import com.yanghaoyi.presentation.view.IMapView;
import com.yanghaoyi.presentation.view.impl.MapViewImpl;

/**
 * @author : YangHaoYi on  2019/4/3010:18.
 * Email  :  yang.haoyi@qq.com
 * Description :地图页
 * Change : YangHaoYi on  2019/4/3010:18.
 * Version : V 1.0
 */
public class MapFrameLayout extends FrameLayout implements View.OnClickListener {

    /** 上下文 **/
    private Context context;
    /** 操作提示 **/
    private TextView tvMapNotice;
    /** 放大地图按钮 **/
    private TextView tvMapZoomIn;
    /** 缩小地图按钮 **/
    private TextView tvMapZoomOut;
    /** 跳转搜索页 **/
    private TextView tvToSearchPage;
    /** 地图视图接口 **/
    private IMapView mapView;
    /** 地图逻辑控制中心 **/
    private MapPresenter mapPresenter;
    /** 地图事件回调 **/
    private MapCallBackListener mapCallBackListener;

    public MapFrameLayout(Context context) {
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
        LayoutInflater.from(context).inflate(R.layout.framelayout_map, this);
        tvMapNotice = findViewById(R.id.tvMapNotice);
        tvMapZoomIn = findViewById(R.id.tvMapZoomIn);
        tvMapZoomOut = findViewById(R.id.tvMapZoomOut);
        tvToSearchPage = findViewById(R.id.tvToSearchPage);
        mapView = new MapViewImpl(context,tvMapNotice);
    }

    /** 初始化事件 **/
    private void initEvent(){
        tvMapZoomIn.setOnClickListener(this);
        tvMapZoomOut.setOnClickListener(this);
        tvToSearchPage.setOnClickListener(this);
        mapPresenter = new MapPresenter(mapView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvMapZoomIn:
                mapPresenter.zoomIn();
                break;
            case R.id.tvMapZoomOut:
                mapPresenter.zoomOut();
                break;
            case R.id.tvToSearchPage:
                mapCallBackListener.mapCallBackContent(MapEvent.Search,null);
                break;
            default:
                break;
        }
    }

    /** 设置地图事件回调 **/
    public void setMapCallBackListener(MapCallBackListener mapCallBackListener) {
        this.mapCallBackListener = mapCallBackListener;
    }

    /** 地图事件回调 **/
    public interface MapCallBackListener{
        void mapCallBackContent(MapEvent event,Object data);
    }

    /** 地图事件 **/
    public enum MapEvent{
        Search,
        Other
    }


    /**  EventBus模拟点击  */
    public void performZoomIn(){
        tvMapZoomIn.performClick();
    }
    public void performToSearch(){
        tvToSearchPage.performClick();
    }
}
