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
public final class EmbedTitle$TypeAdapter extends TypeAdapter<EmbedTitle> {
  public static final TypeToken<EmbedTitle> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.embed.EmbedTitle.class);

  private final Gson mGson;

  public EmbedTitle$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, EmbedTitle object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.name("owner");
    if (object.mOwner != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mOwner);
    }
    else {
      writer.nullValue();
    }

    writer.name("portrait");
    if (object.mPortrait != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mPortrait);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public EmbedTitle read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.embed.EmbedTitle object = new com.vimeo.networking.model.playback.embed.EmbedTitle();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "owner":
        	object.mOwner = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "portrait":
        	object.mPortrait = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
