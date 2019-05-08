package com.yanghaoyi.presentation.model.data;

/**
 * @author : YangHaoYi on  2019/4/3017:23.
 * Email  :  yang.haoyi@qq.com
 * Description :搜索结果数据Bean
 * Change : YangHaoYi on  2019/4/3017:23.
 * Version : V 1.0
 */
public class SearchResultData {

    private int code;
    private String description;
    private PayloadData data;

    public static class PayloadData{
        private String title;
        private String address;
        private String notice;
        private String lat;
        private String lng;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PayloadData getData() {
        return data;
    }

    public void setData(PayloadData data) {
        this.data = data;
    }
}
