package android.myapplicationdev.com.p09_gettingmylocations;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    boolean started;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d("Service", "Created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){


        if (started == false){
            started = true;
            Log.d("Service", "Started");
        } else {
            double lat = (double) intent.getExtras().get("lat");
            double lng = (double) intent.getExtras().get("lng");
            Log.d("Service", lat + " ," + lng);
        }


        return Service.START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }


}
