package com.mvparchiticture.util

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import android.provider.Settings
import android.support.v7.app.AlertDialog
import com.mvparchiticture.R
import io.reactivex.Observable
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern


@SuppressLint("SimpleDateFormat")
object CommonUtils {

    @SuppressLint("HardwareIds")
    fun getDeviceId(context: Context) = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)

    fun getVersionCode(context: Context): Long {
        val pInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        return if (Build.VERSION.SDK_INT >= 28) {
            pInfo.longVersionCode
        } else {
            pInfo.versionCode.toLong()
        }
    }

    fun getAppURL(context: Context): String {
        return "https://play.google.com/store/apps/details?id=${context.packageName}"
    }

    /**
     * Check current internet connection
     *
     * @param context [Application.getApplicationContext]
     * @return if internet (WIFI or MOBILE) is connected return true;
     */
    fun checkInternetConnection(context: Context): Observable<Boolean> {
        val connMgr = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connMgr.activeNetworkInfo
        return Observable.just(networkInfo != null && networkInfo.isConnected)
    }

    fun showErrorDialog(context: Context, message: String): AlertDialog.Builder {
        val dialogBuilder = AlertDialog.Builder(context, R.style.AppTheme_Dialog)
                .setCancelable(false)
                // positive button text and action
                .setPositiveButton(context.getString(R.string.lbl_okay)) { dialog, _ ->
                    dialog.dismiss()
                }

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setMessage(message)
        // show alert dialog
        alert.show()
        return dialogBuilder
    }

    fun formatCurrency(currency: Int): String {
        val format = NumberFormat.getCurrencyInstance(Locale.CANADA)
        var str: String = format.format(currency)
        return str.substring(0, str.indexOf("."))
    }

    fun currencyFormatorWithDesimals(currency: String): String {
        val format = NumberFormat.getCurrencyInstance(Locale.CANADA)
        var str: String = format.format(currency)
        return str
    }


    fun dateFormat(date: String): String {
        return try {
            val inputFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val outputFormat = SimpleDateFormat("dd-MMM-yy")
            val date = inputFormat.parse(date)
            outputFormat.format(date)
        } catch (e: Exception) {
            ""
        }
    }

    fun dateFormatForSampleReport(date: String): String {
        val inputFormat = SimpleDateFormat("dd/MM/yyyy")
        val outputFormat = SimpleDateFormat("dd-MMM-yy")
        val date = inputFormat.parse(date)
        return outputFormat.format(date)
    }

    fun isValidPostalCode(password: String): Boolean {

        val pattern: Pattern = Pattern.compile(Constants.POSTAL_CODE_PATTERN)
        val matcher: Matcher

        matcher = pattern.matcher(password)

        return matcher.matches()

    }

}