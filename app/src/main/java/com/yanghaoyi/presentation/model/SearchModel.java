package com.yanghaoyi.presentation.model;

import com.yanghaoyi.presentation.model.data.SearchResultData;

/**
 * @author : YangHaoYi on  2019/4/3017:23.
 * Email  :  yang.haoyi@qq.com
 * Description :搜索数据中心
 * Change : YangHaoYi on  2019/4/3017:23.
 * Version : V 1.0
 */
public class SearchModel {

    /**
     *  转换搜索数据
     * @return 搜索结果
     * **/
    public SearchResultData doNearbySearch(){
        SearchResultData resultData = new SearchResultData();
        resultData.setCode(0);
        resultData.setDescription("请求成功");
        SearchResultData.PayloadData payloadData = new SearchResultData.PayloadData();
        payloadData.setTitle("市图书馆");
        payloadData.setAddress("辽宁省沈阳市沈河区青年大街205号");
        payloadData.setNotice("市图书馆");
        payloadData.setLat("41.765923");
        payloadData.setLng("123.442674");
        return resultData;
    }
}
