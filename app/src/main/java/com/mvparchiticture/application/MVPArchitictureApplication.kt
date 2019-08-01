package com.mvparchiticture.application

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.graphics.Typeface
import android.support.multidex.MultiDex
import com.mvparchiticture.ui.common.base.util.LocaleManager
import com.facebook.drawee.backends.pipeline.Fresco
import com.mvparchiticture.ui.common.widgets.fonts.FontUtils.*


class MVPArchitictureApplication : Application() {


    companion object {
        lateinit var instance: MVPArchitictureApplication
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
        Fresco.initialize(this)

        addFont(Typeface.BOLD, "Roboto-Bold.ttf")
        addFont(Typeface.ITALIC, "Roboto-Italic.ttf")
        addFont(LIGHT, "Roboto-Light.ttf")
        addFont(MEDIUM, "Roboto-Medium.ttf")
        addFont(EXTRA_LIGHT, "Roboto-Thin.ttf")
        addFont(Typeface.NORMAL, "Roboto-Regular.ttf")
        addFont(HELVETICA_LIGHT, "HelveticaNeueLight.ttf")
        addFont(HELVETICA_BOLD, "HelveticaNeueBold.ttf")
        addFont(HELVETICA_MEDIUM, "HelveticaNeueMedium.ttf")
        addFont(HELVETICA_THIN, "HelveticaNeueThin.otf")
        addFont(SFPRODISPLAY_LIGHT, "SFProDisplayLight.otf")
        addFont(SFPRODISPLAY_REGULAR, "SFProDisplayRegular.otf")
        addFont(SFPRODTEXT_MEDIUM, "SFProTextMedium.ttf")
        addFont(SFPRODTEXT_REGULAR, "SFProTextRegular.ttf")
        addFont(SFPRODISPLAY_BOLD, "SFProDisplayBold.otf")
        addFont(HELVETICA_REGULAR, "HelveticaNeueRegular.ttf")
        addFont(SFPRODISPLAY_MEDIUM, "SFProDisplayMedium.otf")
        addFont(HELVETICA, "HelveticaNeue.ttf")
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base?.let { LocaleManager.setLocale(it) })
        MultiDex.install(base)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        LocaleManager.setLocale(this)
    }


}