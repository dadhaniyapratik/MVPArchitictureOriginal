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

public final class AlbumPrivacy$AlbumPrivacyViewValue$TypeAdapter extends TypeAdapter<AlbumPrivacy.AlbumPrivacyViewValue> {
  public static final TypeToken<AlbumPrivacy.AlbumPrivacyViewValue> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.class);

  private static final HashMap<String, AlbumPrivacy.AlbumPrivacyViewValue> NAME_TO_CONSTANT;

  private static final HashMap<AlbumPrivacy.AlbumPrivacyViewValue, String> CONSTANT_TO_NAME;

  static {
    NAME_TO_CONSTANT = new HashMap<>(4);
    NAME_TO_CONSTANT.put("password", com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.PASSWORD);
    NAME_TO_CONSTANT.put("anybody", com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.ANYBODY);
    NAME_TO_CONSTANT.put("embed_only", com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.EMBED_ONLY);
    NAME_TO_CONSTANT.put("unknown", com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.UNKNOWN);

    CONSTANT_TO_NAME = new HashMap<>(4);
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.EMBED_ONLY, "embed_only");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.UNKNOWN, "unknown");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.PASSWORD, "password");
    CONSTANT_TO_NAME.put(com.vimeo.networking.model.AlbumPrivacy.AlbumPrivacyViewValue.ANYBODY, "anybody");
  }

  public AlbumPrivacy$AlbumPrivacyViewValue$TypeAdapter(Gson gson) {
  }

  @Override
  public void write(JsonWriter writer, AlbumPrivacy.AlbumPrivacyViewValue object) throws
      IOException {
    writer.value(object == null ? null : CONSTANT_TO_NAME.get(object));
  }

  @Override
  public AlbumPrivacy.AlbumPrivacyViewValue read(JsonReader reader) throws IOException {
    if (reader.peek() == com.google.gson.stream.JsonToken.NULL) {
      reader.nextNull();
      return null;
    }
    return NAME_TO_CONSTANT.get(reader.nextString());
  }
}
