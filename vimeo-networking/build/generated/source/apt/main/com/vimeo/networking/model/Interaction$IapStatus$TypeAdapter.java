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

public final class Interaction$IapStatus$TypeAdapter extends TypeAdapter<Interaction.IapStatus> {
  public static final TypeToken<Interaction.IapStatus> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Interaction.IapStatus.class);

  private static final HashMap<String, Interaction.IapStatus> NAME_TO_CONSTANT;

  private static final HashMap<Interaction.IapStatus, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(3);
    NAME_TO_CONSTANT.put("purchased", com.vimeo.networking.model.Interaction.IapStatus.PURCHASED);
    NAME_TO_CONSTANT.put("unavailable", com.vimeo.networking.model.Interaction.IapStatus.UNAVAILABLE);
    NAME_TO_CONSTANT.put("available", com.vimeo.networking.model.Interaction.IapStatus.AVAILABLE);

    CONSTANT_TO_NAME = new HashMap<>(3);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.IapStatus.PURCHASED, "purchased");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.IapStatus.UNAVAILABLE, "unavailable");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Interaction.IapStatus.AVAILABLE, "available");
  }

  public Interaction$IapStatus$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Interaction.IapStatus object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Interaction.IapStatus read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
