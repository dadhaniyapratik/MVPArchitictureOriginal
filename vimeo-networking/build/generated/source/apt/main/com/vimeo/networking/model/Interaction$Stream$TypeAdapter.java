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

public final class Interaction$Stream$TypeAdapter extends TypeAdapter<Interaction.Stream> {
  public static final TypeToken<Interaction.Stream> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Interaction.Stream.class);

  private static final HashMap<String, Interaction.Stream> NAME_TO_CONSTANT;

  private static final HashMap<Interaction.Stream, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(4);
    NAME_TO_CONSTANT.put("purchased", com.vimeo.networking.model.Interaction.Stream.PURCHASED);
    NAME_TO_CONSTANT.put("unavailable", com.vimeo.networking.model.Interaction.Stream.UNAVAILABLE);
    NAME_TO_CONSTANT.put("restricted", com.vimeo.networking.model.Interaction.Stream.RESTRICTED);
    NAME_TO_CONSTANT.put("available", com.vimeo.networking.model.Interaction.Stream.AVAILABLE);

    CONSTANT_TO_NAME = new HashMap<>(4);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.Stream.AVAILABLE, "available");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.Stream.RESTRICTED, "restricted");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.Stream.PURCHASED, "purchased");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.Stream.UNAVAILABLE, "unavailable");
  }

  public Interaction$Stream$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Interaction.Stream object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Interaction.Stream read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
