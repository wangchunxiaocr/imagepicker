package com.victor.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.linchaolong.android.imagepicker.cropper.CropImage;
import com.linchaolong.android.imagepicker.cropper.CropImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 裁剪图片
     *
     * @param uri
     */
    private void cropImage(Uri uri, int requestCode) {
        // 打开裁剪图片界面
        CropImage.ActivityBuilder builder = CropImage.activity(uri);
        // 裁剪配置
        // 是否启动多点触摸
        builder.setMultiTouchEnabled(false)
                // 设置网格显示模式
                .setGuidelines(CropImageView.Guidelines.OFF)
                // 圆形/矩形
                .setCropShape(CropImageView.CropShape.RECTANGLE)
                // 宽高比
                .setAspectRatio(1, 1);
        // 启动裁剪界面
        builder.start(this, requestCode);
    }
}