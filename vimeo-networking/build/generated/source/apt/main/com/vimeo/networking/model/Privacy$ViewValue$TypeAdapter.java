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

public final class Privacy$ViewValue$TypeAdapter extends TypeAdapter<Privacy.ViewValue> {
  public static final TypeToken<Privacy.ViewValue> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Privacy.ViewValue.class);

  private static final HashMap<String, Privacy.ViewValue> NAME_TO_CONSTANT;

  private static final HashMap<Privacy.ViewValue, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(9);
    NAME_TO_CONSTANT.put("password", com.vimeo.networking.model.Privacy.ViewValue.PASSWORD);
    NAME_TO_CONSTANT.put("ptv", com.vimeo.networking.model.Privacy.ViewValue.TVOD);
    NAME_TO_CONSTANT.put("anybody", com.vimeo.networking.model.Privacy.ViewValue.ANYBODY);
    NAME_TO_CONSTANT.put("disable", com.vimeo.networking.model.Privacy.ViewValue.DISABLE);
    NAME_TO_CONSTANT.put("unlisted", com.vimeo.networking.model.Privacy.ViewValue.UNLISTED);
    NAME_TO_CONSTANT.put("stock", com.vimeo.networking.model.Privacy.ViewValue.STOCK);
    NAME_TO_CONSTANT.put("nobody", com.vimeo.networking.model.Privacy.ViewValue.NOBODY);
    NAME_TO_CONSTANT.put("contacts", com.vimeo.networking.model.Privacy.ViewValue.CONTACTS);
    NAME_TO_CONSTANT.put("users", com.vimeo.networking.model.Privacy.ViewValue.USERS);

    CONSTANT_TO_NAME = new HashMap<>(9);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.PASSWORD, "password");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.CONTACTS, "contacts");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.USERS, "users");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.NOBODY, "nobody");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.ANYBODY, "anybody");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.UNLISTED, "unlisted");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.TVOD, "ptv");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.STOCK, "stock");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Privacy.ViewValue.DISABLE, "disable");
  }

  public Privacy$ViewValue$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Privacy.ViewValue object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Privacy.ViewValue read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
