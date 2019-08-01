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

public final class Video$Status$TypeAdapter extends TypeAdapter<Video.Status> {
  public static final TypeToken<Video.Status> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Video.Status.class);

  private static final HashMap<String, Video.Status> NAME_TO_CONSTANT;

  private static final HashMap<Video.Status, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(10);
    NAME_TO_CONSTANT.put("uploading_error", com.vimeo.networking.model.Video.Status.UPLOADING_ERROR);
    NAME_TO_CONSTANT.put("transcoding_error", com.vimeo.networking.model.Video.Status.TRANSCODING_ERROR);
    NAME_TO_CONSTANT.put("quota_exceeded", com.vimeo.networking.model.Video.Status.QUOTA_EXCEEDED);
    NAME_TO_CONSTANT.put("unavailable", com.vimeo.networking.model.Video.Status.UNAVAILABLE);
    NAME_TO_CONSTANT.put("available", com.vimeo.networking.model.Video.Status.AVAILABLE);
    NAME_TO_CONSTANT.put("uploading", com.vimeo.networking.model.Video.Status.UPLOADING);
    NAME_TO_CONSTANT.put("transcode_starting", com.vimeo.networking.model.Video.Status.TRANSCODE_STARTING);
    NAME_TO_CONSTANT.put("total_cap_exceeded", com.vimeo.networking.model.Video.Status.TOTAL_CAP_EXCEEDED);
    NAME_TO_CONSTANT.put("NONE", com.vimeo.networking.model.Video.Status.NONE);
    NAME_TO_CONSTANT.put("transcoding", com.vimeo.networking.model.Video.Status.TRANSCODING);

    CONSTANT_TO_NAME = new HashMap<>(10);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.AVAILABLE, "available");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.TRANSCODING_ERROR, "transcoding_error");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.UPLOADING_ERROR, "uploading_error");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.UNAVAILABLE, "unavailable");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.UPLOADING, "uploading");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.QUOTA_EXCEEDED, "quota_exceeded");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.NONE, "NONE");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.TOTAL_CAP_EXCEEDED, "total_cap_exceeded");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.TRANSCODE_STARTING, "transcode_starting");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Video.Status.TRANSCODING, "transcoding");
  }

  public Video$Status$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Video.Status object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Video.Status read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
