package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Date;
import java.util.List;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Album$TypeAdapter extends TypeAdapter<Album> {
  public static final TypeToken<Album> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.Album.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<PictureCollection> mTypeAdapter1;

  private final TypeAdapter<AlbumEmbed> mTypeAdapter2;

  private final TypeAdapter<Album.LayoutType> mTypeAdapter3;

  private final TypeAdapter<Metadata> mTypeAdapter4;

  private final TypeAdapter<List<PictureCollection>> mTypeAdapter5;

  private final TypeAdapter<AlbumPrivacy> mTypeAdapter6;

  private final TypeAdapter<Album.SortType> mTypeAdapter7;

  private final TypeAdapter<Album.ThemeType> mTypeAdapter8;

  private final TypeAdapter<User> mTypeAdapter9;

  public Album$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.AlbumEmbed$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.Album$LayoutType$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.PictureCollection,java.util.List<com.vimeo.networking.model.PictureCollection>>(mTypeAdapter1, new com.vimeo.stag.KnownTypeAdapters.ListInstantiator<com.vimeo.networking.model.PictureCollection>());
    this.mTypeAdapter6 = gson.getAdapter(com.vimeo.networking.model.AlbumPrivacy$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter7 = gson.getAdapter(com.vimeo.networking.model.Album$SortType$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter8 = gson.getAdapter(com.vimeo.networking.model.Album$ThemeType$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter9 = gson.getAdapter(com.vimeo.networking.model.User$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Album object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("brand_color");
    if (object.getBrandColor() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getBrandColor());
    }
    else {
      writer.nullValue();
    }

    writer.name("created_time");
    if (object.getCreatedTime() != null)  {
      mTypeAdapter0.write(writer, object.getCreatedTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("custom_logo");
    if (object.getCustomLogo() != null)  {
      mTypeAdapter1.write(writer, object.getCustomLogo());
    }
    else {
      writer.nullValue();
    }

    writer.name("description");
    if (object.getDescription() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getDescription());
    }
    else {
      writer.nullValue();
    }

    writer.name("duration");
    if (object.getDuration() != null)  {
      com.vimeo.stag.KnownTypeAdapters.LONG.write(writer, object.getDuration());
    }
    else {
      writer.nullValue();
    }

    writer.name("embed");
    if (object.getEmbed() != null)  {
      mTypeAdapter2.write(writer, object.getEmbed());
    }
    else {
      writer.nullValue();
    }

    writer.name("hide_nav");
    writer.value(object.isHideNav());

    writer.name("layout");
    if (object.getLayout() != null)  {
      mTypeAdapter3.write(writer, object.getLayout());
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

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter4.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.name("modified_time");
    if (object.getModifiedTime() != null)  {
      mTypeAdapter0.write(writer, object.getModifiedTime());
    }
    else {
      writer.nullValue();
    }

    writer.name("name");
    if (object.getName() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getName());
    }
    else {
      writer.nullValue();
    }

    writer.name("pictures");
    if (object.getPictures() != null)  {
      mTypeAdapter5.write(writer, object.getPictures());
    }
    else {
      writer.nullValue();
    }

    writer.name("privacy");
    if (object.getPrivacy() != null)  {
      mTypeAdapter6.write(writer, object.getPrivacy());
    }
    else {
      writer.nullValue();
    }

    writer.name("review_mode");
    writer.value(object.isReviewMode());

    writer.name("sort");
    if (object.getSort() != null)  {
      mTypeAdapter7.write(writer, object.getSort());
    }
    else {
      writer.nullValue();
    }

    writer.name("theme");
    if (object.getTheme() != null)  {
      mTypeAdapter8.write(writer, object.getTheme());
    }
    else {
      writer.nullValue();
    }

    writer.name("uri");
    if (object.getUri() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getUri());
    }
    else {
      writer.nullValue();
    }

    writer.name("user");
    if (object.getUser() != null)  {
      mTypeAdapter9.write(writer, object.getUser());
    }
    else {
      writer.nullValue();
    }

    writer.name("resource_key");
    if (object.mResourceKey != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mResourceKey);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Album read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.Album object = new com.vimeo.networking.model.Album();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "brand_color":
        	object.setBrandColor(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "created_time":
        	object.setCreatedTime(mTypeAdapter0.read(reader));
        	break;
        case "custom_logo":
        	object.setCustomLogo(mTypeAdapter1.read(reader));
        	break;
        case "description":
        	object.setDescription(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "duration":
        	object.setDuration(com.vimeo.stag.KnownTypeAdapters.LONG.read(reader));
        	break;
        case "embed":
        	object.setEmbed(mTypeAdapter2.read(reader));
        	break;
        case "hide_nav":
        	object.setHideNav(com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.isHideNav()));
        	break;
        case "layout":
        	object.setLayout(mTypeAdapter3.read(reader));
        	break;
        case "link":
        	object.setLink(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter4.read(reader);
        	break;
        case "modified_time":
        	object.setModifiedTime(mTypeAdapter0.read(reader));
        	break;
        case "name":
        	object.setName(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "pictures":
        	object.setPictures(mTypeAdapter5.read(reader));
        	break;
        case "privacy":
        	object.setPrivacy(mTypeAdapter6.read(reader));
        	break;
        case "review_mode":
        	object.setReviewMode(com.vimeo.stag.KnownTypeAdapters.PrimitiveBooleanTypeAdapter.read(reader, object.isReviewMode()));
        	break;
        case "sort":
        	object.setSort(mTypeAdapter7.read(reader));
        	break;
        case "theme":
        	object.setTheme(mTypeAdapter8.read(reader));
        	break;
        case "uri":
        	object.setUri(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "user":
        	object.setUser(mTypeAdapter9.read(reader));
        	break;
        case "resource_key":
        	object.mResourceKey = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
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
