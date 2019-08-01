package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;

public final class Album$ThemeType$TypeAdapter extends TypeAdapter<Album.ThemeType> {
  public static final TypeToken<Album.ThemeType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Album.ThemeType.class);

  private static final HashMap<String, Album.ThemeType> NAME_TO_CONSTANT;

  private static final HashMap<Album.ThemeType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(3);
    NAME_TO_CONSTANT.put("standard", com.vimeo.networking.model.Album.ThemeType.STANDARD);
    NAME_TO_CONSTANT.put("dark", com.vimeo.networking.model.Album.ThemeType.DARK);
    NAME_TO_CONSTANT.put("unknown", com.vimeo.networking.model.Album.ThemeType.UNKNOWN);

    CONSTANT_TO_NAME = new HashMap<>(3);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.ThemeType.STANDARD, "standard");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.ThemeType.UNKNOWN, "unknown");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.ThemeType.DARK, "dark");
  }

  public Album$ThemeType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Album.ThemeType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Album.ThemeType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
