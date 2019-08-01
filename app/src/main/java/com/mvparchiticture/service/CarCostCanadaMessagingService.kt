//package com.mvparchiticture.service
//
//import android.app.NotificationChannel
//import android.app.NotificationManager
//import android.app.PendingIntent
//import android.content.Context
//import android.content.Intent
//import android.media.RingtoneManager
//import android.os.Build
//import android.support.v4.app.NotificationCompat
//import android.util.Log
//import com.mvparchiticture.R
//import com.mvparchiticture.ui.splash.SplashActivity
//import com.mvparchiticture.util.Constants
//import com.google.firebase.messaging.FirebaseMessagingService
//import com.mvparchiticture.util.extensions.readValue
//import com.mvparchiticture.util.rest.JSONUtils
//import com.google.firebase.messaging.RemoteMessage
//
//
//class CarCostCanadaMessagingService : FirebaseMessagingService() {
//
//
//    /**
//     * Called when message is received.
//     *
//     * @param remoteMessage Object representing the message received from Firebase Cloud Messaging.
//     */
//    // [START receive_message]
//    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
//
//        remoteMessage?.data?.isNotEmpty()?.let {
//            var remoteData = remoteMessage.data["notifyData"]
//            var notificationItem = JSONUtils.getJsonMapper().readValue<NotificationItem>(remoteData.toString())
//            sendNotification(remoteMessage.data["message"].toString(), notificationItem)
//        }
//
//    }
//
//    override fun onNewToken(token: String?) {
//        Log.d(TAG, "Refreshed token: $token")
//    }
//
//
//    private fun scheduleJob() {
//        // [START dispatch_job]
//        /* val work = OneTimeWorkRequest.Builder(MyWorker::class.java).build()
//         WorkManager.getInstance().beginWith(work).enqueue()*/
//        // [END dispatch_job]
//    }
//
//
//    private fun sendRegistrationToServer(token: String?) {
//        // TODO: Implement this method to send token to your app server.
//    }
//
//    /**
//     * Create and show a simple notification containing the received FCM message.
//     *
//     * @param messageBody FCM message body received.
//     */
//    private fun sendNotification(messageBody: String, notificationItem: NotificationItem?) {
//        val intent = Intent(this, SplashActivity::class.java)
//        if(notificationItem!=null){
//            intent.putExtra(Constants.IntentFilter.NOTIFICATION_DATA,notificationItem)
//        }
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//        val pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
//                PendingIntent.FLAG_ONE_SHOT)
//
//        val channelId = getString(R.string.default_notification_channel_id)
//        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
//        val notificationBuilder = NotificationCompat.Builder(this, channelId)
//                .setSmallIcon(R.mipmap.ic_launcher_round)
//                .setContentTitle(getString(R.string.app_name))
//                .setContentText(messageBody)
//                .setAutoCancel(true)
//                .setSound(defaultSoundUri)
//                .setContentIntent(pendingIntent)
//
//        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//
//        // Since android Oreo notification channel is needed.
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val channel = NotificationChannel(channelId,
//                    "Channel human readable title",
//                    NotificationManager.IMPORTANCE_DEFAULT)
//            notificationManager.createNotificationChannel(channel)
//        }
//
//        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build())
//    }
//
//    companion object {
//
//        private const val TAG = "MyFirebaseMsgService"
//    }
//}