package com.mvparchiticture.ui.common.widgets.fonts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.IntDef;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.widget.TextView;

import com.mvparchiticture.R;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Created by Artem Kopan for MyMoodAndMe
 * 22.03.17
 */

@SuppressWarnings({"unused", "WeakerAccess"})
public class FontUtils {

    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";
    public static final int LIGHT = 10;
    public static final int EXTRA_LIGHT = 11;
    public static final int EXTRA_BOLD = 12;
    public static final int MEDIUM = 13;
    private static final String TAG = "FontUtils";
    private static final SparseArray<String> FONTS = new SparseArray<>();

    public static final int HELVETICA_LIGHT = 20;
    public static final int SFPRODISPLAY_LIGHT = 21;
    public static final int SFPRODISPLAY_REGULAR = 22;
    public static final int HELVETICA_BOLD = 23;
    public static final int HELVETICA_MEDIUM = 24;
    public static final int HELVETICA_THIN = 25;
    public static final int SFPRODTEXT_MEDIUM = 26;
    public static final int SFPRODTEXT_REGULAR = 27;
    public static final int SFPRODISPLAY_BOLD = 28;
    public static final int HELVETICA_REGULAR = 29;
    public static final int SFPRODISPLAY_MEDIUM = 30;
    public static final int HELVETICA = 31;

    public static void addFont(@TextStyle int style, String fontPath) {
        FONTS.append(style, fontPath);
    }

    public static void applyCustomFont(TextView textView, Context context, AttributeSet attrs) {
        TypedArray attributeArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.FontTextView);

        String fontPath = attributeArray.getString(R.styleable.FontTextView_customFont);

        // check if a special textStyle was used (e.g. extra bold)
        int textStyle = attributeArray.getInt(R.styleable.FontTextView_textStyle, 0);

        // if nothing extra was used, fall back to regular android:textStyle parameter
        if (textStyle == 0) {
            textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL);
        }

        if (TextUtils.isEmpty(fontPath)) {
            Typeface customFont = selectTypeface(context, textStyle);
            textView.setTypeface(customFont);
        } else {
            textView.setTypeface(FontCache.getTypeface(fontPath, context));
        }

        attributeArray.recycle();
    }

    public static Typeface selectTypeface(Context context, int textStyle) {

        if (FONTS.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("For use custom fonts, firstly you must call addFont()");
        }
        String fontNewPath = FONTS.get(textStyle);

        if (TextUtils.isEmpty(fontNewPath)) {
            Log.w(TAG, "Current style not found. Pleas add it");
            fontNewPath = FONTS.get(Typeface.NORMAL);
            if (TextUtils.isEmpty(fontNewPath)) {
                fontNewPath = FONTS.get(FONTS.keyAt(0));
            }
        }

        return FontCache.getTypeface(fontNewPath, context);
    }

    @IntDef({Typeface.BOLD, Typeface.ITALIC, Typeface.BOLD_ITALIC, EXTRA_BOLD, EXTRA_LIGHT, LIGHT, MEDIUM, Typeface.NORMAL,
            HELVETICA_LIGHT,SFPRODISPLAY_LIGHT,SFPRODISPLAY_REGULAR,HELVETICA_BOLD,HELVETICA_MEDIUM,HELVETICA_THIN,SFPRODTEXT_MEDIUM,SFPRODTEXT_REGULAR,SFPRODISPLAY_BOLD,HELVETICA_REGULAR,SFPRODISPLAY_MEDIUM,HELVETICA})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextStyle {

    }
}