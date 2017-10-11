package com.example.onewdivide.myapplication1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;

import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.conn.ClientConnectionManager;
import cz.msebera.android.httpclient.conn.scheme.PlainSocketFactory;
import cz.msebera.android.httpclient.impl.conn.tsccm.ThreadSafeClientConnManager;
import cz.msebera.android.httpclient.params.BasicHttpParams;
import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.params.HttpProtocolParams;
import cz.msebera.android.httpclient.protocol.HTTP;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.logging.HttpLoggingInterceptor;

//import cz.msebera.android.httpclient.conn.ssl.SSLSocketFactory;
//import javax.net.ssl.SSLSocketFactory;

//import java.security.KeyStoreException;



/**
 * Created by Onewdivide on 18/9/2560.
 */

//class DownloadImagesTask extends AsyncTask<ImageView, Void, Bitmap> {
//    ImageView imageView = null;
//
//
//    @Override
//    protected Bitmap doInBackground(ImageView... imageViews) {
//        this.imageView = imageViews[0];
//
//        final String _url = "https://httpbin.org/image/png";
////        final String _url = "10.34.250.12/api/config/v1/maps/imagesource/domain_0_1500368087062.jpg";
//
//        try {
//            return download_Image(_url);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (CertificateException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//
//    @Override
//    protected void onPostExecute(Bitmap result) {
//
//        imageView.setImageBitmap(result);
//    }
//
//    private Bitmap download_Image(String url) throws NoSuchAlgorithmException, CertificateException {
//        Bitmap bmp = null;
//
//        try {
//            OkHttpClient client = createAuthenticatedClient("dev", "dev12345");
////            String credential = Credentials.basic("dev", "dev12345");
//
////            Request request = new Request.Builder()
////                    .header("Authorization", credential)
////                    .url( "https://10.34.250.12/api/config/v1/maps/imagesource/domain_0_1500368087062.jpg")
////                    .build();
////            Response response = doRequest(client,url);
////            Response response = client.newCall(request).execute();
//
////            response.execute();
////            response.request().newBuilder().header("Authorization", credential).build();
////            InputStream is = response.body().byteStream();
//            InputStream is = doRequest(client,url);
//            bmp = BitmapFactory.decodeStream(is);
//            return bmp;
//        } catch (Exception e) {
//        }
//        return bmp;
//    }
//
//
//    private static OkHttpClient createAuthenticatedClient(final String username,
//                                                          final String password) {
//        // build client with authentication information.
////        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
////        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
//        OkHttpClient httpClient = new OkHttpClient.Builder()
//                .authenticator(new Authenticator() {
//            public Request authenticate(Route route, Response response) throws IOException {
//                String credential = Credentials.basic(username, password);
//                return response.request().newBuilder().header("Authorization", credential).build();
//            }
//        }).build();
//        return httpClient;
//    }
//
//    private static InputStream doRequest(OkHttpClient httpClient, String anyURL) throws Exception {
//        Request request = new Request.Builder().url(anyURL).build();
//        Response response = httpClient.newCall(request).execute();
//        if (!response.isSuccessful()) {
//            Log.d("Debug this","response fail");
//            throw new IOException("Unexpected code " + response);
//        }
//        else{
//            Log.d("Debug this ","response pass");
//        }
////        System.out.println(response.body().string());
//        return response.body().byteStream();
//    }
//

//}

