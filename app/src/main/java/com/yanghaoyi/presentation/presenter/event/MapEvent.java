package com.yanghaoyi.presentation.presenter.event;

/**
 * @author : YangHaoYi on  2019/5/814:17.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on  2019/5/814:17.
 * Version : V 1.0
 */
public class MapEvent {

    public static final int ZOOM_IN = 1;
    public static final int TO_SEARCH = 2;

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }




}
