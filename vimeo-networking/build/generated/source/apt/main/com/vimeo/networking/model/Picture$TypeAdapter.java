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
public final class Picture$TypeAdapter extends TypeAdapter<Picture> {
  public static final TypeToken<Picture> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Picture.class);

  private final Gson mGson;

  public Picture$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Picture object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("width");
    writer.value(object.mWidth);

    writer.name("height");
    writer.value(object.mHeight);

    writer.name("link");
    if (object.mLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("link_with_play_button");
    if (object.mLinkWithPlayButton != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLinkWithPlayButton);
    }
    else {
      writer.nullValue();
    }

    writer.name("resource_key");
    if (object.getResourceKey() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getResourceKey());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Picture read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Picture object = new com.vimeo.networking.model.Picture();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "width":
        	object.mWidth = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mWidth);
        	break;
        case "height":
        	object.mHeight = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mHeight);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "link_with_play_button":
        	object.mLinkWithPlayButton = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "resource_key":
        	object.setResourceKey(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
