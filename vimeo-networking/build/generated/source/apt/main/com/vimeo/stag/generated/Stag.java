package com.vimeo.stag.generated;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public final class Stag {
  public static class Factory implements TypeAdapterFactory {
    private final HashMap<String, Integer> packageToIndexMap = new java.util.HashMap<java.lang.String, java.lang.Integer>( 14);

    private final TypeAdapterFactory[] typeAdapterFactoryArray = new TypeAdapterFactory[14];

    private static <T> String getPackageName(Class<T> clazz) {
      String name = clazz.getName();
      int last = name.lastIndexOf('.');
      return last == -1 ? null : name.substring(0, last);
    }

    private static TypeAdapterFactory createTypeAdapterFactory(int index) {
      TypeAdapterFactory result = null;
      switch(index) {
        case 0 : 	
            result = new com.vimeo.networking.model.playback.StagFactory();
        	break;
        case 1 : 	
            result = new com.vimeo.networking.model.search.StagFactory();
        	break;
        case 2 : 	
            result = new com.vimeo.networking.model.live.StagFactory();
        	break;
        case 3 : 	
            result = new com.vimeo.networking.model.notifications.StagFactory();
        	break;
        case 4 : 	
            result = new com.vimeo.networking.model.tvod.StagFactory();
        	break;
        case 5 : 	
            result = new com.vimeo.networking.model.appconfiguration.StagFactory();
        	break;
        case 6 : 	
            result = new com.vimeo.networking.upload.StagFactory();
        	break;
        case 7 : 	
            result = new com.vimeo.networking.model.appconfiguration.live.StagFactory();
        	break;
        case 8 : 	
            result = new com.vimeo.networking.model.StagFactory();
        	break;
        case 9 : 	
            result = new com.vimeo.networking.model.error.StagFactory();
        	break;
        case 10 : 	
            result = new com.vimeo.networking.model.iap.StagFactory();
        	break;
        case 11 : 	
            result = new com.vimeo.networking.model.cinema.StagFactory();
        	break;
        case 12 : 	
            result = new com.vimeo.networking.model.uploadquota.StagFactory();
        	break;
        case 13 : 	
            result = new com.vimeo.networking.model.playback.embed.StagFactory();
        	break;
      }
      return result;
    }

    private TypeAdapterFactory getTypeAdapterFactory(int index) {
      TypeAdapterFactory typeAdapterFactory = typeAdapterFactoryArray[index];
      if(null == typeAdapterFactory) {
         typeAdapterFactory = createTypeAdapterFactory(index);
         typeAdapterFactoryArray[index] = typeAdapterFactory;
      }
      return typeAdapterFactory;
    }

    private TypeAdapterFactory getTypeAdapterFactory(Class<?> clazz, String currentPackageName,
        int index) {
      String packageName = getPackageName(clazz);
      packageToIndexMap.put(packageName, index);
      if(currentPackageName.equals(packageName)) {
         return getTypeAdapterFactory(index);
      }
      return null;
    }

    @SuppressWarnings("fallthrough")
    private synchronized TypeAdapterFactory getSubFactory(String currentPackageName) {
      Integer index = packageToIndexMap.get(currentPackageName);;
      if(null != index) {
        TypeAdapterFactory typeAdapterFactory = getTypeAdapterFactory(index);
        return typeAdapterFactory;
      }
      TypeAdapterFactory result = null;
      switch(packageToIndexMap.size()) {
        case 0 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.playback.Drm.class, currentPackageName, 0);
        	if(null != result) {
        		return result;
        	}
        case 1 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.search.SearchFacet.class, currentPackageName, 1);
        	if(null != result) {
        		return result;
        	}
        case 2 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.live.Live.class, currentPackageName, 2);
        	if(null != result) {
        		return result;
        	}
        case 3 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.notifications.Subscriptions.class, currentPackageName, 3);
        	if(null != result) {
        		return result;
        	}
        case 4 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.tvod.TvodList.class, currentPackageName, 4);
        	if(null != result) {
        		return result;
        	}
        case 5 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.appconfiguration.FeaturesConfiguration.class, currentPackageName, 5);
        	if(null != result) {
        		return result;
        	}
        case 6 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.upload.Upload.class, currentPackageName, 6);
        	if(null != result) {
        		return result;
        	}
        case 7 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.appconfiguration.live.LiveChatConfiguration.class, currentPackageName, 7);
        	if(null != result) {
        		return result;
        	}
        case 8 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.TrialEligibility.class, currentPackageName, 8);
        	if(null != result) {
        		return result;
        	}
        case 9 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.error.VimeoError.class, currentPackageName, 9);
        	if(null != result) {
        		return result;
        	}
        case 10 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.iap.Product.class, currentPackageName, 10);
        	if(null != result) {
        		return result;
        	}
        case 11 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.cinema.ProgramContentItemList.class, currentPackageName, 11);
        	if(null != result) {
        		return result;
        	}
        case 12 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.uploadquota.Space.class, currentPackageName, 12);
        	if(null != result) {
        		return result;
        	}
        case 13 : 
        	result = getTypeAdapterFactory(com.vimeo.networking.model.playback.embed.EmbedTitle.class, currentPackageName, 13);
        	if(null != result) {
        		return result;
        	}
        default : 	
            return null;
      }
    }

    @Override
    @SuppressWarnings({
        "unchecked",
        "rawtypes"
    })
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      Class<? super T> clazz = type.getRawType();
      String currentPackageName = getPackageName(clazz);
      if(null == currentPackageName) {
        return null;
      }

      TypeAdapterFactory typeAdapterFactory = getSubFactory(currentPackageName);
      return null != typeAdapterFactory ? typeAdapterFactory.create(gson, type) : null;
    }
  }
}
