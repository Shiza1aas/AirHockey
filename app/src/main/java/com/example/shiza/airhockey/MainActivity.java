package com.example.shiza.airhockey;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;


public class MainActivity extends Activity {
    GLSurfaceView glSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        glSurfaceView = new GLSurfaceView(this);

        glSurfaceView.setRenderer(new AirHockey());

        this.setContentView(glSurfaceView);

    }

    @Override
    protected void onPause() {
        super.onPause();
        glSurfaceView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        glSurfaceView.onResume();
    }
}
