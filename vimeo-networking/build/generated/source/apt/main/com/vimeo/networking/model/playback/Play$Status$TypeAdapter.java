package com.vimeo.networking.model.playback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;

public final class Play$Status$TypeAdapter extends TypeAdapter<Play.Status> {
  public static final TypeToken<Play.Status> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.Play.Status.class);

  private static final HashMap<String, Play.Status> NAME_TO_CONSTANT;

  private static final HashMap<Play.Status, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(5);
    NAME_TO_CONSTANT.put("purchase_required", com.vimeo.networking.model.playback.Play.Status.PURCHASE_REQUIRED);
    NAME_TO_CONSTANT.put("password", com.vimeo.networking.model.playback.Play.Status.PASSWORD);
    NAME_TO_CONSTANT.put("unavailable", com.vimeo.networking.model.playback.Play.Status.UNAVAILABLE);
    NAME_TO_CONSTANT.put("restricted", com.vimeo.networking.model.playback.Play.Status.RESTRICTED);
    NAME_TO_CONSTANT.put("playable", com.vimeo.networking.model.playback.Play.Status.PLAYABLE);

    CONSTANT_TO_NAME = new HashMap<>(5);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.playback.Play.Status.UNAVAILABLE, "unavailable");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.playback.Play.Status.PLAYABLE, "playable");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.playback.Play.Status.PASSWORD, "password");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.playback.Play.Status.PURCHASE_REQUIRED, "purchase_required");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.playback.Play.Status.RESTRICTED, "restricted");
  }

  public Play$Status$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Play.Status object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Play.Status read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
