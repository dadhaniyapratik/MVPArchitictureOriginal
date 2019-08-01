package com.vimeo.networking.model.iap;

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
    if (clazz == com.vimeo.networking.model.iap.Product.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.iap.Product$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.iap.Products.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.iap.Products$TypeAdapter(gson);
    }
    return null;
  }
}
