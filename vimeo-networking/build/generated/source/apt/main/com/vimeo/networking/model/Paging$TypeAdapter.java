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
public final class Paging$TypeAdapter extends TypeAdapter<Paging> {
  public static final TypeToken<Paging> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Paging.class);

  private final Gson mGson;

  public Paging$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, Paging object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("next");
    if (object.mNext != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mNext);
    }
    else {
      writer.nullValue();
    }

    writer.name("previous");
    if (object.mPrevious != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mPrevious);
    }
    else {
      writer.nullValue();
    }

    writer.name("first");
    if (object.mFirst != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mFirst);
    }
    else {
      writer.nullValue();
    }

    writer.name("last");
    if (object.mLast != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLast);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Paging read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Paging object = new com.vimeo.networking.model.Paging();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "next":
        	object.mNext = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "previous":
        	object.mPrevious = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "first":
        	object.mFirst = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "last":
        	object.mLast = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
