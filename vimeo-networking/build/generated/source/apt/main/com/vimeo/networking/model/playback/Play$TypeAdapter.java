package com.vimeo.networking.model.playback;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.DashVideoFile;
import com.vimeo.networking.model.HlsVideoFile;
import com.vimeo.networking.model.ProgressiveVideoFile;
import com.vimeo.networking.model.playback.embed.Embed;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.ArrayList;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Play$TypeAdapter extends TypeAdapter<Play> {
  public static final TypeToken<Play> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.playback.Play.class);

  private final Gson mGson;

  private final TypeAdapter<Embed> mTypeAdapter0;

  private final TypeAdapter<HlsVideoFile> mTypeAdapter1;

  private final TypeAdapter<DashVideoFile> mTypeAdapter2;

  private final TypeAdapter<ProgressiveVideoFile> mTypeAdapter3;

  private final TypeAdapter<ArrayList<ProgressiveVideoFile>> mTypeAdapter4;

  private final TypeAdapter<PlayProgress> mTypeAdapter5;

  private final TypeAdapter<Play.Status> mTypeAdapter6;

  private final TypeAdapter<Drm> mTypeAdapter7;

  public Play$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.playback.embed.Embed$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter1 = gson.getAdapter(com.vimeo.networking.model.HlsVideoFile$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter2 = gson.getAdapter(com.vimeo.networking.model.DashVideoFile$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter3 = gson.getAdapter(com.vimeo.networking.model.ProgressiveVideoFile$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter4 = new com.vimeo.stag.KnownTypeAdapters.ListTypeAdapter<com.vimeo.networking.model.ProgressiveVideoFile,java.util.ArrayList<com.vimeo.networking.model.ProgressiveVideoFile>>(mTypeAdapter3, new com.vimeo.stag.KnownTypeAdapters.ArrayListInstantiator<com.vimeo.networking.model.ProgressiveVideoFile>());
    this.mTypeAdapter5 = gson.getAdapter(com.vimeo.networking.model.playback.PlayProgress$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter6 = gson.getAdapter(com.vimeo.networking.model.playback.Play$Status$TypeAdapter.TYPE_TOKEN);
    this.mTypeAdapter7 = gson.getAdapter(com.vimeo.networking.model.playback.Drm$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Play object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("embed");
    if (object.mEmbed != null)  {
      mTypeAdapter0.write(writer, object.mEmbed);
    }
    else {
      writer.nullValue();
    }

    writer.name("hls");
    if (object.mHls != null)  {
      mTypeAdapter1.write(writer, object.mHls);
    }
    else {
      writer.nullValue();
    }

    writer.name("dash");
    if (object.mDash != null)  {
      mTypeAdapter2.write(writer, object.mDash);
    }
    else {
      writer.nullValue();
    }

    writer.name("progressive");
    if (object.mProgressive != null)  {
      mTypeAdapter4.write(writer, object.mProgressive);
    }
    else {
      writer.nullValue();
    }

    writer.name("progress");
    if (object.mProgress != null)  {
      mTypeAdapter5.write(writer, object.mProgress);
    }
    else {
      writer.nullValue();
    }

    writer.name("status");
    if (object.mStatus != null)  {
      mTypeAdapter6.write(writer, object.mStatus);
    }
    else {
      writer.nullValue();
    }

    writer.name("drm");
    if (object.mDrm != null)  {
      mTypeAdapter7.write(writer, object.mDrm);
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Play read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.playback.Play object = new com.vimeo.networking.model.playback.Play();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "embed":
        case "m_embed":
        	object.mEmbed = mTypeAdapter0.read(reader);
        	break;
        case "hls":
        case "m_hls":
        	object.mHls = mTypeAdapter1.read(reader);
        	break;
        case "dash":
        case "m_dash":
        	object.mDash = mTypeAdapter2.read(reader);
        	break;
        case "progressive":
        case "m_progressive":
        	object.mProgressive = mTypeAdapter4.read(reader);
        	break;
        case "progress":
        case "m_progress":
        	object.mProgress = mTypeAdapter5.read(reader);
        	break;
        case "status":
        case "m_status":
        	object.mStatus = mTypeAdapter6.read(reader);
        	break;
        case "drm":
        case "m_drm":
        	object.mDrm = mTypeAdapter7.read(reader);
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
