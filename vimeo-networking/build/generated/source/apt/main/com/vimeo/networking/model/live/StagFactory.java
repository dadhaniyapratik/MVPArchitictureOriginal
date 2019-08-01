package com.vimeo.networking.model.live;

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
    if (clazz == com.vimeo.networking.model.live.Live.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.Live$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.live.LiveQuota.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.LiveQuota$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.live.LiveStreamsQuota.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.LiveStreamsQuota$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.live.LiveStats.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.LiveStats$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.live.LiveChat.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.LiveChat$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.live.LiveStatsViewers.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.LiveStatsViewers$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.live.LiveTime.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.live.LiveTime$TypeAdapter(gson);
    }
    return null;
  }
}
