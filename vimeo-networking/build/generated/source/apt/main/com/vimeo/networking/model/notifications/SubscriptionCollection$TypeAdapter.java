package com.vimeo.networking.model.notifications;

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
public final class SubscriptionCollection$TypeAdapter extends TypeAdapter<SubscriptionCollection> {
  public static final TypeToken<SubscriptionCollection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.notifications.SubscriptionCollection.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<Subscriptions> mTypeAdapter1;

  public SubscriptionCollection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.notifications.Subscriptions$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, SubscriptionCollection object) throws IOException {
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

    writer.name("modified_time");
    if (object.mModifiedTime != null)  {
      mTypeAdapter0.write(writer, object.mModifiedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("subscriptions");
    if (object.mSubscriptions != null)  {
      mTypeAdapter1.write(writer, object.mSubscriptions);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SubscriptionCollection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.notifications.SubscriptionCollection object = new com.vimeo.networking.model.notifications.SubscriptionCollection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "modified_time":
        	object.mModifiedTime = mTypeAdapter0.read(reader);
        	break;
        case "subscriptions":
        	object.mSubscriptions = mTypeAdapter1.read(reader);
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
