package com.example.harsh.myapplication;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;


public class NetworkCheck
{

    public static int TYPE_WIFI = 1;
    public static int TYPE_MOBILE = 2;
    public static int TYPE_NOT_CONNECTED = 0;

    /*
     * Checking the connectivity status.
     */
    public static int getConnectivityStatus(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return TYPE_WIFI;

            if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return TYPE_MOBILE;
        }
        return TYPE_NOT_CONNECTED;
    }
    // Generates string based on wifi connection status
    public static String getConnectivityStatusString(Context context) {
        int conn = NetworkCheck.getConnectivityStatus(context);
        String status = null;
        if (conn == NetworkCheck.TYPE_WIFI) {
            status = "Wifi enabled";
        } else if (conn == NetworkCheck.TYPE_MOBILE) {
            status = "Mobile data enabled";
        } else if (conn == NetworkCheck.TYPE_NOT_CONNECTED) {
            status = "Not connected to Internet";
        }
        return status;
    }
}

