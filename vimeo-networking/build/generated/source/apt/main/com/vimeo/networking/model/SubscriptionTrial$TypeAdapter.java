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
public final class SubscriptionTrial$TypeAdapter extends TypeAdapter<SubscriptionTrial> {
  public static final TypeToken<SubscriptionTrial> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.SubscriptionTrial.class);

  private final Gson mGson;

  public SubscriptionTrial$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, SubscriptionTrial object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("status");
    if (object.getStatus() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getStatus());
    }
    else {
      writer.nullValue();
    }

    writer.name("has_been_in_free_trial");
    if (object.getHasBeenInFreeTrial() != null)  {
      com.google.gson.internal.bind.TypeAdapters.BOOLEAN.write(writer, object.getHasBeenInFreeTrial());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SubscriptionTrial read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.SubscriptionTrial object = new com.vimeo.networking.model.SubscriptionTrial();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "status":
        	object.setStatus(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "has_been_in_free_trial":
        	object.setHasBeenInFreeTrial(com.google.gson.internal.bind.TypeAdapters.BOOLEAN.read(reader));
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
