package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Preferences$TypeAdapter extends TypeAdapter<Preferences> {
  public static final TypeToken<Preferences> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Preferences.class);

  private final Gson mGson;

  private final TypeAdapter<VideosPreference> mTypeAdapter0;

  public Preferences$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.VideosPreference$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Preferences object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("videos");
    if (object.mVideos != null)  {
      mTypeAdapter0.write(writer, object.mVideos);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Preferences read(JsonReader reader) throws IOException {
    com.google.gson.stream.JsonToken peek = reader.peek();
    if (com.google.gson.stream.JsonToken.NULL == peek) {
      reader.nextNull();
      return null;
    }
    if (com.google.gson.stream.JsonToken.BEGIN_OBJECT != peek) {
      reader.skipValue();
      return null;
    }
    reader.beginObject();
    com.vimeo.networking.model.Preferences object = new com.vimeo.networking.model.Preferences();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "videos":
        case "m_videos":
        	object.mVideos = mTypeAdapter0.read(reader);
        	break;
        default:
        reader.skipValue();
        break;
      }
    }
    reader.endObject();
    return object;
  }
}
