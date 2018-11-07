package buixexamplecom.batterymanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter ifilter=new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        this.registerReceiver(broadcastReceiver,ifilter);
    }
    private BroadcastReceiver broadcastReceiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int levelBartery=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
            Toast.makeText(getApplication(),"Pin Vol="+levelBartery+"mV",Toast.LENGTH_SHORT).show();
        }
    };

}
