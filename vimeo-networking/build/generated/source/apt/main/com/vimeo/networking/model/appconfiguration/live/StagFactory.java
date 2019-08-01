package com.vimeo.networking.model.appconfiguration.live;

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
    if (clazz == com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.appconfiguration.live.LiveConfiguration.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.appconfiguration.live.LiveConfiguration$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.appconfiguration.live.LiveHeartbeatConfiguration$TypeAdapter(gson);
    }
    return null;
  }
}
