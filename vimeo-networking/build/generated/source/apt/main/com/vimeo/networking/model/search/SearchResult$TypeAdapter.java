package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Channel;
import com.vimeo.networking.model.Group;
import com.vimeo.networking.model.User;
import com.vimeo.networking.model.Video;
import com.vimeo.networking.model.tvod.TvodItem;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchResult$TypeAdapter extends TypeAdapter<SearchResult> {
  public static final TypeToken<SearchResult> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.search.SearchResult.class);

  private final Gson mGson;

  private final TypeAdapter<SearchType> mTypeAdapter0;

  private final TypeAdapter<Video> mTypeAdapter1;

  private final TypeAdapter<User> mTypeAdapter2;

  private final TypeAdapter<Channel> mTypeAdapter3;

  private final TypeAdapter<Group> mTypeAdapter4;

  private final TypeAdapter<TvodItem> mTypeAdapter5;

  public SearchResult$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.search.SearchType$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.Video$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Channel$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Group$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = gson.getAdapter(com.vimeo.networking.model.tvod.TvodItem$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, SearchResult object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("is_staffpick");
    writer.value(object.mIsStaffPick);

    writer.name("is_featured");
    writer.value(object.mIsFeatured);

    writer.name("type");
    if (object.mSearchType != null)  {
      mTypeAdapter0.write(writer, object.mSearchType);
    }
    else {
      writer.nullValue();
    }

    writer.name("clip");
    if (object.mVideo != null)  {
      mTypeAdapter1.write(writer, object.mVideo);
    }
    else {
      writer.nullValue();
    }

    writer.name("people");
    if (object.mUser != null)  {
      mTypeAdapter2.write(writer, object.mUser);
    }
    else {
      writer.nullValue();
    }

    writer.name("channel");
    if (object.mChannel != null)  {
      mTypeAdapter3.write(writer, object.mChannel);
    }
    else {
      writer.nullValue();
    }

    writer.name("group");
    if (object.mGroup != null)  {
      mTypeAdapter4.write(writer, object.mGroup);
    }
    else {
      writer.nullValue();
    }

    writer.name("ondemand");
    if (object.mTvod != null)  {
      mTypeAdapter5.write(writer, object.mTvod);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public SearchResult read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.search.SearchResult object = new com.vimeo.networking.model.search.SearchResult();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "is_staffpick":
        	object.mIsStaffPick = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mIsStaffPick);
        	break;
        case "is_featured":
        	object.mIsFeatured = com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.mIsFeatured);
        	break;
        case "type":
        	object.mSearchType = mTypeAdapter0.read(reader);
        	break;
        case "clip":
        	object.mVideo = mTypeAdapter1.read(reader);
        	break;
        case "people":
        	object.mUser = mTypeAdapter2.read(reader);
        	break;
        case "channel":
        	object.mChannel = mTypeAdapter3.read(reader);
        	break;
        case "group":
        	object.mGroup = mTypeAdapter4.read(reader);
        	break;
        case "ondemand":
        	object.mTvod = mTypeAdapter5.read(reader);
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
