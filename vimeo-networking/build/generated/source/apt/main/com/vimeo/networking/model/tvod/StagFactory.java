package com.vimeo.networking.model.tvod;

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
    if (clazz == com.vimeo.networking.model.tvod.TvodList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.tvod.TvodList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.tvod.TvodItem.TvodType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.tvod.TvodItem$TvodType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.tvod.Season.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.tvod.Season$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.tvod.TvodItem.Publish.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.tvod.TvodItem$Publish$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.tvod.TvodItem.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.tvod.TvodItem$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.tvod.SeasonList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.tvod.SeasonList$TypeAdapter(gson);
    }
    return null;
  }
}
