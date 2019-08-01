package com.vimeo.networking.upload;

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
public final class Upload$TypeAdapter extends TypeAdapter<Upload> {
  public static final TypeToken<Upload> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.upload.Upload.class);

  private final Gson mGson;

  private final TypeAdapter<Gcs> mTypeAdapter0;

  private final TypeAdapter<ArrayList<Gcs>> mTypeAdapter1;

  private final TypeAdapter<Upload.Status> mTypeAdapter2;

  public Upload$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<com.vimeo.networking.upload.Upload.Status> typeToken0 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.upload.Upload.Status.class);
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.upload.Gcs$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.upload.Gcs,java.util.ArrayList<com.vimeo.networking.upload.Gcs>>(mTypeAdapter0, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.upload.Gcs>());
    this.mTypeAdapter2 = gson.getAdapter(typeToken0);
  }

  @Override
  public void write(JsonWriter writer, Upload object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("approach");
    if (object.getApproach() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getApproach());
    }
    else {
      writer.nullValue();
    }

    writer.name("complete_uri");
    if (object.getCompleteUri() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getCompleteUri());
    }
    else {
      writer.nullValue();
    }

    writer.name("gcs");
    if (object.getGcs() != null)  {
      mTypeAdapter1.write(writer, object.getGcs());
    }
    else {
      writer.nullValue();
    }

    writer.name("form");
    if (object.getForm() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getForm());
    }
    else {
      writer.nullValue();
    }

    writer.name("link");
    if (object.getLink() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getLink());
    }
    else {
      writer.nullValue();
    }

    writer.name("redirect_url");
    if (object.getRedirectUrl() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getRedirectUrl());
    }
    else {
      writer.nullValue();
    }

    writer.name("size");
    if (object.getSize() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getSize());
    }
    else {
      writer.nullValue();
    }

    writer.name("status");
    if (object.getStatus() != null)  {
      mTypeAdapter2.write(writer, object.getStatus());
    }
    else {
      writer.nullValue();
    }

    writer.name("upload_link");
    if (object.getUploadLink() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getUploadLink());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Upload read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.upload.Upload object = new com.vimeo.networking.upload.Upload();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "approach":
        	object.setApproach(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "complete_uri":
        	object.setCompleteUri(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "gcs":
        	object.setGcs(mTypeAdapter1.read(reader));
        	break;
        case "form":
        	object.setForm(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "link":
        	object.setLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "redirect_url":
        	object.setRedirectUrl(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "size":
        	object.setSize(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "status":
        	object.setStatus(mTypeAdapter2.read(reader));
        	break;
        case "upload_link":
        	object.setUploadLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
