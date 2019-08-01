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
public final class TrialEligibility$TypeAdapter extends TypeAdapter<TrialEligibility> {
  public static final TypeToken<TrialEligibility> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.TrialEligibility.class);

  private final Gson mGson;

  public TrialEligibility$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, TrialEligibility object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("eligible");
    if (object.getEligible() != null)  {
      com.google.gson.internal.bind.TypeAdapters.BOOLEAN.write(writer, object.getEligible());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public TrialEligibility read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.TrialEligibility object = new com.vimeo.networking.model.TrialEligibility();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "eligible":
        	object.setEligible(com.google.gson.internal.bind.TypeAdapters.BOOLEAN.read(reader));
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
