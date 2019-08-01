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

public final class Album$LayoutType$TypeAdapter extends TypeAdapter<Album.LayoutType> {
  public static final TypeToken<Album.LayoutType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Album.LayoutType.class);

  private static final HashMap<String, Album.LayoutType> NAME_TO_CONSTANT;

  private static final HashMap<Album.LayoutType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(3);
    NAME_TO_CONSTANT.put("grid", com.vimeo.networking.model.Album.LayoutType.GRID);
    NAME_TO_CONSTANT.put("player", com.vimeo.networking.model.Album.LayoutType.PLAYER);
    NAME_TO_CONSTANT.put("unknown", com.vimeo.networking.model.Album.LayoutType.UNKNOWN);

    CONSTANT_TO_NAME = new HashMap<>(3);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.LayoutType.UNKNOWN, "unknown");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.LayoutType.PLAYER, "player");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.LayoutType.GRID, "grid");
  }

  public Album$LayoutType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Album.LayoutType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Album.LayoutType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
