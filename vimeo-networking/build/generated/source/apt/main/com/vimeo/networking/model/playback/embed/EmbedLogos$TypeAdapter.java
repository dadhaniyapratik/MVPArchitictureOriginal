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
public final class EmbedLogos$TypeAdapter extends TypeAdapter<EmbedLogos> {
  public static final TypeToken<EmbedLogos> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.embed.EmbedLogos.class);

  private final Gson mGson;

  private final TypeAdapter<EmbedCustomLogos> mTypeAdapter0;

  public EmbedLogos$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.playback.embed.EmbedCustomLogos$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, EmbedLogos object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("vimeo");
    writer.value(object.mVimeoLogoVisible);

    writer.name("custom");
    if (object.mCustom != null)  {
      mTypeAdapter0.write(writer, object.mCustom);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public EmbedLogos read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.embed.EmbedLogos object = new com.vimeo.networking.model.playback.embed.EmbedLogos();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "vimeo":
        	object.mVimeoLogoVisible = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mVimeoLogoVisible);
        	break;
        case "custom":
        	object.mCustom = mTypeAdapter0.read(reader);
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
