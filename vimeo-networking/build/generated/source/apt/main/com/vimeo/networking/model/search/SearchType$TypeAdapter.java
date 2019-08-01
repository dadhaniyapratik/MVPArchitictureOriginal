package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;

public final class SearchType$TypeAdapter extends TypeAdapter<SearchType> {
  public static final TypeToken<SearchType> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.SearchType.class);

  private static final HashMap<String, SearchType> NAME_TO_CONSTANT;

  private static final HashMap<SearchType, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(5);
    NAME_TO_CONSTANT.put("channel", com.vimeo.networking.model.search.SearchType.CHANNEL);
    NAME_TO_CONSTANT.put("ondemand", com.vimeo.networking.model.search.SearchType.TVOD);
    NAME_TO_CONSTANT.put("people", com.vimeo.networking.model.search.SearchType.USER);
    NAME_TO_CONSTANT.put("clip", com.vimeo.networking.model.search.SearchType.VIDEO);
    NAME_TO_CONSTANT.put("group", com.vimeo.networking.model.search.SearchType.GROUP);

    CONSTANT_TO_NAME = new HashMap<>(5);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.search.SearchType.VIDEO, "clip");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.search.SearchType.TVOD, "ondemand");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.search.SearchType.GROUP, "group");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.search.SearchType.CHANNEL, "channel");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.search.SearchType.USER, "people");
  }

  public SearchType$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, SearchType object) throws IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public SearchType read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
