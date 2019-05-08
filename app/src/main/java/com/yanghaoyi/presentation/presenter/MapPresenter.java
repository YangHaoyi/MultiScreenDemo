package com.yanghaoyi.presentation.presenter;

import com.autoai.navisdk.MapManager;
import com.autoai.navisdk.enu.MapEvent;
import com.autoai.navisdk.listener.MapEventListener;
import com.yanghaoyi.presentation.view.IMapView;

/**
 * @author : YangHaoYi on  2019/4/3010:54.
 * Email  :  yang.haoyi@qq.com
 * Description :地图页逻辑控制中心
 * Change : YangHaoYi on  2019/4/3010:54.
 * Version : V 1.0
 */
public class MapPresenter {

    /**  地图视图View接口  **/
    private IMapView mapView;

    public MapPresenter(IMapView mapView) {
        this.mapView = mapView;
    }

    /**  放大地图  **/
    public void zoomIn(){
        MapManager.getInstance().zoomIn(new MapEventListener() {
            @Override
            public void onMapEvent(MapEvent event, Object data) {
                mapView.zoomInFinish();
            }
        });
    }

    /**  缩小地图  **/
    public void zoomOut(){
        MapManager.getInstance().zoomOut(new MapEventListener() {
            @Override
            public void onMapEvent(MapEvent event, Object data) {
                mapView.zoomOutFinish();
            }
        });
    }


}
