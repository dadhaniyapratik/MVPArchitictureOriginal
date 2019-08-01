package com.vimeo.networking.model.playback.embed;

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
    if (clazz == com.vimeo.networking.model.playback.embed.EmbedTitle.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.playback.embed.EmbedTitle$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.playback.embed.EmbedCustomLogos.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.playback.embed.EmbedCustomLogos$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.playback.embed.Embed.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.playback.embed.Embed$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.playback.embed.EmbedHtml.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.playback.embed.EmbedHtml$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.playback.embed.EmbedButtons.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.playback.embed.EmbedButtons$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.playback.embed.EmbedLogos.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.playback.embed.EmbedLogos$TypeAdapter(gson);
    }
    return null;
  }
}
