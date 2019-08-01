package com.vimeo.networking.model.cinema;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Category;
import com.vimeo.networking.model.Channel;
import com.vimeo.networking.model.Metadata;
import com.vimeo.networking.model.Video;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProgramContentItem$TypeAdapter extends TypeAdapter<ProgramContentItem> {
  public static final TypeToken<ProgramContentItem> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.cinema.ProgramContentItem.class);

  private final Gson mGson;

  private final TypeAdapter<ProgramContentItem.Type> mTypeAdapter0;

  private final TypeAdapter<Video> mTypeAdapter1;

  private final TypeAdapter<ArrayList<Video>> mTypeAdapter2;

  private final TypeAdapter<Metadata> mTypeAdapter3;

  private final TypeAdapter<Channel> mTypeAdapter4;

  private final TypeAdapter<Category> mTypeAdapter5;

  public ProgramContentItem$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.cinema.ProgramContentItem$Type$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.Video$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Video,java.util.ArrayList<com.vimeo.networking.model.Video>>(mTypeAdapter1, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Video>());
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Channel$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = gson.getAdapter(com.vimeo.networking.model.Category$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, ProgramContentItem object) throws IOException {
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
      mTypeAdapter0.write(writer, object.mType);
    }
    else {
      writer.nullValue();
    }

    writer.name("content");
    if (object.mVideoList != null)  {
      mTypeAdapter2.write(writer, object.mVideoList);
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter3.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.name("channel");
    if (object.mChannel != null)  {
      mTypeAdapter4.write(writer, object.mChannel);
    }
    else {
      writer.nullValue();
    }

    writer.name("category");
    if (object.mCategory != null)  {
      mTypeAdapter5.write(writer, object.mCategory);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public ProgramContentItem read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.cinema.ProgramContentItem object = new com.vimeo.networking.model.cinema.ProgramContentItem();
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
        	object.mType = mTypeAdapter0.read(reader);
        	break;
        case "content":
        	object.mVideoList = mTypeAdapter2.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter3.read(reader);
        	break;
        case "channel":
        	object.mChannel = mTypeAdapter4.read(reader);
        	break;
        case "category":
        	object.mCategory = mTypeAdapter5.read(reader);
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
