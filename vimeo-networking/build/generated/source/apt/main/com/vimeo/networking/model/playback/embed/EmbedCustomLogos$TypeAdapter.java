package com.vimeo.networking.model.playback.embed;

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
public final class EmbedCustomLogos$TypeAdapter extends TypeAdapter<EmbedCustomLogos> {
  public static final TypeToken<EmbedCustomLogos> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.embed.EmbedCustomLogos.class);

  private final Gson mGson;

  public EmbedCustomLogos$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, EmbedCustomLogos object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("active");
    writer.value(object.mActive);

    writer.name("link");
    if (object.mLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("sticky");
    writer.value(object.mSticky);

    writer.endObject();
  }

  @Override
  public EmbedCustomLogos read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.embed.EmbedCustomLogos object = new com.vimeo.networking.model.playback.embed.EmbedCustomLogos();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "active":
        	object.mActive = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mActive);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "sticky":
        	object.mSticky = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mSticky);
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
