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

public final class Album$SortType$TypeAdapter extends TypeAdapter<Album.SortType> {
  public static final TypeToken<Album.SortType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Album.SortType.class);

  private static final HashMap<String, Album.SortType> NAME_TO_CONSTANT;

  private static final HashMap<Album.SortType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(10);
    NAME_TO_CONSTANT.put("alphabetical", com.vimeo.networking.model.Album.SortType.ALPHABETICAL);
    NAME_TO_CONSTANT.put("arranged", com.vimeo.networking.model.Album.SortType.ARRANGED);
    NAME_TO_CONSTANT.put("comments", com.vimeo.networking.model.Album.SortType.COMMENTS);
    NAME_TO_CONSTANT.put("plays", com.vimeo.networking.model.Album.SortType.PLAYS);
    NAME_TO_CONSTANT.put("added_first", com.vimeo.networking.model.Album.SortType.ADDED_FIRST);
    NAME_TO_CONSTANT.put("oldest", com.vimeo.networking.model.Album.SortType.OLDEST);
    NAME_TO_CONSTANT.put("added_last", com.vimeo.networking.model.Album.SortType.ADDED_LAST);
    NAME_TO_CONSTANT.put("newest", com.vimeo.networking.model.Album.SortType.NEWEST);
    NAME_TO_CONSTANT.put("likes", com.vimeo.networking.model.Album.SortType.LIKES);
    NAME_TO_CONSTANT.put("unknown", com.vimeo.networking.model.Album.SortType.UNKNOWN);

    CONSTANT_TO_NAME = new HashMap<>(10);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.ARRANGED, "arranged");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.ADDED_LAST, "added_last");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.ALPHABETICAL, "alphabetical");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.NEWEST, "newest");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.ADDED_FIRST, "added_first");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.UNKNOWN, "unknown");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.COMMENTS, "comments");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.PLAYS, "plays");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.OLDEST, "oldest");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.Album.SortType.LIKES, "likes");
  }

  public Album$SortType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, Album.SortType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public Album.SortType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
