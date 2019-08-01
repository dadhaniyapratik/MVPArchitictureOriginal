package com.vimeo.networking.model.playback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.DashVideoFile;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Drm$TypeAdapter extends TypeAdapter<Drm> {
  public static final TypeToken<Drm> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.Drm.class);

  private final Gson mGson;

  private final TypeAdapter<DashVideoFile> mTypeAdapter0;

  public Drm$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.DashVideoFile$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Drm object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("widevine");
    if (object.mWidevine != null)  {
      mTypeAdapter0.write(writer, object.mWidevine);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Drm read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.Drm object = new com.vimeo.networking.model.playback.Drm();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "widevine":
        case "m_widevine":
        	object.mWidevine = mTypeAdapter0.read(reader);
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
