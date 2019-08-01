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

public final class ProgressiveVideoFile$MimeType$TypeAdapter extends TypeAdapter<ProgressiveVideoFile.MimeType> {
  public static final TypeToken<ProgressiveVideoFile.MimeType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.ProgressiveVideoFile.MimeType.class);

  private static final HashMap<String, ProgressiveVideoFile.MimeType> NAME_TO_CONSTANT;

  private static final HashMap<ProgressiveVideoFile.MimeType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(4);
    NAME_TO_CONSTANT.put("video/webm", com.vimeo.networking.model.ProgressiveVideoFile.MimeType.WEBM);
    NAME_TO_CONSTANT.put("vp6/x-video", com.vimeo.networking.model.ProgressiveVideoFile.MimeType.VP6);
    NAME_TO_CONSTANT.put("NONE", com.vimeo.networking.model.ProgressiveVideoFile.MimeType.NONE);
    NAME_TO_CONSTANT.put("video/mp4", com.vimeo.networking.model.ProgressiveVideoFile.MimeType.MP4);

    CONSTANT_TO_NAME = new HashMap<>(4);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.ProgressiveVideoFile.MimeType.NONE, "NONE");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.ProgressiveVideoFile.MimeType.WEBM, "video/webm");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.ProgressiveVideoFile.MimeType.VP6, "vp6/x-video");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.ProgressiveVideoFile.MimeType.MP4, "video/mp4");
  }

  public ProgressiveVideoFile$MimeType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, ProgressiveVideoFile.MimeType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public ProgressiveVideoFile.MimeType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
