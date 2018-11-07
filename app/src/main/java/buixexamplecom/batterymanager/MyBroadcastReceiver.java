package buixexamplecom.batterymanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent arg1) {
        Toast.makeText(context,"Boot Complete",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(context,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
