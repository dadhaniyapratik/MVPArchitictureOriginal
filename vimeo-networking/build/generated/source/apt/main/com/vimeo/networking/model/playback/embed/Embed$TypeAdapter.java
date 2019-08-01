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
public final class Embed$TypeAdapter extends TypeAdapter<Embed> {
  public static final TypeToken<Embed> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.embed.Embed.class);

  private final Gson mGson;

  private final TypeAdapter<EmbedHtml> mTypeAdapter0;

  private final TypeAdapter<EmbedButtons> mTypeAdapter1;

  private final TypeAdapter<EmbedTitle> mTypeAdapter2;

  public Embed$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.playback.embed.EmbedHtml$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.playback.embed.EmbedButtons$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.playback.embed.EmbedTitle$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Embed object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("uri");
    if (object.mUri != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mUri);
    }
    else {
      writer.nullValue();
    }

    writer.name("html");
    if (object.mHtml != null)  {
      mTypeAdapter0.write(writer, object.mHtml);
    }
    else {
      writer.nullValue();
    }

    writer.name("buttons");
    if (object.mButtons != null)  {
      mTypeAdapter1.write(writer, object.mButtons);
    }
    else {
      writer.nullValue();
    }

    writer.name("title");
    if (object.mTitle != null)  {
      mTypeAdapter2.write(writer, object.mTitle);
    }
    else {
      writer.nullValue();
    }

    writer.name("playbar");
    writer.value(object.mPlayBar);

    writer.name("volume");
    writer.value(object.mVolume);

    writer.name("color");
    if (object.mColor != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mColor);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Embed read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.embed.Embed object = new com.vimeo.networking.model.playback.embed.Embed();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "html":
        	object.mHtml = mTypeAdapter0.read(reader);
        	break;
        case "buttons":
        	object.mButtons = mTypeAdapter1.read(reader);
        	break;
        case "title":
        	object.mTitle = mTypeAdapter2.read(reader);
        	break;
        case "playbar":
        	object.mPlayBar = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mPlayBar);
        	break;
        case "volume":
        	object.mVolume = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mVolume);
        	break;
        case "color":
        	object.mColor = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
