package com.vimeo.networking.model.notifications;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.Override;
import java.lang.SuppressWarnings;

public final class StagFactory implements TypeAdapterFactory {
  @SuppressWarnings({
      "unchecked",
      "rawtypes"
  })
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    Class<? super T> clazz = type.getRawType();
    if (clazz == com.vimeo.networking.model.notifications.Subscriptions.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.notifications.Subscriptions$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.notifications.SubscriptionCollection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.notifications.SubscriptionCollection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.notifications.NotificationConnection.NotificationTypeCount.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.notifications.NotificationConnection$NotificationTypeCount$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.notifications.NotificationConnection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.notifications.NotificationConnection$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.notifications.NotificationList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.notifications.NotificationList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.notifications.Notification.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.notifications.Notification$TypeAdapter(gson);
    }
    return null;
  }
}
