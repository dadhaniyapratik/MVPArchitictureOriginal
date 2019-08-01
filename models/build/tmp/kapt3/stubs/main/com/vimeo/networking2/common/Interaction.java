package com.vimeo.networking2.common;

import java.lang.System;

/**
 * * Information on how to take action on an entity. Take an action on the
 * * entity by using the [uri] with a HTTP verb in the [options] list.
 * * The [options] list contains all the possible type of HTTP requests that are
 * * supported for the interaction.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/vimeo/networking2/common/Interaction;", "", "options", "", "", "getOptions", "()Ljava/util/List;", "uri", "getUri", "()Ljava/lang/String;", "models"})
public abstract interface Interaction {
    
    /**
     * * An array of the HTTP methods permitted on this URI.
     *     * @see Interaction.optionsTypes
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<java.lang.String> getOptions();
    
    /**
     * * The API URI that resolves to the connection data.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUri();
}