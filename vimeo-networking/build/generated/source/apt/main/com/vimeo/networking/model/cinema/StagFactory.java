package com.vimeo.networking.model.cinema;

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
    if (clazz == com.vimeo.networking.model.cinema.ProgramContentItemList.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.cinema.ProgramContentItemList$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.cinema.ProgramContentItem.Type.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.cinema.ProgramContentItem$Type$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.cinema.ProgramContentItem.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.cinema.ProgramContentItem$TypeAdapter(gson);
    }
    return null;
  }
}
