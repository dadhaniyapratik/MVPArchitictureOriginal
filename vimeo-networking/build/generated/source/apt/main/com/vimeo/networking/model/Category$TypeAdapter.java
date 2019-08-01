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
public final class Category$TypeAdapter extends TypeAdapter<Category> {
  public static final TypeToken<Category> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Category.class);

  private final Gson mGson;

  private final TypeAdapter<PictureCollection> mTypeAdapter0;

  private final TypeAdapter<Category> mTypeAdapter1;

  private final TypeAdapter<ArrayList<Category>> mTypeAdapter2;

  private final TypeAdapter<Metadata> mTypeAdapter3;

  public Category$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.Category$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Category,java.util.ArrayList<com.vimeo.networking.model.Category>>(mTypeAdapter1, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Category>());
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Category object) throws IOException {
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

    writer.name("link");
    if (object.mLink != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLink);
    }
    else {
      writer.nullValue();
    }

    writer.name("top_level");
    writer.value(object.mTopLevel);

    writer.name("pictures");
    if (object.mPictures != null)  {
      mTypeAdapter0.write(writer, object.mPictures);
    }
    else {
      writer.nullValue();
    }

    writer.name("icon");
    if (object.mIcon != null)  {
      mTypeAdapter0.write(writer, object.mIcon);
    }
    else {
      writer.nullValue();
    }

    writer.name("subcategories");
    if (object.mSubcategories != null)  {
      mTypeAdapter2.write(writer, object.mSubcategories);
    }
    else {
      writer.nullValue();
    }

    writer.name("parent");
    if (object.mParent != null)  {
      mTypeAdapter1.write(writer, object.mParent);
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

    writer.name("resource_key");
    if (object.getResourceKey() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getResourceKey());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Category read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Category object = new com.vimeo.networking.model.Category();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "link":
        	object.mLink = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "top_level":
        	object.mTopLevel = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mTopLevel);
        	break;
        case "pictures":
        	object.mPictures = mTypeAdapter0.read(reader);
        	break;
        case "icon":
        	object.mIcon = mTypeAdapter0.read(reader);
        	break;
        case "subcategories":
        	object.mSubcategories = mTypeAdapter2.read(reader);
        	break;
        case "parent":
        	object.mParent = mTypeAdapter1.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter3.read(reader);
        	break;
        case "resource_key":
        	object.setResourceKey(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
