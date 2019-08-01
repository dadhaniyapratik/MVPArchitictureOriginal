package com.mvparchiticture.util

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.support.v4.app.AlarmManagerCompat

class AlarmUtils {

    companion object {
        private var INSTANCE: AlarmUtils? = null
        private var alarmManager: AlarmManager? = null

        fun getInstance(context: Context): AlarmUtils? {
            if (INSTANCE == null) {
                synchronized(AlarmUtils::class) {
                    INSTANCE = AlarmUtils()
                    alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }


    fun setAlarm(pendingIntent: PendingIntent, triggerAt: Long){
        alarmManager?.let {
            AlarmManagerCompat.setExactAndAllowWhileIdle(it,AlarmManager.RTC_WAKEUP,triggerAt, pendingIntent)

        }
    }

    fun cancelAlarm(pendingIntent: PendingIntent){
        alarmManager?.cancel(pendingIntent)
    }
}