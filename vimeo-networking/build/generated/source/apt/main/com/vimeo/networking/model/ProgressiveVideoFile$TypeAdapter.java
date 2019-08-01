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
public final class ProgressiveVideoFile$TypeAdapter extends TypeAdapter<ProgressiveVideoFile> {
  public static final TypeToken<ProgressiveVideoFile> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.ProgressiveVideoFile.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<VideoFile.LiveFormat> mTypeAdapter1;

  private final TypeAdapter<ProgressiveVideoFile.MimeType> mTypeAdapter2;

  public ProgressiveVideoFile$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.VideoFile.LiveFormat> typeToken1 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.VideoFile.LiveFormat.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(typeToken1);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.ProgressiveVideoFile$MimeType$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, ProgressiveVideoFile object) throws IOException {
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

    writer.name("type");
    if (object.mMimeType != null)  {
      mTypeAdapter2.write(writer, object.mMimeType);
    }
    else {
      writer.nullValue();
    }

    writer.name("fps");
    writer.value(object.mFps);

    writer.name("width");
    writer.value(object.mWidth);

    writer.name("height");
    writer.value(object.mHeight);

    writer.name("size");
    writer.value(object.mSize);

    writer.name("md5");
    if (object.mMd5 != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mMd5);
    }
    else {
      writer.nullValue();
    }

    writer.name("created_time");
    if (object.mCreatedTime != null)  {
      mTypeAdapter0.write(writer, object.mCreatedTime);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public ProgressiveVideoFile read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.ProgressiveVideoFile object = new com.vimeo.networking.model.ProgressiveVideoFile();
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
        case "type":
        	object.mMimeType = mTypeAdapter2.read(reader);
        	break;
        case "fps":
        	object.mFps = com.vimeo.stag.KnownTypeAdapters.PrimitiveDoubleTypeAdapter.read(reader, object.mFps);
        	break;
        case "width":
        	object.mWidth = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mWidth);
        	break;
        case "height":
        	object.mHeight = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mHeight);
        	break;
        case "size":
        	object.mSize = com.vimeo.stag.KnownTypeAdapters.PrimitiveLongTypeAdapter.read(reader, object.mSize);
        	break;
        case "md5":
        	object.mMd5 = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "created_time":
        	object.mCreatedTime = mTypeAdapter0.read(reader);
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
