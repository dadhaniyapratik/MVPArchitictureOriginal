package com.vimeo.networking.model.tvod;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Metadata;
import com.vimeo.networking.model.User;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Season$TypeAdapter extends TypeAdapter<Season> {
  public static final TypeToken<Season> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.tvod.Season.class);

  private final Gson mGson;

  private final TypeAdapter<User> mTypeAdapter0;

  private final TypeAdapter<Metadata> mTypeAdapter1;

  public Season$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Season object) throws IOException {
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

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.name("type");
    if (object.mType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mType);
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

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter0.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("position");
    writer.value(object.mPosition);

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter1.write(writer, object.mMetadata);
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
  public Season read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.tvod.Season object = new com.vimeo.networking.model.tvod.Season();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "type":
        	object.mType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "description":
        	object.mDescription = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter0.read(reader);
        	break;
        case "position":
        	object.mPosition = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mPosition);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter1.read(reader);
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
