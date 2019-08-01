package com.vimeo.networking.model.search;

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
public final class SuggestionResponse$TypeAdapter extends TypeAdapter<SuggestionResponse> {
  public static final TypeToken<SuggestionResponse> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.SuggestionResponse.class);

  private final Gson mGson;

  private final TypeAdapter<TvodSuggestion> mTypeAdapter0;

  private final TypeAdapter<ArrayList<TvodSuggestion>> mTypeAdapter1;

  private final TypeAdapter<VideoSuggestion> mTypeAdapter2;

  private final TypeAdapter<ArrayList<VideoSuggestion>> mTypeAdapter3;

  public SuggestionResponse$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.search.TvodSuggestion$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.search.TvodSuggestion,java.util.ArrayList<com.vimeo.networking.model.search.TvodSuggestion>>(mTypeAdapter0, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.search.TvodSuggestion>());
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.search.VideoSuggestion$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.search.VideoSuggestion,java.util.ArrayList<com.vimeo.networking.model.search.VideoSuggestion>>(mTypeAdapter2, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.search.VideoSuggestion>());
  }

  @Override
  public void write(JsonWriter writer, SuggestionResponse object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("ondemand_title");
    if (object.mTvodSuggestions != null)  {
      mTypeAdapter1.write(writer, object.mTvodSuggestions);
    }
    else {
      writer.nullValue();
    }

    writer.name("video");
    if (object.mVideoSuggestions != null)  {
      mTypeAdapter3.write(writer, object.mVideoSuggestions);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SuggestionResponse read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.SuggestionResponse object = new com.vimeo.networking.model.search.SuggestionResponse();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "ondemand_title":
        	object.mTvodSuggestions = mTypeAdapter1.read(reader);
        	break;
        case "video":
        	object.mVideoSuggestions = mTypeAdapter3.read(reader);
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
