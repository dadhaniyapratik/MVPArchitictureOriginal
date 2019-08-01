package com.vimeo.networking.model.appconfiguration;

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
public final class FeaturesConfiguration$TypeAdapter extends TypeAdapter<FeaturesConfiguration> {
  public static final TypeToken<FeaturesConfiguration> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.appconfiguration.FeaturesConfiguration.class);

  private final Gson mGson;

  public FeaturesConfiguration$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, FeaturesConfiguration object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("play_tracking");
    if (object.getPlayTracking() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getPlayTracking());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public FeaturesConfiguration read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.appconfiguration.FeaturesConfiguration object = new com.vimeo.networking.model.appconfiguration.FeaturesConfiguration();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "play_tracking":
        	object.setPlayTracking(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
