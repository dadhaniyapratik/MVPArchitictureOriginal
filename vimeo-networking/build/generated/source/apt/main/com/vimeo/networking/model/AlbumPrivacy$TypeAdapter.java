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
public final class AlbumPrivacy$TypeAdapter extends TypeAdapter<AlbumPrivacy> {
  public static final TypeToken<AlbumPrivacy> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.AlbumPrivacy.class);

  private final Gson mGson;

  private final TypeAdapter<AlbumPrivacy.AlbumPrivacyViewValue> mTypeAdapter0;

  public AlbumPrivacy$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.AlbumPrivacy$AlbumPrivacyViewValue$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, AlbumPrivacy object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("password");
    if (object.getPassword() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getPassword());
    }
    else {
      writer.nullValue();
    }

    writer.name("view");
    if (object.getViewingPermissions() != null)  {
      mTypeAdapter0.write(writer, object.getViewingPermissions());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public AlbumPrivacy read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.AlbumPrivacy object = new com.vimeo.networking.model.AlbumPrivacy();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "password":
        	object.setPassword(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "view":
        	object.setViewingPermissions(mTypeAdapter0.read(reader));
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
