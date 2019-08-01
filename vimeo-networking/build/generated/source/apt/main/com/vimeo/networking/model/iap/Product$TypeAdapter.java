package com.vimeo.networking.model.iap;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vimeo.networking.model.Metadata;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Product$TypeAdapter extends TypeAdapter<Product> {
  public static final TypeToken<Product> TYPE_TOKEN = TypeToken.get(com.vimeo.networking.model.iap.Product.class);

  private final Gson mGson;

  private final TypeAdapter<Metadata> mTypeAdapter0;

  public Product$TypeAdapter(Gson gson) {
    this.mGson = gson;
    this.mTypeAdapter0 = gson.getAdapter(com.vimeo.networking.model.Metadata$TypeAdapter.TYPE_TOKEN);
  }

  @Override
  public void write(JsonWriter writer, Product object) throws IOException {
    if (object == null) {
      writer.nullValue();
      return;
    }
    writer.beginObject();

    writer.name("product_id");
    if (object.getProductId() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getProductId());
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

    writer.name("description");
    if (object.getDescription() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getDescription());
    }
    else {
      writer.nullValue();
    }

    writer.name("billing_period");
    if (object.getBillingPeriod() != null)  {
      com.google.gson.internal.bind.TypeAdapters.STRING.write(writer, object.getBillingPeriod());
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

    writer.name("metadata");
    if (object.getMetadata() != null)  {
      mTypeAdapter0.write(writer, object.getMetadata());
    }
    else {
      writer.nullValue();
    }

    writer.endObject();
  }

  @Override
  public Product read(JsonReader reader) throws IOException {
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
    com.vimeo.networking.model.iap.Product object = new com.vimeo.networking.model.iap.Product();
    while (reader.hasNext()) {
      String name = reader.nextName();
      switch (name) {
        case "product_id":
        	object.setProductId(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "name":
        	object.setName(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "description":
        	object.setDescription(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "billing_period":
        	object.setBillingPeriod(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "uri":
        	object.setUri(com.google.gson.internal.bind.TypeAdapters.STRING.read(reader));
        	break;
        case "metadata":
        	object.setMetadata(mTypeAdapter0.read(reader));
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
