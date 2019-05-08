package com.autoai.navisdk.listener;

import com.autoai.navisdk.enu.MapEvent;

/**
 * @author : YangHaoYi on  2019/4/3011:01.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on  2019/4/3011:01.
 * Version : V 1.0
 */
public interface MapEventListener {
    void onMapEvent(MapEvent event, Object data);
}
