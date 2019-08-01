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
public final class VideoBadge$TypeAdapter extends TypeAdapter<VideoBadge> {
  public static final TypeToken<VideoBadge> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.VideoBadge.class);

  private final Gson mGson;

  private final TypeAdapter<PictureCollection> mTypeAdapter0;

  public VideoBadge$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, VideoBadge object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("type");
    if (object.mType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mType);
    }
    else {
      writer.nullValue();
    }

    writer.name("festival");
    if (object.mFestival != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mFestival);
    }
    else {
      writer.nullValue();
    }

    writer.name("link");
    if (object.mLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("text");
    if (object.mText != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mText);
    }
    else {
      writer.nullValue();
    }

    writer.name("pictures");
    if (object.mPictureCollection != null)  {
      mTypeAdapter0.write(writer, object.mPictureCollection);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public VideoBadge read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.VideoBadge object = new com.vimeo.networking.model.VideoBadge();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "type":
        	object.mType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "festival":
        	object.mFestival = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "text":
        	object.mText = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "pictures":
        	object.mPictureCollection = mTypeAdapter0.read(reader);
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
