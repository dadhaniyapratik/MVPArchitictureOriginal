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
public final class Subscription$TypeAdapter extends TypeAdapter<Subscription> {
  public static final TypeToken<Subscription> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Subscription.class);

  private final Gson mGson;

  private final TypeAdapter<SubscriptionRenewal> mTypeAdapter0;

  private final TypeAdapter<SubscriptionTrial> mTypeAdapter1;

  public Subscription$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.SubscriptionRenewal$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.SubscriptionTrial$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Subscription object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("renewal");
    if (object.getRenewal() != null)  {
      mTypeAdapter0.write(writer, object.getRenewal());
    }
    else {
      writer.nullValue();
    }

    writer.name("trial");
    if (object.getTrial() != null)  {
      mTypeAdapter1.write(writer, object.getTrial());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Subscription read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Subscription object = new com.vimeo.networking.model.Subscription();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "renewal":
        	object.setRenewal(mTypeAdapter0.read(reader));
        	break;
        case "trial":
        	object.setTrial(mTypeAdapter1.read(reader));
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
