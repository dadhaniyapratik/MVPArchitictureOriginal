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

public final class Privacy$CommentValue$TypeAdapter extends TypeAdapter<Privacy.CommentValue> {
  public static final TypeToken<Privacy.CommentValue> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Privacy.CommentValue.class);

  private static final HashMap<String, Privacy.CommentValue> NAME_TO_CONSTANT;

  private static final HashMap<Privacy.CommentValue, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(3);
    NAME_TO_CONSTANT.put("anybody", com.vimeo.networking.model.Privacy.CommentValue.ANYBODY);
    NAME_TO_CONSTANT.put("nobody", com.vimeo.networking.model.Privacy.CommentValue.NOBODY);
    NAME_TO_CONSTANT.put("contacts", com.vimeo.networking.model.Privacy.CommentValue.CONTACTS);

    CONSTANT_TO_NAME = new HashMap<>(3);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.CommentValue.CONTACTS, "contacts");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.CommentValue.ANYBODY, "anybody");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.CommentValue.NOBODY, "nobody");
  }

  public Privacy$CommentValue$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Privacy.CommentValue object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Privacy.CommentValue read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
