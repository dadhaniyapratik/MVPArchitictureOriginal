package com.vimeo.networking.model.appconfiguration.live;

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
public final class LiveChatConfiguration$TypeAdapter extends TypeAdapter<LiveChatConfiguration> {
  public static final TypeToken<LiveChatConfiguration> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration.class);

  private final Gson mGson;

  public LiveChatConfiguration$TypeAdapter(Gson gson) {
    this.mGson = gson;
  }

  @Override
  public void write(JsonWriter writer, LiveChatConfiguration object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("api_key");
    if (object.getApiKey() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getApiKey());
    }
    else {
      writer.nullValue();
    }

    writer.name("app_id");
    if (object.getAppId() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getAppId());
    }
    else {
      writer.nullValue();
    }

    writer.name("auth_domain");
    if (object.getAuthDomain() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getAuthDomain());
    }
    else {
      writer.nullValue();
    }

    writer.name("database_url");
    if (object.getDatabaseUrl() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getDatabaseUrl());
    }
    else {
      writer.nullValue();
    }

    writer.name("messaging_sender_id");
    if (object.getMessagingSenderId() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getMessagingSenderId());
    }
    else {
      writer.nullValue();
    }

    writer.name("project_id");
    if (object.getProjectId() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getProjectId());
    }
    else {
      writer.nullValue();
    }

    writer.name("storage_bucket");
    if (object.getStorageBucket() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getStorageBucket());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public LiveChatConfiguration read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration object = new com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "api_key":
        	object.setApiKey(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "app_id":
        	object.setAppId(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "auth_domain":
        	object.setAuthDomain(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "database_url":
        	object.setDatabaseUrl(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "messaging_sender_id":
        	object.setMessagingSenderId(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "project_id":
        	object.setProjectId(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "storage_bucket":
        	object.setStorageBucket(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
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
