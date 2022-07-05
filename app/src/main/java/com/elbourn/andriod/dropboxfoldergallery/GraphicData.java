package com.elbourn.andriod.dropboxfoldergallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import java.io.File;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

public class GraphicData {

   File path;
   String onlinePath;
   String fileName;
   Bitmap thumbnail;

   GraphicData(File p, String oP, String fN, Bitmap t) {
      path = p;
      onlinePath = oP;
      fileName = fN;
      thumbnail = t;
   }
}