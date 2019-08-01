package com.vimeo.networking.model.cinema;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;

public final class ProgramContentItem$Type$TypeAdapter extends TypeAdapter<ProgramContentItem.Type> {
  public static final TypeToken<ProgramContentItem.Type> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.cinema.ProgramContentItem.Type.class);

  private static final HashMap<String, ProgramContentItem.Type> NAME_TO_CONSTANT;

  private static final HashMap<ProgramContentItem.Type, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(2);
    NAME_TO_CONSTANT.put("channel", com.vimeo.networking.model.cinema.ProgramContentItem.Type.CHANNEL);
    NAME_TO_CONSTANT.put("category", com.vimeo.networking.model.cinema.ProgramContentItem.Type.CATEGORY);

    CONSTANT_TO_NAME = new HashMap<>(2);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.cinema.ProgramContentItem.Type.CATEGORY, "category");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.cinema.ProgramContentItem.Type.CHANNEL, "channel");
  }

  public ProgramContentItem$Type$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, ProgramContentItem.Type object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public ProgramContentItem.Type read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
