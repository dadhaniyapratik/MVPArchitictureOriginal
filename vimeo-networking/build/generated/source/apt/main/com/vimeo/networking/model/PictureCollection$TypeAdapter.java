package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PictureCollection$TypeAdapter extends TypeAdapter<PictureCollection> {
  public static final TypeToken<PictureCollection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.PictureCollection.class);

  private final Gson mGson;

  private final TypeAdapter<Picture> mTypeAdapter0;

  private final TypeAdapter<ArrayList<Picture>> mTypeAdapter1;

  public PictureCollection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Picture$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Picture,java.util.ArrayList<com.vimeo.networking.model.Picture>>(mTypeAdapter0, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Picture>());
  }

  @Override
  public void write(JsonWriter writer, PictureCollection object) throws IOException {
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

    writer.name("active");
    writer.value(object.mIsActive);

    writer.name("type");
    if (object.mType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mType);
    }
    else {
      writer.nullValue();
    }

    writer.name("sizes");
    if (object.mPictures != null)  {
      mTypeAdapter1.write(writer, object.mPictures);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public PictureCollection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.PictureCollection object = new com.vimeo.networking.model.PictureCollection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        case "m_uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "active":
        case "m_is_active":
        	object.mIsActive = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mIsActive);
        	break;
        case "type":
        case "m_type":
        	object.mType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "sizes":
        case "m_pictures":
        	object.mPictures = mTypeAdapter1.read(reader);
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
