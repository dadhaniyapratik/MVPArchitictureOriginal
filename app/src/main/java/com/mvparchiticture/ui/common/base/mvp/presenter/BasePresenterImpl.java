package com.mvparchiticture.ui.common.base.mvp.presenter;

import android.support.annotation.Nullable;
import android.util.Log;

import com.mvparchiticture.ui.common.base.mvp.view.BaseView;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Base class that implements the BasePresenter interface and provides a base implementation for
 * attachView() and detachView(). It also handles keeping a reference to the mvpView that
 * can be accessed from the children classes by calling getMvpView().
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class BasePresenterImpl<T extends BaseView> implements BasePresenter<T> {

    protected CompositeDisposable clearedDisposable = new CompositeDisposable();
    protected CompositeDisposable detachedDisposable = new CompositeDisposable();

  /*  @Inject  RxSharedPreferences prefs;
    @Inject  RxSharedPreferences rxSecPref;
*/
    @Nullable
    private T view;
    @Override
    public void onViewAttached(T view) {
        this.view = view;
    }

    @Override
    public void onViewDetached() {
        detachedDisposable.clear();
        this.view = null;
    }

    @Override
    public void onUserUnauthorized(String message) {
        Log.e("Presenter",message);

     /*   try {
            AudioPlayerService.Companion.terminate(view.getViewPresentation().getBaseActivity()).send();
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }

        prefs.removeValue(Constants.Prefs.TOKEN);
        prefs.removeValue(Constants.Prefs.USER);
        prefs.removeValue(Constants.Prefs.USER_STEPS);
        prefs.removeValue(Constants.Prefs.CHALLENGE_CONFIGURATION);
        prefs.removeValue(Constants.Prefs.TYPE_TRACKER);
        JobManager.instance().cancelAll();
        //Clear Fitness api tokens

        rxSecPref.putValue(GarminUtils.PREFS_TOKEN, null).blockingGet();
        rxSecPref.putValue(GarminUtils.PREFS_SECRET, null).blockingGet();
        rxSecPref.putValue(JawboneUtils.TOKET_PREF, null).blockingGet();
        AuthenticationManager.logout(view.getViewPresentation().getBaseActivity());

        Intercom.client().logout();
        Intercom.client().reset();*/

        view.redirectToLogin();


    }

    /**
     * Method onCleared was call only if you use LifeCycle presenter {@link com.mvparchiticture.ui.common.base.mvp.presenter.lifecycle.PresenterProvider#get(Class)}
     */
    @Override
    public void onCleared() {
        clearedDisposable.clear();
    }

    @Nullable
    public T getMvpView() {
        return view;
    }

    protected Consumer<? super Disposable> onDetachSubscribe() {
        return new Consumer<Disposable>() {
            @Override
            public void accept(@NonNull Disposable disposable) throws Exception {
                detachedDisposable.add(disposable);
            }
        };
    }

    protected Consumer<? super Disposable> onClearedSubscribe() {
        return new Consumer<Disposable>() {
            @Override
            public void accept(@NonNull Disposable disposable) throws Exception {
                clearedDisposable.add(disposable);
            }
        };
    }

    public void onShowProgress() {
        onShowProgress(null);
    }

    public void onShowProgress(Object tag) {
        if (view != null) {
            view.showProgress(tag);
        }
    }

    public void onHideProgress() {
        onHideProgress(null);
    }

    public void onHideProgress(Object tag) {
        if (view != null) {
            view.hideProgress(tag);
        }
    }

    public void onShowError(Throwable throwable) {
        onShowError(null, throwable.getMessage());
    }

    public void onShowError(String message) {
        onShowError(null, message);
    }

    public void onShowError(Object errorTag, Throwable throwable) {
        onShowError(errorTag, throwable.getMessage());
    }

    public void onShowError(Object errorTag, String message) {
        if (view != null) {
            view.showError(errorTag, message);
        }
    }

}
