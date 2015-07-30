package com.example.shiza.airhockey;

import android.opengl.GLSurfaceView;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.*;

/**
 * Created by Shiza on 30-07-2015.
 */
public class AirHockey implements GLSurfaceView.Renderer {

    private static final int POSITION_COUNT = 2;
    private static final int BYTES_PER_FLOAT = 4;

    private final FloatBuffer vertex;


    public AirHockey() {
        float[] tableVerticesWithTriangles =
                {
                        0f, 0f, 9f, 14f, 0f, 14f, //first triangle
                        0f, 0f, 9f, 0f, 9f, 14f,//second triangle
                        0f, 7f, 9f, 7f,//the horizontal divider
                        4.5f, 2f, 4.5f, 12f//the vertical line
                };

        vertex = ByteBuffer.allocateDirect(tableVerticesWithTriangles.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        vertex.put(tableVerticesWithTriangles);
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        glClear(GL_COLOR_BUFFER_BIT);
    }
}
