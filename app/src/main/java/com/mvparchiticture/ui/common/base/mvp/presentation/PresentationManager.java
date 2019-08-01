package com.mvparchiticture.ui.common.base.mvp.presentation;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import java.util.concurrent.TimeUnit;

import io.reactivex.disposables.CompositeDisposable;

@SuppressWarnings("ALL")
public interface PresentationManager {

    /**
     * @param inflater  if Activity set null
     * @param container if Activity set null
     */
    View inflateLayout(LayoutInflater inflater, @Nullable ViewGroup container);

    /**
     * In {@link Activity} call before {@link Activity#onDestroy()}
     * In {@link Fragment} or {@link android.support.v4.app.DialogFragment} call befor {@link Fragment#onDestroyView()}
     */
    void onDetach();

    /**
     * Call {@link CompositeDisposable#clear()} with {@code onDetach} method
     *
     * @return a {@link CompositeDisposable}
     */
    CompositeDisposable getDetachDisposable();

    /**
     * Find toolbar by id and set to {@link android.support.v7.app.AppCompatActivity#setSupportActionBar(Toolbar)}
     *
     * @param toolbarId R.id.{toolbar_id}
     */
    @Nullable
    Toolbar onToolbarInit(@IdRes int toolbarId);

    /**
     * Find toolbar by id and set to {@link android.support.v7.app.AppCompatActivity#setSupportActionBar(Toolbar)}
     *
     * @param toolbarId    R.id.{toolbar_id}
     * @param fromActivity if true, then find toolbar was in activity. For activities always true
     */
    @Nullable
    Toolbar onToolbarInit(@IdRes int toolbarId, boolean fromActivity);

    /**
     * Find toolbar by id and set to {@link android.support.v7.app.AppCompatActivity#setSupportActionBar(Toolbar)}
     *
     * @param toolbarId    R.id.{toolbar_id}
     * @param homeDrawable set drawable resource for home button (left button)
     */
    @Nullable
    Toolbar onToolbarInit(@IdRes int toolbarId, @DrawableRes int homeDrawable);

    /**
     * Find toolbar by id and set to {@link android.support.v7.app.AppCompatActivity#setSupportActionBar(Toolbar)}
     *
     * @param toolbarId    R.id.{toolbar_id}
     * @param homeDrawable set drawable resource for home button (left button)
     * @param fromActivity if true, then find toolbar was in activity. For activities always true
     */
    @Nullable
    Toolbar onToolbarInit(@IdRes int toolbarId, @DrawableRes int homeDrawable, boolean fromActivity);

    @Nullable
    Toolbar onToolbarInit(@IdRes int toolbarId, BitmapDrawable drawable, boolean fromActivity);

    /**
     * Find toolbar by id and set to {@link android.support.v7.app.AppCompatActivity#setSupportActionBar(Toolbar)}
     *
     * @param toolbarId    R.id.{toolbar_id}
     * @param source set drawable resource for home button from the link(left button)
     * @param fromActivity if true, then find toolbar was in activity. For activities always true
     */
    @Nullable
    BitmapDrawable onToolbarImageInit(@IdRes int toolbarId, String source, boolean fromActivity, Context context);

    /**
     * Set click listener for home button
     */
    void onToolbarNavigationClickListener(OnClickListener onClickListener);

    /**
     * Set title for toolbar
     */
    void onToolbarSetTitle(@StringRes int titleRes);

    /**
     * Set title for toolbar
     */
    void onToolbarSetTitle(CharSequence title);

    void onToolbarSetIcon(@IdRes int toolbarId, @DrawableRes int drawable);

    /**
     * Set color for status bar. Work only for api21+
     */
    void setStatusBarColor(@ColorInt int color);

    /**
     * Set color for status bar with delay. Work only for api21+.
     */
    void setStatusBarColor(@ColorInt final int color, long delay, TimeUnit timeUnit);

    class Factory {

        public static PresentationManager create(Presentation Presentation) {
            return new PresentationManagerImpl(Presentation);
        }

    }

}
