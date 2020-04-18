package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Demonstrate Binder and AIDL.
 *
 *  visit https://developer.android.com/guide/components/aidl
 */
public class MyService extends Service {
    public MyService() {
    }

    private IBinder localBinder = new LocalBinder();

    /**
     * 先建立aidl文件，自动生成相同名字的java接口。使用这个接口的Stub。
     */
    private IMyAidlInterface.Stub aidlBinder = new IMyAidlInterface.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

    };


    public String MyMethod(){
        return "for binder";
    }

    public class LocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return localBinder;
    }
}
