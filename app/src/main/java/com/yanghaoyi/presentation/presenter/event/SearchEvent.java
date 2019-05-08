package com.yanghaoyi.presentation.presenter.event;

/**
 * @author : YangHaoYi on  2019/5/814:17.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on  2019/5/814:17.
 * Version : V 1.0
 */
public class SearchEvent {

    public static final int DO_SEARCH = 1;
    public static final int BACK = 2;


    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
