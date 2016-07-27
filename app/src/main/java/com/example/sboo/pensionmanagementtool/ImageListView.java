package com.example.sboo.pensionmanagementtool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by sboo on 2016-07-27.
 */
public class ImageListView extends LinearLayout{

    ImageView listImageView;
    TextView listImageDetail;

    Context context;

    public ImageListView(Context context, ImageListData listData){
        super(context);
        init(listData);
    }

    public ImageListView(Context context, AttributeSet attrs, ImageListData listData) {
        super(context, attrs);
        init(listData);
    }

    private void init(ImageListData listData){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.imagelistitem, this, true);

        listImageView = (ImageView)findViewById(R.id.listImageView);
        listImageDetail = (TextView)findViewById(R.id.listImageDetail);

        listImageView.setImageDrawable(listData.getImageData());
        listImageDetail.setText(listData.getImageDetail());
    }

}
