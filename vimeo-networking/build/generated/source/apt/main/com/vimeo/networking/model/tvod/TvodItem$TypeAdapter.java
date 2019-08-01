package com.vimeo.networking.model.tvod;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Metadata;
import com.vimeo.networking.model.PictureCollection;
import com.vimeo.networking.model.User;
import com.vimeo.networking.model.Video;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TvodItem$TypeAdapter extends TypeAdapter<TvodItem> {
  public static final TypeToken<TvodItem> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.tvod.TvodItem.class);

  private final Gson mGson;

  private final TypeAdapter<TvodItem.TvodType> mTypeAdapter0;

  private final TypeAdapter<TvodItem.Publish> mTypeAdapter1;

  private final TypeAdapter<PictureCollection> mTypeAdapter2;

  private final TypeAdapter<Metadata> mTypeAdapter3;

  private final TypeAdapter<User> mTypeAdapter4;

  private final TypeAdapter<Video> mTypeAdapter5;

  public TvodItem$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.tvod.TvodItem$TvodType$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.tvod.TvodItem$Publish$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = gson.getAdapter(com.vimeo.networking.model.Video$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, TvodItem object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
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

    writer.name("type");
    if (object.mType != null)  {
      mTypeAdapter0.write(writer, object.mType);
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

    writer.name("publish");
    if (object.mPublish != null)  {
      mTypeAdapter1.write(writer, object.mPublish);
    }
    else {
      writer.nullValue();
    }

    writer.name("pictures");
    if (object.mPictures != null)  {
      mTypeAdapter2.write(writer, object.mPictures);
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

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter4.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("film");
    if (object.mFilm != null)  {
      mTypeAdapter5.write(writer, object.mFilm);
    }
    else {
      writer.nullValue();
    }

    writer.name("trailer");
    if (object.mTrailer != null)  {
      mTypeAdapter5.write(writer, object.mTrailer);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public TvodItem read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.tvod.TvodItem object = new com.vimeo.networking.model.tvod.TvodItem();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "description":
        	object.mDescription = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "type":
        	object.mType = mTypeAdapter0.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "publish":
        	object.mPublish = mTypeAdapter1.read(reader);
        	break;
        case "pictures":
        	object.mPictures = mTypeAdapter2.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter3.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter4.read(reader);
        	break;
        case "film":
        	object.mFilm = mTypeAdapter5.read(reader);
        	break;
        case "trailer":
        	object.mTrailer = mTypeAdapter5.read(reader);
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
