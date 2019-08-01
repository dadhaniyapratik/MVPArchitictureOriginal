package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SubscriptionRenewal$TypeAdapter extends TypeAdapter<SubscriptionRenewal> {
  public static final TypeToken<SubscriptionRenewal> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.SubscriptionRenewal.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  public SubscriptionRenewal$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
  }

  @Override
  public void write(JsonWriter writer, SubscriptionRenewal object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("display_date");
    if (object.getDisplayDate() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getDisplayDate());
    }
    else {
      writer.nullValue();
    }

    writer.name("renewal_date");
    if (object.getRenewalDate() != null)  {
      mTypeAdapter0.write(writer, object.getRenewalDate());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SubscriptionRenewal read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.SubscriptionRenewal object = new com.vimeo.networking.model.SubscriptionRenewal();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "display_date":
        	object.setDisplayDate(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "renewal_date":
        	object.setRenewalDate(mTypeAdapter0.read(reader));
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
