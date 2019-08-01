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
public final class Membership$TypeAdapter extends TypeAdapter<Membership> {
  public static final TypeToken<Membership> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Membership.class);

  private final Gson mGson;

  private final TypeAdapter<UserBadge> mTypeAdapter0;

  private final TypeAdapter<Subscription> mTypeAdapter1;

  public Membership$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.UserBadge$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.Subscription$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Membership object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("display");
    if (object.getDisplay() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getDisplay());
    }
    else {
      writer.nullValue();
    }

    writer.name("type");
    if (object.getType() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getType());
    }
    else {
      writer.nullValue();
    }

    writer.name("badge");
    if (object.getBadge() != null)  {
      mTypeAdapter0.write(writer, object.getBadge());
    }
    else {
      writer.nullValue();
    }

    writer.name("subscription");
    if (object.getSubscription() != null)  {
      mTypeAdapter1.write(writer, object.getSubscription());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Membership read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Membership object = new com.vimeo.networking.model.Membership();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "display":
        	object.setDisplay(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "type":
        	object.setType(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "badge":
        	object.setBadge(mTypeAdapter0.read(reader));
        	break;
        case "subscription":
        	object.setSubscription(mTypeAdapter1.read(reader));
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
