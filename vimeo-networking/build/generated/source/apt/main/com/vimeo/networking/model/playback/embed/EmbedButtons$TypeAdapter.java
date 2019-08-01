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
public final class EmbedButtons$TypeAdapter extends TypeAdapter<EmbedButtons> {
  public static final TypeToken<EmbedButtons> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.embed.EmbedButtons.class);

  private final Gson mGson;

  public EmbedButtons$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, EmbedButtons object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("like");
    writer.value(object.mLike);

    writer.name("watchlater");
    writer.value(object.mWatchLater);

    writer.name("share");
    writer.value(object.mShare);

    writer.name("embed");
    writer.value(object.mEmbed);

    writer.name("hd");
    writer.value(object.mHd);

    writer.name("fullscreen");
    writer.value(object.mFullscreen);

    writer.name("scaling");
    writer.value(object.mScaling);

    writer.endObject();
  }

  @Override
  public EmbedButtons read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.embed.EmbedButtons object = new com.vimeo.networking.model.playback.embed.EmbedButtons();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "like":
        	object.mLike = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mLike);
        	break;
        case "watchlater":
        	object.mWatchLater = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mWatchLater);
        	break;
        case "share":
        	object.mShare = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mShare);
        	break;
        case "embed":
        	object.mEmbed = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mEmbed);
        	break;
        case "hd":
        	object.mHd = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mHd);
        	break;
        case "fullscreen":
        	object.mFullscreen = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mFullscreen);
        	break;
        case "scaling":
        	object.mScaling = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mScaling);
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
