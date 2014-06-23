package com.Gaia.dihai;

import android.util.Log;

public class LogUtils
{
  public static String TAG = "Gaia";
  private static boolean DEBUG = true;

  public static void i(String paramString)
  {
    if(DEBUG)
        Log.i(TAG, paramString);
  }
  public static void w(String paramString)
  {
      if(DEBUG)
        Log.w(TAG, paramString);
  }
  public static void e(String paramString)
  {
      if(DEBUG)
        Log.e(TAG, paramString);
  }
}
