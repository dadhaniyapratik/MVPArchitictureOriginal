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

public final class Comment$CommentType$TypeAdapter extends TypeAdapter<Comment.CommentType> {
  public static final TypeToken<Comment.CommentType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Comment.CommentType.class);

  private static final HashMap<String, Comment.CommentType> NAME_TO_CONSTANT;

  private static final HashMap<Comment.CommentType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(1);
    NAME_TO_CONSTANT.put("video", com.vimeo.networking.model.Comment.CommentType.VIDEO);

    CONSTANT_TO_NAME = new HashMap<>(1);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Comment.CommentType.VIDEO, "video");
  }

  public Comment$CommentType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Comment.CommentType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Comment.CommentType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
