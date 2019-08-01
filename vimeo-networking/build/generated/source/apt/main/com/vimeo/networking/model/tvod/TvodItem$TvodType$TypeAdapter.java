package com.vimeo.networking.model.tvod;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;

public final class TvodItem$TvodType$TypeAdapter extends TypeAdapter<TvodItem.TvodType> {
  public static final TypeToken<TvodItem.TvodType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.tvod.TvodItem.TvodType.class);

  private static final HashMap<String, TvodItem.TvodType> NAME_TO_CONSTANT;

  private static final HashMap<TvodItem.TvodType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(2);
    NAME_TO_CONSTANT.put("series", com.vimeo.networking.model.tvod.TvodItem.TvodType.SERIES);
    NAME_TO_CONSTANT.put("film", com.vimeo.networking.model.tvod.TvodItem.TvodType.FILM);

    CONSTANT_TO_NAME = new HashMap<>(2);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.tvod.TvodItem.TvodType.SERIES, "series");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.tvod.TvodItem.TvodType.FILM, "film");
  }

  public TvodItem$TvodType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, TvodItem.TvodType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public TvodItem.TvodType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
