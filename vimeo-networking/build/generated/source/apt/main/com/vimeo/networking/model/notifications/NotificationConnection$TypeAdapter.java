package com.vimeo.networking.model.notifications;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NotificationConnection$TypeAdapter extends TypeAdapter<NotificationConnection> {
  public static final TypeToken<NotificationConnection> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.notifications.NotificationConnection.class);

  private final Gson mGson;

  private final TypeAdapter<ArrayList<String>> mTypeAdapter0;

  private final TypeAdapter<NotificationConnection.NotificationTypeCount> mTypeAdapter1;

  public NotificationConnection$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<java.lang.String,java.util.ArrayList<java.lang.String>>(com.google.gson.internal.bind.TypeAdapters.STRING, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<java.lang.String>());
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.notifications.NotificationConnection$NotificationTypeCount$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, NotificationConnection object) throws IOException {
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

    writer.name("options");
    if (object.mOptions != null)  {
      mTypeAdapter0.write(writer, object.mOptions);
    }
    else {
      writer.nullValue();
    }

    writer.name("total");
    writer.value(object.mTotal);

    writer.name("main_total");
    writer.value(object.mMainTotal);

    writer.name("extra_total");
    writer.value(object.mExtraTotal);

    writer.name("viewable_total");
    writer.value(object.mViewableTotal);

    writer.name("name");
    if (object.mName != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.mName);
    }
    else {
      writer.nullValue();
    }

    writer.name("new_total");
    writer.value(object.mNewTotal);

    writer.name("unread_total");
    writer.value(object.mUnreadTotal);

    writer.name("type_count");
    if (object.mTypeCount != null)  {
      mTypeAdapter1.write(writer, object.mTypeCount);
    }
    else {
      writer.nullValue();
    }

    writer.name("type_unseen_count");
    if (object.mTypeUnseenCount != null)  {
      mTypeAdapter1.write(writer, object.mTypeUnseenCount);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public NotificationConnection read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.notifications.NotificationConnection object = new com.vimeo.networking.model.notifications.NotificationConnection();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "uri":
        	object.mUri = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "options":
        	object.mOptions = mTypeAdapter0.read(reader);
        	break;
        case "total":
        	object.mTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mTotal);
        	break;
        case "main_total":
        	object.mMainTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mMainTotal);
        	break;
        case "extra_total":
        	object.mExtraTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mExtraTotal);
        	break;
        case "viewable_total":
        	object.mViewableTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mViewableTotal);
        	break;
        case "name":
        	object.mName = com.google.gson.internal.bind.TypeAdapters.STRING.read(reader);
        	break;
        case "new_total":
        	object.mNewTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mNewTotal);
        	break;
        case "unread_total":
        	object.mUnreadTotal = com.vimeo.stag.KnownTypeAdapters.PrimitiveIntTypeAdapter.read(reader, object.mUnreadTotal);
        	break;
        case "type_count":
        	object.mTypeCount = mTypeAdapter1.read(reader);
        	break;
        case "type_unseen_count":
        	object.mTypeUnseenCount = mTypeAdapter1.read(reader);
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
