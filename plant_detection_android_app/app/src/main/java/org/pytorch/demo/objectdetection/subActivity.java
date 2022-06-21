package org.pytorch.demo.objectdetection;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class subActivity extends AppCompatActivity {
    private int mImageIndex2 = 0;
    private int pagenumber = 0;
    private int[] mImages2 = {R.drawable.baek_ryang_geum__fruit_, R.drawable.cham_ga_si__fruit_, R.drawable.cham_kkot__flower_,
    R.drawable.cham_sik__leaf_f_, R.drawable.don__fruit_, R.drawable.gu_sil_jat_bam__fruit_, R.drawable.hae_guk__flower_,
    R.drawable.hwang_geun__flower_, R.drawable.jop_eun_ip_cheon_seon_gwa__fruit_, R.drawable.keun_jo_rong__flower_,
    R.drawable.kka_ma_gwi_jjok__fruit_, R.drawable.kkwang_kkwang__fruit_, R.drawable.me_mil__flower_, R.drawable.sun_bi_gi__flower_};
    private Bitmap bitmapimage;
    private Bitmap bit;
    private ImageView imageView2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detection_result);
        Button pagebutton = findViewById(R.id.page);


        final Button previousbutton = findViewById(R.id.previousbutton);
        previousbutton.setVisibility(View.INVISIBLE);
        previousbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView2 = findViewById(R.id.imageView2);
                mImageIndex2 = (mImageIndex2 - 1);
                pagenumber = (pagenumber - 1);
                pagebutton.setText(String.format("%d/%d", pagenumber, mImages2.length));
                imageView2.setImageResource(mImages2[mImageIndex2]);
                }
            });



        final Button nextbutton = findViewById(R.id.nextbutton);
        nextbutton.setText(("Next"));
        nextbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView2 = findViewById(R.id.imageView2);
                previousbutton.setVisibility(View.VISIBLE);
                pagenumber = (pagenumber + 1);
                pagebutton.setText(String.format("%d/%d", pagenumber, mImages2.length));
                imageView2.setImageResource(mImages2[mImageIndex2]);
                mImageIndex2 = (mImageIndex2 + 1);

            }
        });


    }
}
