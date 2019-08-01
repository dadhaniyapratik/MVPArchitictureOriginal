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
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Interaction$TypeAdapter extends TypeAdapter<Interaction> {
  public static final TypeToken<Interaction> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Interaction.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<Interaction.Stream> mTypeAdapter1;

  private final TypeAdapter<Interaction.IapStatus> mTypeAdapter2;

  private final TypeAdapter<ArrayList<String>> mTypeAdapter3;

  public Interaction$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.Interaction$Stream$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.Interaction$IapStatus$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<java.lang.String,java.util.ArrayList<java.lang.String>>(com.google.gson.internal.bind.TypeAdapters.STRING, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<java.lang.String>());
  }

  @Override
  public void write(JsonWriter writer, Interaction object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("added");
    writer.value(object.mAdded);

    writer.name("added_time");
    if (object.mAddedTime != null)  {
      mTypeAdapter0.write(writer, object.mAddedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("uri");
    if (object.mUri != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mUri);
    }
    else {
      writer.nullValue();
    }

    writer.name("stream");
    if (object.mStream != null)  {
      mTypeAdapter1.write(writer, object.mStream);
    }
    else {
      writer.nullValue();
    }

    writer.name("status");
    if (object.mStatus != null)  {
      mTypeAdapter2.write(writer, object.mStatus);
    }
    else {
      writer.nullValue();
    }

    writer.name("expires_time");
    if (object.mExpiration != null)  {
      mTypeAdapter0.write(writer, object.mExpiration);
    }
    else {
      writer.nullValue();
    }

    writer.name("reason");
    if (object.mReportingReasons != null)  {
      mTypeAdapter3.write(writer, object.mReportingReasons);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Interaction read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Interaction object = new com.vimeo.networking.model.Interaction();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "added":
        	object.mAdded = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mAdded);
        	break;
        case "added_time":
        	object.mAddedTime = mTypeAdapter0.read(reader);
        	break;
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "stream":
        	object.mStream = mTypeAdapter1.read(reader);
        	break;
        case "status":
        	object.mStatus = mTypeAdapter2.read(reader);
        	break;
        case "expires_time":
        	object.mExpiration = mTypeAdapter0.read(reader);
        	break;
        case "reason":
        	object.mReportingReasons = mTypeAdapter3.read(reader);
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
