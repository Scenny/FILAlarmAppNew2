
package com.FourIL.AlarmApp;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.util.Log;

public class AlarmInitReceiver extends BroadcastReceiver {

    /**
     * Sets alarm on ACTION_BOOT_COMPLETED.  Resets alarm on
     * TIME_SET, TIMEZONE_CHANGED
     * 鎺ュ彈寮�鏈哄惎鍔ㄥ畬鎴愮殑骞挎挱锛�
     * 璁剧疆闂归挓锛屽綋鏃跺尯鏀瑰彉涔熻缃�
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.v("FourInLove", "AlarmInitReceiver" + action);

        // Remove the snooze alarm after a boot.
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Alarms.saveSnoozeAlert(context, -1, -1);
        }

        Alarms.disableExpiredAlarms(context);
        Alarms.setNextAlert(context);
    }
}
