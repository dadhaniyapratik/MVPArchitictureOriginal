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

public final class Privacy$EmbedValue$TypeAdapter extends TypeAdapter<Privacy.EmbedValue> {
  public static final TypeToken<Privacy.EmbedValue> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Privacy.EmbedValue.class);

  private static final HashMap<String, Privacy.EmbedValue> NAME_TO_CONSTANT;

  private static final HashMap<Privacy.EmbedValue, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(3);
    NAME_TO_CONSTANT.put("white_list", com.vimeo.networking.model.Privacy.EmbedValue.WHITE_LIST);
    NAME_TO_CONSTANT.put("private", com.vimeo.networking.model.Privacy.EmbedValue.PRIVATE);
    NAME_TO_CONSTANT.put("public", com.vimeo.networking.model.Privacy.EmbedValue.PUBLIC);

    CONSTANT_TO_NAME = new HashMap<>(3);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.EmbedValue.WHITE_LIST, "white_list");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.EmbedValue.PUBLIC, "public");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.EmbedValue.PRIVATE, "private");
  }

  public Privacy$EmbedValue$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Privacy.EmbedValue object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Privacy.EmbedValue read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
