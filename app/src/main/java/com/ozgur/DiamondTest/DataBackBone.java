package com.ozgur.DiamondTest;

import android.graphics.Canvas;

import com.google.mediapipe.solutions.hands.Hands;

public class DataBackBone {
    public static Canvas canvas;
    public static Hands hands;
    public static DataBackBone dataBackBone=null;
    private DataBackBone(){

    }
    public static DataBackBone getInstance(){
        if(dataBackBone == null){
            dataBackBone= new DataBackBone();
        }
        return dataBackBone;
    }
}
