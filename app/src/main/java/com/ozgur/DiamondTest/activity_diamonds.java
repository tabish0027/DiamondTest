// Copyright 2021 The MediaPipe Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ozgur.DiamondTest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;

import com.google.mediapipe.formats.proto.LandmarkProto.Landmark;
import com.google.mediapipe.formats.proto.LandmarkProto.NormalizedLandmark;
import com.google.mediapipe.solutioncore.CameraInput;
import com.google.mediapipe.solutioncore.SolutionGlSurfaceView;
import com.google.mediapipe.solutioncore.VideoInput;
import com.google.mediapipe.solutions.hands.HandLandmark;
import com.google.mediapipe.solutions.hands.Hands;
import com.google.mediapipe.solutions.hands.HandsOptions;
import com.google.mediapipe.solutions.hands.HandsResult;

import java.io.IOException;
import java.io.InputStream;

/** Main activity of MediaPipe Hands app. */
public class activity_diamonds extends AppCompatActivity {
  private static final String TAG = "MainActivity";

  private Hands hands;
  private TextView tv_back;
  // Run the pipeline and the model inference on GPU or CPU.
  private static final boolean RUN_ON_GPU = true;

  GridView gridView;

  // Image demo UI and image loader components.
  private ActivityResultLauncher<Intent> imageGetter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diamonds);
    gridView = (GridView) findViewById(R.id.gridview);
    tv_back = findViewById(R.id.tv_back);
    String[] values = {
            "Java", "CSS3", "Android", "jQuery", "PHP", "MySpace",
            "HTML5", "Javascript", "MySQL", "Python", "Swift",
            "WordPress", "Facebook", "Youtube", "Twitter"
    } ;
    GridAdapter gridAdapter = new GridAdapter(this, values);

    gridView.setAdapter(gridAdapter);

    tv_back.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        activity_diamonds.this.finish();
      }
    });
  }

  @Override
  protected void onResume() {
    super.onResume();

  }

  @Override
  protected void onPause() {
    super.onPause();

  }

}
