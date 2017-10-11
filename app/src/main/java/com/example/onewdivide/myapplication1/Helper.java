package com.example.onewdivide.myapplication1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Onewdivide on 17/9/2560.
 */

public class Helper {

    public String stream = null;
    public Bitmap bmpp = null;
//    public Helper(){
//
//    }

    public Bitmap getHTTPData(String urlString){
        try{
            System.out.println("debug -> getHttpData in try : " + urlString);
            URL url = new URL(urlString);
            System.out.println("debug 1");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            System.out.println("debug 2");
            String UserCredentials = "dev : dev12345";
            urlConnection.setRequestProperty ("Authorization", "Basic "+ UserCredentials);
            urlConnection.setRequestMethod("GET");
            urlConnection.setUseCaches(false);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            System.out.println("this is url response code : "+ urlConnection.getResponseCode());
            if(urlConnection.getResponseCode() == 200){
                System.out.println("debug -> getHttpData in if");
                Bitmap bmp = BitmapFactory.decodeStream(urlConnection.getInputStream());
                bmpp = bmp;
                urlConnection.disconnect();

            }

        } catch (MalformedURLException e) {
            System.out.printf("debug -> getHttpData catch Malformed");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("debug -> getHttpData in IOException");
            e.printStackTrace();
        }
        return bmpp;
    }

}
