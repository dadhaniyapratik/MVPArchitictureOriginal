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
public final class Recommendation$TypeAdapter extends TypeAdapter<Recommendation> {
  public static final TypeToken<Recommendation> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Recommendation.class);

  private final Gson mGson;

  private final TypeAdapter<Category> mTypeAdapter0;

  private final TypeAdapter<User> mTypeAdapter1;

  private final TypeAdapter<Channel> mTypeAdapter2;

  public Recommendation$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Category$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.Channel$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Recommendation object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("category");
    if (object.mCategory != null)  {
      mTypeAdapter0.write(writer, object.mCategory);
    }
    else {
      writer.nullValue();
    }

    writer.name("type");
    if (object.mRecommendationType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mRecommendationType);
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter1.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("channel");
    if (object.mChannel != null)  {
      mTypeAdapter2.write(writer, object.mChannel);
    }
    else {
      writer.nullValue();
    }

    writer.name("description");
    if (object.mDescription != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mDescription);
    }
    else {
      writer.nullValue();
    }

    writer.name("resource_key");
    if (object.mResourceKey != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mResourceKey);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Recommendation read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Recommendation object = new com.vimeo.networking.model.Recommendation();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "category":
        	object.mCategory = mTypeAdapter0.read(reader);
        	break;
        case "type":
        	object.mRecommendationType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter1.read(reader);
        	break;
        case "channel":
        	object.mChannel = mTypeAdapter2.read(reader);
        	break;
        case "description":
        	object.mDescription = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "resource_key":
        	object.mResourceKey = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
