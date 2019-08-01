package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Connection$TypeAdapter extends TypeAdapter<Connection> {
  public static final TypeToken<Connection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Connection.class);

  private final Gson mGson;

  private final TypeAdapter<ArrayList<String>> mTypeAdapter0;

  public Connection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<java.lang.String,java.util.ArrayList<java.lang.String>>(com.google.gson.internal.bind.TypeAdapters.STRING, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<java.lang.String>());
  }

  @Override
  public void write(JsonWriter writer, Connection object) throws IOException {
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

    writer.name("options");
    if (object.mOptions != null)  {
      mTypeAdapter0.write(writer, object.mOptions);
    }
    else {
      writer.nullValue();
    }

    writer.name("total");
    writer.value(object.mTotal);

    writer.name("main_total");
    writer.value(object.mMainTotal);

    writer.name("extra_total");
    writer.value(object.mExtraTotal);

    writer.name("viewable_total");
    writer.value(object.mViewableTotal);

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Connection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Connection object = new com.vimeo.networking.model.Connection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "options":
        	object.mOptions = mTypeAdapter0.read(reader);
        	break;
        case "total":
        	object.mTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mTotal);
        	break;
        case "main_total":
        	object.mMainTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mMainTotal);
        	break;
        case "extra_total":
        	object.mExtraTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mExtraTotal);
        	break;
        case "viewable_total":
        	object.mViewableTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mViewableTotal);
        	break;
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
