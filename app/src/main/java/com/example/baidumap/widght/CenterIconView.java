package com.example.baidumap.widght;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

import com.baidu.mapapi.map.MapView;
import com.example.baidumap.R;

/**
 * Created by wangt on 2018/3/28.
 */
public class CenterIconView extends View {
    public int w;
    public int h;
    public Bitmap mBitmap;
    public MapView mMapView;

    public CenterIconView(Context context, MapView mMapView) {

        super(context);
        // 设置屏幕中心的图标
        mBitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.icon_marker_location);
        this.mMapView = mMapView;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 获取屏幕中心的坐标

        w = mMapView.getWidth() / 2 - mBitmap.getWidth() / 2;
        h = mMapView.getHeight() / 2 - mBitmap.getHeight();
        canvas.drawBitmap(mBitmap, w, h, null);
    }
}
