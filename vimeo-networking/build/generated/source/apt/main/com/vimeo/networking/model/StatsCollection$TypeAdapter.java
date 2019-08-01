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
public final class StatsCollection$TypeAdapter extends TypeAdapter<StatsCollection> {
  public static final TypeToken<StatsCollection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.StatsCollection.class);

  private final Gson mGson;

  public StatsCollection$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, StatsCollection object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("plays");
    if (object.mPlays != null)  {
      com.vimeo.stag.KnownTypeAdapters.INTEGER.write(writer, object.mPlays);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public StatsCollection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.StatsCollection object = new com.vimeo.networking.model.StatsCollection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "plays":
        	object.mPlays = com.vimeo.stag.KnownTypeAdapters.INTEGER.read(reader);
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
