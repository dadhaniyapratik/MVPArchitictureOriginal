package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HlsVideoFile$TypeAdapter extends TypeAdapter<HlsVideoFile> {
  public static final TypeToken<HlsVideoFile> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.HlsVideoFile.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<VideoFile.LiveFormat> mTypeAdapter1;

  public HlsVideoFile$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.VideoFile.LiveFormat> typeToken1 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.VideoFile.LiveFormat.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(typeToken1);
  }

  @Override
  public void write(JsonWriter writer, HlsVideoFile object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("link_expiration_time");
    if (object.mLinkExpirationTime != null)  {
      mTypeAdapter0.write(writer, object.mLinkExpirationTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("link");
    if (object.mLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("log");
    if (object.mLog != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLog);
    }
    else {
      writer.nullValue();
    }

    writer.name("live");
    if (object.getLive() != null)  {
      mTypeAdapter1.write(writer, object.getLive());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public HlsVideoFile read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.HlsVideoFile object = new com.vimeo.networking.model.HlsVideoFile();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "link_expiration_time":
        	object.mLinkExpirationTime = mTypeAdapter0.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "log":
        	object.mLog = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "live":
        	object.setLive(mTypeAdapter1.read(reader));
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
