package com.vimeo.networking2.common;

import java.lang.System;

/**
 * * Represents a data model that can be followed by the user. Provides access to a [Metadata]
 * * property that contains [FollowableInteractions].
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vimeo/networking2/common/Followable;", "", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/common/FollowableInteractions;", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "models"})
public abstract interface Followable {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.vimeo.networking2.Metadata<?, ? extends com.vimeo.networking2.common.FollowableInteractions> getMetadata();
}