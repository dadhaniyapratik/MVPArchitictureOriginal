package com.vimeo.networking.upload;

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
    if (clazz == com.vimeo.networking.upload.Upload.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.upload.Upload$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.upload.Gcs.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.upload.Gcs$TypeAdapter(gson);
    }
    return null;
  }
}
