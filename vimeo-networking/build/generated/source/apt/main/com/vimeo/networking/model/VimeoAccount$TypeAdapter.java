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
public final class VimeoAccount$TypeAdapter extends TypeAdapter<VimeoAccount> {
  public static final TypeToken<VimeoAccount> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.VimeoAccount.class);

  private final Gson mGson;

  private final TypeAdapter<User> mTypeAdapter0;

  public VimeoAccount$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, VimeoAccount object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("access_token");
    if (object.mAccessToken != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mAccessToken);
    }
    else {
      writer.nullValue();
    }

    writer.name("token_type");
    if (object.mTokenType != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mTokenType);
    }
    else {
      writer.nullValue();
    }

    writer.name("scope");
    if (object.mScope != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mScope);
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.mUser != null)  {
      mTypeAdapter0.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public VimeoAccount read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.VimeoAccount object = new com.vimeo.networking.model.VimeoAccount();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "access_token":
        	object.mAccessToken = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "token_type":
        	object.mTokenType = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "scope":
        	object.mScope = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "user":
        	object.mUser = mTypeAdapter0.read(reader);
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
