package com.vimeo.networking.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.live.LiveQuota;
import com.vimeo.networking.model.uploadquota.UploadQuota;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class User$TypeAdapter extends TypeAdapter<User> {
  public static final TypeToken<User> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.User.class);

  private final Gson mGson;

  private final TypeAdapter<Date> mTypeAdapter0;

  private final TypeAdapter<PictureCollection> mTypeAdapter1;

  private final TypeAdapter<Email> mTypeAdapter2;

  private final TypeAdapter<ArrayList<Email>> mTypeAdapter3;

  private final TypeAdapter<Website> mTypeAdapter4;

  private final TypeAdapter<ArrayList<Website>> mTypeAdapter5;

  private final TypeAdapter<Metadata> mTypeAdapter6;

  private final TypeAdapter<UploadQuota> mTypeAdapter7;

  private final TypeAdapter<Preferences> mTypeAdapter8;

  private final TypeAdapter<LiveQuota> mTypeAdapter9;

  private final TypeAdapter<Membership> mTypeAdapter10;

  public User$TypeAdapter(Gson gson) {
    this.mGson = gson;
    com.google.gson.reflect.TypeToken<java.util.Date> typeToken0 = com.google.gson.reflect.TypeToken.get(java.util.Date.class);
    this.mTypeAdapter0 = gson.getAdapter(typeToken0);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.PictureCollection$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.Email$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Email,java.util.ArrayList<com.vimeo.networking.model.Email>>(mTypeAdapter2, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Email>());
    this.mTypeAdapter4 = gson.getAdapter(com.vimeo.networking.model.Website$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter5 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.Website,java.util.ArrayList<com.vimeo.networking.model.Website>>(mTypeAdapter4, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.Website>());
    this.mTypeAdapter6 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter7 = gson.getAdapter(com.vimeo.networking.model.uploadquota.UploadQuota$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter8 = gson.getAdapter(com.vimeo.networking.model.Preferences$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter9 = gson.getAdapter(com.vimeo.networking.model.live.LiveQuota$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter10 = gson.getAdapter(com.vimeo.networking.model.Membership$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, User object) throws IOException {
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

    writer.name("location");
    if (object.mLocation != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mLocation);
    }
    else {
      writer.nullValue();
    }

    writer.name("bio");
    if (object.mBio != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mBio);
    }
    else {
      writer.nullValue();
    }

    writer.name("created_time");
    if (object.mCreatedTime != null)  {
      mTypeAdapter0.write(writer, object.mCreatedTime);
    }
    else {
      writer.nullValue();
    }

    writer.name("pictures");
    if (object.mPictures != null)  {
      mTypeAdapter1.write(writer, object.mPictures);
    }
    else {
      writer.nullValue();
    }

    writer.name("emails");
    if (object.mEmails != null)  {
      mTypeAdapter3.write(writer, object.mEmails);
    }
    else {
      writer.nullValue();
    }

    writer.name("websites");
    if (object.mWebsites != null)  {
      mTypeAdapter5.write(writer, object.mWebsites);
    }
    else {
      writer.nullValue();
    }

    writer.name("metadata");
    if (object.mMetadata != null)  {
      mTypeAdapter6.write(writer, object.mMetadata);
    }
    else {
      writer.nullValue();
    }

    writer.name("upload_quota");
    if (object.mUploadQuota != null)  {
      mTypeAdapter7.write(writer, object.mUploadQuota);
    }
    else {
      writer.nullValue();
    }

    writer.name("preferences");
    if (object.mPreferences != null)  {
      mTypeAdapter8.write(writer, object.mPreferences);
    }
    else {
      writer.nullValue();
    }

    writer.name("live_quota");
    if (object.mLiveQuota != null)  {
      mTypeAdapter9.write(writer, object.mLiveQuota);
    }
    else {
      writer.nullValue();
    }

    writer.name("id");
    if (object.getId() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getId());
    }
    else {
      writer.nullValue();
    }

    writer.name("is_staff");
    if (object.getIsStaff() != null)  {
      com.google.gson.internal.bind.TypeAdapters.BOOLEAN.write(writer, object.getIsStaff());
    }
    else {
      writer.nullValue();
    }

    writer.name("is_creator");
    if (object.getIsVideoCreator() != null)  {
      com.google.gson.internal.bind.TypeAdapters.BOOLEAN.write(writer, object.getIsVideoCreator());
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

    writer.name("membership");
    if (object.getMembership() != null)  {
      mTypeAdapter10.write(writer, object.getMembership());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public User read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.User object = new com.vimeo.networking.model.User();
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
        case "location":
        	object.mLocation = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "bio":
        	object.mBio = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "created_time":
        	object.mCreatedTime = mTypeAdapter0.read(reader);
        	break;
        case "pictures":
        	object.mPictures = mTypeAdapter1.read(reader);
        	break;
        case "emails":
        	object.mEmails = mTypeAdapter3.read(reader);
        	break;
        case "websites":
        	object.mWebsites = mTypeAdapter5.read(reader);
        	break;
        case "metadata":
        	object.mMetadata = mTypeAdapter6.read(reader);
        	break;
        case "upload_quota":
        	object.mUploadQuota = mTypeAdapter7.read(reader);
        	break;
        case "preferences":
        	object.mPreferences = mTypeAdapter8.read(reader);
        	break;
        case "live_quota":
        	object.mLiveQuota = mTypeAdapter9.read(reader);
        	break;
        case "id":
        	object.setId(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "is_staff":
        	object.setIsStaff(com.google.gson.internal.bind.TypeAdapters.BOOLEAN.read(reader));
        	break;
        case "is_creator":
        	object.setIsVideoCreator(com.google.gson.internal.bind.TypeAdapters.BOOLEAN.read(reader));
        	break;
        case "resource_key":
        	object.setResourceKey(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "membership":
        	object.setMembership(mTypeAdapter10.read(reader));
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
