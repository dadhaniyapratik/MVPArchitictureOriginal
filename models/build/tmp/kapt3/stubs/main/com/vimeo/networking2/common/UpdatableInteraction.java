package com.vimeo.networking2.common;

import java.lang.System;

/**
 * * Interactions that update the state of a video, category, channel, etc..
 * * These interactions are like, follow and watcher later.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/vimeo/networking2/common/UpdatableInteraction;", "Lcom/vimeo/networking2/common/Interaction;", "added", "", "getAdded", "()Ljava/lang/Boolean;", "addedTime", "Ljava/util/Date;", "getAddedTime", "()Ljava/util/Date;", "models"})
public abstract interface UpdatableInteraction extends com.vimeo.networking2.common.Interaction {
    
    /**
     * * Whether the authenticated user performed the interaction.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean getAdded();
    
    /**
     * * The time when the user took the interaction on the entity.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date getAddedTime();
}