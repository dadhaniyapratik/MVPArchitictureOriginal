package com.mvparchiticture.util

object Constants {


    const val SPLASH_DURATION = 3000L
    const val SUCCESS = 1
    const val ERROR = 0

    const val EMAIL = "email"
    const val PASSWORD = "password"
    //    const val PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}"
    const val PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}\$"
//    const val POSTAL_CODE_PATTERN="^(?!.*[DFIOQU])[A-VXY][0-9][A-Z]●?[0-9][A-Z][0-9]\$"
    const val POSTAL_CODE_PATTERN="^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]\$"

    const val DEVICE_TYPE = "android"
    const val USER_ROLE = "Authenticator"

    const val SERVER_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss"

    object TAG {
        const val LIST = 1988
        const val PAGINATION = 1985
        const val SPLASH_PROGRESS = 1986
    }

    object Prefs {
        const val PUSH_TOKEN = "push_token"
        const val USER_ITEM = "user_item"
        const val API_VERSION = "api_version"
        const val SHOW_HOMESCREEN_INTRO="show_home_screen_intro"
        const val SHOW_VEHICLE_REPORT_INTRO="show_vehicle_report_intro"
        const val SHOW_TUTORIAL_SCREEN="show_tutorial_screen"
    }

    object PAGINATION {
        const val LIMIT = 10
    }

    object MANAGE_VIEW {
        const val SHOW_LAYOUT = 0
        const val SHOW_PROGRESS = 1
        const val SHOW_NO_INTERNET_CONNETCTION = 2
    }

    object IntentFilter{
        const val LOCAL_NOTIFICATION_DATA="localNotificationData"
        const val NOTIFICATION_DATA="notification_data"
        const val IS_COME_FROM_REPORT = "isComeFromReport"
        const val DATA = "data"
        const val MODEL = "model"
        const val MAKE = "make"
        const val YEAR = "year"
        const val IS_COME_FROM_REPORT_SCREEN="isComeFromReportScreen"
        const val ADDED_OPTION_DATA="added_option_data"
        const val SELECTED_PARTCODE = "selected_part_code"
    }

    const val QUESTIONNAIRE_ACTIVITY_RESULT_CODE: Int = 123
    val IS_FROM_REPORT_DETAIL: String = "IS_FROM_REPORT_DETAIL"
    val IS_COME_FROM_MEMBER: String= "IS_COME_FROM_MEMBER"

    val PARTNER_DISCOUNT_DATA: String="PARTNER_DISCOUNT_DATA"

    val IS_FROM: String = "IS_FROM"
    val IS_FROM_PAYMENT: String = "IS_FROM_PAYMENT"

    val IS_HOME_SCREEN_OVERLAY: String = "IS_HOME_SCREEN_OVERLAY"
    val IS_VEHICLE_REPORT_OVERLAY: String = "IS_VEHICLE_REPORT_OVERLAY"

    const val BUILD_COLOR_RESULT_CODE: Int = 1234
    const val VEHICLE_REPORT_RESULT_CODE: Int = 222
    const val VEHICLE_REPORT_DETAILS_CODE: Int = 333


    val SELECTED : String = "Selected"
    val UNSELECTED : String = "Unselected"
    val INCLUDED : String = "Included"
    val EXCLUDED : String = "Excluded"
    val REQUIRED : String = "Required"


    val OPTION_CODE : String = "OPTION_CODE"
    val REPORT_NUMBER : String = "REPORT_NUMBER"

    object PaymentType{
        const val CASH = "cash"
        const val FINANCE = "finance"
        const val LEASE = "lease"
    }

    object BuildVehicle{
        const val MAKE_ID = "MAKE_ID"
        const val MODEL_ID = "MODEL_ID"
        const val YEAR = "YEAR"
        const val STYLE_ID = "STYLE_ID"
        const val COLOR_ID = "COLOR_ID"
        const val COLOR_PRICE = "COLOR_PRICE"
    }

    object resendOtpType{
        const val VIA_SMS = 10
        const val VIA_CALL = 20
    }

    object NotificationType{
        const val FOR_COMPARABLE_REPORT=3
        const val FOR_RUNNING_ON_LOW_REPORTS=4
        const val FOR_UPDATE_REPORT_PRICE=5
    }



    val IS_FROM_MORE: String = "IS_FROM_MORE"
    val IS_FROM_BUILD_VEHICLE: String = "IS_FROM_BUILD_VEHICLE"

    val FULL_NAME: String = "FULL_NAME"
    val MOBILE_NUMBER: String = "MOBILE_NUMBER"
    val EMAIL_ADDRESS: String = "EMAIL_ADDRESS"
    val REPORT_PDF_LINK: String = "REPORT_PDF_LINK"
    val POSTAL_CODE: String = "POSTAL_CODE"

    val IS_LANGUAGE_FRENCH: String = "IS_LANGUAGE_FRENCH"



}