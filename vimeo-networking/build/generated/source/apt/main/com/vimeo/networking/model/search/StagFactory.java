package com.vimeo.networking.model.search;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.Override;
import java.lang.SuppressWarnings;

public final class StagFactory implements TypeAdapterFactory {
  @SuppressWarnings({
      "unchecked",
      "rawtypes"
  })
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    Class<? super T> clazz = type.getRawType();
    if (clazz == com.vimeo.networking.model.search.SearchFacet.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.SearchFacet$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.SearchType.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.SearchType$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.VideoSuggestion.VideoSuggestionMetadata.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.VideoSuggestion$VideoSuggestionMetadata$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.SearchResult.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.SearchResult$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.TvodSuggestion.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.TvodSuggestion$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.VideoSuggestion.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.VideoSuggestion$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.FacetOption.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.FacetOption$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.TvodSuggestion.TvodSuggestionMetadata.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.TvodSuggestion$TvodSuggestionMetadata$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.SuggestionResponse.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.SuggestionResponse$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.SearchResponse.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.SearchResponse$TypeAdapter(gson);
    }
    if (clazz == com.vimeo.networking.model.search.SearchFacetCollection.class) {
      return (TypeAdapter<T>) new com.vimeo.networking.model.search.SearchFacetCollection$TypeAdapter(gson);
    }
    return null;
  }
}
