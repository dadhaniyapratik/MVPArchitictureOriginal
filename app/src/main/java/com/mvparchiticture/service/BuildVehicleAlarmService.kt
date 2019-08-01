//package com.mvparchiticture.service
//
//import android.app.*
//import android.app.Notification.DEFAULT_VIBRATE
//import android.content.Context
//import android.content.Intent
//import android.os.Build
//import android.support.v4.app.NotificationCompat
//import com.mvparchiticture.R
//import com.mvparchiticture.ui.splash.SplashActivity
//import com.mvparchiticture.util.Constants
//import timber.log.Timber
//
//
//class BuildVehicleAlarmService : IntentService("BuildVehicleAlarmService") {
//
//
//    override fun onHandleIntent(intent: Intent?) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
//            startForeground(System.currentTimeMillis().toInt(), getForeGroundNotification())
//
//        val bundle = intent?.getBundleExtra("bundle")
//        bundle?.classLoader = BuildVehicleWrapper::class.java.classLoader
//
//        val data = bundle?.getParcelable(Constants.IntentFilter.LOCAL_NOTIFICATION_DATA) as? BuildVehicleWrapper
//        showNotification("CarCostCanada", "Generate your pending vehicle report.", data)
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
//            stopForeground(true)
//
//        // stopForeground(true)
//
//    }
//
///*
//    override fun onBind(intent: Intent?): IBinder? {
//        return null
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//
//    }
//*/
///*
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//
//
//    }
//*/
//
//    private fun getForeGroundNotification(): Notification {
//        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        val builder: NotificationCompat.Builder?
//
//        val intent = Intent()
//        val pendingIntent = PendingIntent.getActivity(this, 158, intent, PendingIntent.FLAG_UPDATE_CURRENT)
//
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val channelId = getString(R.string.default_notification_channel_id)
//            val importance = NotificationManager.IMPORTANCE_HIGH
//            val mChannel = NotificationChannel(channelId, "CarCostCanada", importance)
//
//            builder = getNotificationBuilder(this, "",
//                    "", pendingIntent, true, DEFAULT_VIBRATE)
//                    .setChannelId(channelId)
//
//            notificationManager.createNotificationChannel(mChannel)
//        } else {
//            builder = getNotificationBuilder(this, "",
//                    "",
//                    pendingIntent, true, DEFAULT_VIBRATE)
//        }
//
//        return builder?.build()!!
//
//    }
//
//    private fun showNotification(title: String, message: String, data: BuildVehicleWrapper?) {
//        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//
//        val intent1 = Intent(this, SplashActivity::class.java)
//        //need to change the model
//        intent1.putExtra(Constants.IntentFilter.LOCAL_NOTIFICATION_DATA, data)
//
//
//        val contentIntent = PendingIntent.getActivity(this, System.currentTimeMillis().toInt(), intent1, PendingIntent.FLAG_UPDATE_CURRENT)
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val channelId = getString(R.string.default_notification_channel_id)
//            val importance = NotificationManager.IMPORTANCE_HIGH
//            val mChannel = NotificationChannel(channelId, "CarCostCanada", importance)
//            val builder: NotificationCompat.Builder?
//
//            builder = getNotificationBuilder(this, title,
//                    message, contentIntent, true, DEFAULT_VIBRATE)
//                    .setChannelId(channelId)
//
//            notificationManager.createNotificationChannel(mChannel)
//            notificationManager.notify(System.currentTimeMillis().toInt(), builder!!.build())
//        } else {
//            val builder = getNotificationBuilder(this, title,
//                    message,
//                    contentIntent, true, DEFAULT_VIBRATE)
//            notificationManager.notify(System.currentTimeMillis().toInt(), builder.build())
//        }
//    }
//
//    private fun getNotificationBuilder(context: Context, title: String, message: String,
//                                       contentIntent: PendingIntent?,
//                                       autoCancel: Boolean, defaults: Int): NotificationCompat.Builder {
//
//        val builder = NotificationCompat.Builder(context, getString(R.string.default_notification_channel_id))
//                .setSmallIcon(R.mipmap.ic_launcher_round)
//                .setContentTitle(title)
//                .setContentText(message)
//                .setStyle(NotificationCompat.BigTextStyle().bigText(message))
//                .setDefaults(defaults)
//                .setAutoCancel(autoCancel)
//        if (contentIntent != null) {
//            builder.setContentIntent(contentIntent)
//        } else {
//            Timber.w("Contentintent is null!!")
//        }
//        return builder
//    }
//
//}