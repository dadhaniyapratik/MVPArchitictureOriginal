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
public final class TextTrack$TypeAdapter extends TypeAdapter<TextTrack> {
  public static final TypeToken<TextTrack> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.TextTrack.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  public TextTrack$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
  }

  @Override
  public void write(JsonWriter writer, TextTrack object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("uri");
    if (object.getUri() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getUri());
    }
    else {
      writer.nullValue();
    }

    writer.name("active");
    writer.value(object.getActive());

    writer.name("type");
    if (object.getType() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getType());
    }
    else {
      writer.nullValue();
    }

    writer.name("language");
    if (object.getLanguage() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getLanguage());
    }
    else {
      writer.nullValue();
    }

    writer.name("link");
    if (object.getLink() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getLink());
    }
    else {
      writer.nullValue();
    }

    writer.name("link_expires_time");
    if (object.getLinkExpiresTime() != null)  {
      mTypeAdapter0.write(writer, object.getLinkExpiresTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("hls_link");
    if (object.getHlsLink() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getHlsLink());
    }
    else {
      writer.nullValue();
    }

    writer.name("hls_link_expires_time");
    if (object.getHlsLinkExpiresTime() != null)  {
      mTypeAdapter0.write(writer, object.getHlsLinkExpiresTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("name");
    if (object.getName() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getName());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public TextTrack read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.TextTrack object = new com.vimeo.networking.model.TextTrack();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.setUri(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "active":
        	object.setActive(com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.getActive()));
        	break;
        case "type":
        	object.setType(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "language":
        	object.setLanguage(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "link":
        	object.setLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "link_expires_time":
        	object.setLinkExpiresTime(mTypeAdapter0.read(reader));
        	break;
        case "hls_link":
        	object.setHlsLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "hls_link_expires_time":
        	object.setHlsLinkExpiresTime(mTypeAdapter0.read(reader));
        	break;
        case "name":
        	object.setName(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
