package com.vimeo.networking.model.uploadquota;

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
    if (clazz == com.vimeo.networking.model.uploadquota.Space.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.uploadquota.Space$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.uploadquota.Periodic.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.uploadquota.Periodic$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.uploadquota.Lifetime.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.uploadquota.Lifetime$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.uploadquota.UploadQuota.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.uploadquota.UploadQuota$TypeAdapter(gson);
    }
    return null;
  }
}
