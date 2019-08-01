package com.vimeo.networking.model.appconfiguration;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.appconfiguration.live.LiveConfiguration;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppConfiguration$TypeAdapter extends TypeAdapter<AppConfiguration> {
  public static final TypeToken<AppConfiguration> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.appconfiguration.AppConfiguration.class);

  private final Gson mGson;

  private final TypeAdapter<FacebookConfiguration> mTypeAdapter0;

  private final TypeAdapter<ApiConfiguration> mTypeAdapter1;

  private final TypeAdapter<FeaturesConfiguration> mTypeAdapter2;

  private final TypeAdapter<LiveConfiguration> mTypeAdapter3;

  public AppConfiguration$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.appconfiguration.FacebookConfiguration> typeToken0 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.appconfiguration.FacebookConfiguration.class);
    com.google.gson.reflect.TypeToken<com.vimeo.networking.model.appconfiguration.ApiConfiguration> typeToken1 = com.google.gson.reflect.TypeToken.get(com.vimeo.networking.model.appconfiguration.ApiConfiguration.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(typeToken1);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.appconfiguration.FeaturesConfiguration$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.appconfiguration.live.LiveConfiguration$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, AppConfiguration object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("facebook");
    if (object.getFacebook() != null)  {
      mTypeAdapter0.write(writer, object.getFacebook());
    }
    else {
      writer.nullValue();
    }

    writer.name("api");
    if (object.getApi() != null)  {
      mTypeAdapter1.write(writer, object.getApi());
    }
    else {
      writer.nullValue();
    }

    writer.name("features");
    if (object.getFeatures() != null)  {
      mTypeAdapter2.write(writer, object.getFeatures());
    }
    else {
      writer.nullValue();
    }

    writer.name("live");
    if (object.getLiveConfiguration() != null)  {
      mTypeAdapter3.write(writer, object.getLiveConfiguration());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public AppConfiguration read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.appconfiguration.AppConfiguration object = new com.vimeo.networking.model.appconfiguration.AppConfiguration();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "facebook":
        	object.setFacebook(mTypeAdapter0.read(reader));
        	break;
        case "api":
        	object.setApi(mTypeAdapter1.read(reader));
        	break;
        case "features":
        	object.setFeatures(mTypeAdapter2.read(reader));
        	break;
        case "live":
        	object.setLiveConfiguration(mTypeAdapter3.read(reader));
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
