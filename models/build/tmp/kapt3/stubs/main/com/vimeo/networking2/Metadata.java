package com.vimeo.networking2;

import java.lang.System;

/**
 * * Metadata with connections and interactions.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001d\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ2\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/vimeo/networking2/Metadata;", "Connections_T", "Interactions_T", "", "connections", "interactions", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getConnections", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getInteractions", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/vimeo/networking2/Metadata;", "equals", "", "other", "hashCode", "", "toString", "", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Metadata<Connections_T extends java.lang.Object, Interactions_T extends java.lang.Object> {
    
    /**
     * * All connections for an object.
     */
    @org.jetbrains.annotations.Nullable()
    private final Connections_T connections = null;
    
    /**
     * * All interactions for an object.
     */
    @org.jetbrains.annotations.Nullable()
    private final Interactions_T interactions = null;
    
    /**
     * * All connections for an object.
     */
    @org.jetbrains.annotations.Nullable()
    public final Connections_T getConnections() {
        return null;
    }
    
    /**
     * * All interactions for an object.
     */
    @org.jetbrains.annotations.Nullable()
    public final Interactions_T getInteractions() {
        return null;
    }
    
    public Metadata(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "connections")
    Connections_T connections, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "interactions")
    Interactions_T interactions) {
        super();
    }
    
    public Metadata() {
        super();
    }
    
    /**
     * * All connections for an object.
     */
    @org.jetbrains.annotations.Nullable()
    public final Connections_T component1() {
        return null;
    }
    
    /**
     * * All interactions for an object.
     */
    @org.jetbrains.annotations.Nullable()
    public final Interactions_T component2() {
        return null;
    }
    
    /**
     * * Metadata with connections and interactions.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Metadata<Connections_T, Interactions_T> copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "connections")
    Connections_T connections, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "interactions")
    Interactions_T interactions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}