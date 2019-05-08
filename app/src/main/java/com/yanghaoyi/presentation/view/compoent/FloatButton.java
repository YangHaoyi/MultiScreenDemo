package com.yanghaoyi.presentation.view.compoent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yanghaoyi.presentation.R;
import com.yanghaoyi.presentation.presenter.event.MapEvent;
import com.yanghaoyi.presentation.presenter.event.SearchEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * @author : YangHaoYi on  2019/5/811:31.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on  2019/5/811:31.
 * Version : V 1.0
 */
public class FloatButton extends LinearLayout implements View.OnClickListener {

    private Context context;
    private TextView tvPresentationZoomIn;
    private TextView tvPresentationToSearch;
    private TextView tvPresentationDoSearch;
    private TextView tvPresentationSearchBack;


    public FloatButton(Context context) {
        super(context);
        this.context = context;
        init();
    }

    private void init(){
        initView();
        initEvent();
    }

    private void initView(){
        LayoutInflater.from(context).inflate(R.layout.linearlayout_float_button,this);
        tvPresentationZoomIn = findViewById(R.id.tvPresentationZoomIn);
        tvPresentationToSearch = findViewById(R.id.tvPresentationToSearch);
        tvPresentationDoSearch = findViewById(R.id.tvPresentationDoSearch);
        tvPresentationSearchBack = findViewById(R.id.tvPresentationSearchBack);
    }

    private void initEvent(){
        tvPresentationZoomIn.setOnClickListener(this);
        tvPresentationToSearch.setOnClickListener(this);
        tvPresentationDoSearch.setOnClickListener(this);
        tvPresentationSearchBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvPresentationZoomIn:
                MapEvent mapEvent = new MapEvent();
                mapEvent.setCode(MapEvent.ZOOM_IN);
                EventBus.getDefault().post(mapEvent);
                break;
            case R.id.tvPresentationToSearch:
                MapEvent toSearch = new MapEvent();
                toSearch.setCode(MapEvent.TO_SEARCH);
                EventBus.getDefault().post(toSearch);
                break;
            case R.id.tvPresentationDoSearch:
                SearchEvent searchEvent = new SearchEvent();
                searchEvent.setCode(SearchEvent.DO_SEARCH);
                EventBus.getDefault().post(searchEvent);
                break;
            case R.id.tvPresentationSearchBack:
                SearchEvent back = new SearchEvent();
                back.setCode(SearchEvent.BACK);
                EventBus.getDefault().post(back);
                break;
            default:
                break;
        }
    }
}
