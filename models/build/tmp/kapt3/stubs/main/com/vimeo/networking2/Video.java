package com.vimeo.networking2;

import java.lang.System;

/**
 * * Video data.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00bb\u0003\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0003\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0005\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0003\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u00108\u001a\u0004\u0018\u000109\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010;J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u0018\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aH\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010!H\u00c6\u0003J\u0012\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010%H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010+H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010-H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010/H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0005H\u00c6\u0003J\u0012\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u000104H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u000106H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u000109H\u00c6\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\u00c6\u0003\u0010\u009c\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0003\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00052\n\b\u0003\u00103\u001a\u0004\u0018\u0001042\n\b\u0003\u00105\u001a\u0004\u0018\u0001062\n\b\u0003\u00107\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00108\u001a\u0004\u0018\u0001092\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0003\u0010\u009d\u0001J\u0017\u0010\u009e\u0001\u001a\u00030\u009f\u00012\n\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u00a1\u0001H\u00d6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u000fH\u00d6\u0001J\n\u0010\u00a3\u0001\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001e\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010I\u001a\u0004\bP\u0010HR\u0016\u0010Q\u001a\u0004\u0018\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010FR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010FR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010FR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010FR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010DR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010FR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b]\u0010M\u001a\u0004\b^\u0010FR\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001e\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\ba\u0010M\u001a\u0004\bb\u0010cR\u0013\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0013\u0010&\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0013\u0010\'\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010FR\u001e\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bh\u0010M\u001a\u0004\bi\u0010jR\u0013\u0010,\u001a\u0004\u0018\u00010-\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0013\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u001e\u00100\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bo\u0010M\u001a\u0004\bp\u0010FR\u0019\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010?R\u0013\u00103\u001a\u0004\u0018\u000104\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u00105\u001a\u0004\u0018\u000106\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u00107\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010FR\u0013\u00108\u001a\u0004\u0018\u000109\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0015\u0010:\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010I\u001a\u0004\by\u0010H\u00a8\u0006\u00a4\u0001"}, d2 = {"Lcom/vimeo/networking2/Video;", "Lcom/vimeo/networking2/common/Entity;", "badge", "Lcom/vimeo/networking2/VideoBadge;", "categories", "", "Lcom/vimeo/networking2/Category;", "contentRating", "", "context", "Lcom/vimeo/networking2/VideoContext;", "createdTime", "Ljava/util/Date;", "description", "duration", "", "embed", "Lcom/vimeo/networking2/VideoEmbed;", "height", "language", "lastUserActionEventDate", "license", "link", "live", "Lcom/vimeo/networking2/Live;", "metadata", "Lcom/vimeo/networking2/Metadata;", "Lcom/vimeo/networking2/VideoConnections;", "Lcom/vimeo/networking2/VideoInteractions;", "modifiedTime", "name", "password", "pictures", "Lcom/vimeo/networking2/PictureCollection;", "play", "Lcom/vimeo/networking2/Play;", "privacy", "Lcom/vimeo/networking2/Privacy;", "releaseTime", "resourceKey", "reviewPage", "Lcom/vimeo/networking2/ReviewPage;", "fileTransferPage", "Lcom/vimeo/networking2/FileTransferPage;", "spatial", "Lcom/vimeo/networking2/Spatial;", "stats", "Lcom/vimeo/networking2/VideoStats;", "status", "tags", "Lcom/vimeo/networking2/Tag;", "transcode", "Lcom/vimeo/networking2/Transcode;", "upload", "Lcom/vimeo/networking2/Upload;", "uri", "user", "Lcom/vimeo/networking2/User;", "width", "(Lcom/vimeo/networking2/VideoBadge;Ljava/util/List;Ljava/util/List;Lcom/vimeo/networking2/VideoContext;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Lcom/vimeo/networking2/VideoEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/Live;Lcom/vimeo/networking2/Metadata;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Lcom/vimeo/networking2/Play;Lcom/vimeo/networking2/Privacy;Ljava/util/Date;Ljava/lang/String;Lcom/vimeo/networking2/ReviewPage;Lcom/vimeo/networking2/FileTransferPage;Lcom/vimeo/networking2/Spatial;Lcom/vimeo/networking2/VideoStats;Ljava/lang/String;Ljava/util/List;Lcom/vimeo/networking2/Transcode;Lcom/vimeo/networking2/Upload;Ljava/lang/String;Lcom/vimeo/networking2/User;Ljava/lang/Integer;)V", "getBadge", "()Lcom/vimeo/networking2/VideoBadge;", "getCategories", "()Ljava/util/List;", "getContentRating", "getContext", "()Lcom/vimeo/networking2/VideoContext;", "getCreatedTime", "()Ljava/util/Date;", "getDescription", "()Ljava/lang/String;", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEmbed", "()Lcom/vimeo/networking2/VideoEmbed;", "fileTransferPage$annotations", "()V", "getFileTransferPage", "()Lcom/vimeo/networking2/FileTransferPage;", "getHeight", "identifier", "getIdentifier", "getLanguage", "getLastUserActionEventDate", "getLicense", "getLink", "getLive", "()Lcom/vimeo/networking2/Live;", "getMetadata", "()Lcom/vimeo/networking2/Metadata;", "getModifiedTime", "getName", "password$annotations", "getPassword", "getPictures", "()Lcom/vimeo/networking2/PictureCollection;", "play$annotations", "getPlay", "()Lcom/vimeo/networking2/Play;", "getPrivacy", "()Lcom/vimeo/networking2/Privacy;", "getReleaseTime", "getResourceKey", "reviewPage$annotations", "getReviewPage", "()Lcom/vimeo/networking2/ReviewPage;", "getSpatial", "()Lcom/vimeo/networking2/Spatial;", "getStats", "()Lcom/vimeo/networking2/VideoStats;", "status$annotations", "getStatus", "getTags", "getTranscode", "()Lcom/vimeo/networking2/Transcode;", "getUpload", "()Lcom/vimeo/networking2/Upload;", "getUri", "getUser", "()Lcom/vimeo/networking2/User;", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vimeo/networking2/VideoBadge;Ljava/util/List;Ljava/util/List;Lcom/vimeo/networking2/VideoContext;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Lcom/vimeo/networking2/VideoEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/Live;Lcom/vimeo/networking2/Metadata;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/vimeo/networking2/PictureCollection;Lcom/vimeo/networking2/Play;Lcom/vimeo/networking2/Privacy;Ljava/util/Date;Ljava/lang/String;Lcom/vimeo/networking2/ReviewPage;Lcom/vimeo/networking2/FileTransferPage;Lcom/vimeo/networking2/Spatial;Lcom/vimeo/networking2/VideoStats;Ljava/lang/String;Ljava/util/List;Lcom/vimeo/networking2/Transcode;Lcom/vimeo/networking2/Upload;Ljava/lang/String;Lcom/vimeo/networking2/User;Ljava/lang/Integer;)Lcom/vimeo/networking2/Video;", "equals", "", "other", "", "hashCode", "toString", "models"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Video implements com.vimeo.networking2.common.Entity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String identifier = null;
    
    /**
     * * Information for the video's badge.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoBadge badge = null;
    
    /**
     * * The categories to which this video belongs.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Category> categories = null;
    
    /**
     * * The content ratings of this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> contentRating = null;
    
    /**
     * * The context of the video's subscription, if this video is part of a subscription.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoContext context = null;
    
    /**
     * * The time in ISO 8601 format when the video was created.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date createdTime = null;
    
    /**
     * * A brief explanation of the video's content.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * * The video's duration in seconds.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer duration = null;
    
    /**
     * * Information about embedding this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoEmbed embed = null;
    
    /**
     * * The video's height in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer height = null;
    
    /**
     * * The video's primary language.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String language = null;
    
    /**
     * * The time in ISO 8601 format when the user last modified the video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date lastUserActionEventDate = null;
    
    /**
     * * The Creative Commons license used for the video.
     *     * @see Video.licenseType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String license = null;
    
    /**
     * * The link to the video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String link = null;
    
    /**
     * * Live playback information.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Live live = null;
    
    /**
     * * The video's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Metadata<com.vimeo.networking2.VideoConnections, com.vimeo.networking2.VideoInteractions> metadata = null;
    
    /**
     * * The time in ISO 8601 format when the video metadata was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date modifiedTime = null;
    
    /**
     * * The video's title.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * * The privacy-enabled password to watch this video.
     *     * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String password = null;
    
    /**
     * * The active picture for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.PictureCollection pictures = null;
    
    /**
     * * The Play representation.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Play play = null;
    
    /**
     * * The video's privacy setting.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Privacy privacy = null;
    
    /**
     * * The time in ISO 8601 format when the video was released.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date releaseTime = null;
    
    /**
     * * The resource key string of the video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resourceKey = null;
    
    /**
     * * Information about the review page associated with this video. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.ReviewPage reviewPage = null;
    
    /**
     * * Information about the file transfer page associated with this video. This data
     *     * requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.FileTransferPage fileTransferPage = null;
    
    /**
     * * 360 spatial data.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Spatial spatial = null;
    
    /**
     * * A collection of stats associated with this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.VideoStats stats = null;
    
    /**
     * * The status code for the availability of the video. This field is deprecated in favor
     *     * of [upload] and [transcode].
     *     * @see Video.statusType
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    
    /**
     * * An array of all tags assigned to this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.vimeo.networking2.Tag> tags = null;
    
    /**
     * * The transcode information for a video upload.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Transcode transcode = null;
    
    /**
     * * The upload information for this video.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.Upload upload = null;
    
    /**
     * * The video's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uri = null;
    
    /**
     * * The video owner.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.vimeo.networking2.User user = null;
    
    /**
     * * The video's width in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer width = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * * Information for the video's badge.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoBadge getBadge() {
        return null;
    }
    
    /**
     * * The categories to which this video belongs.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Category> getCategories() {
        return null;
    }
    
    /**
     * * The content ratings of this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getContentRating() {
        return null;
    }
    
    /**
     * * The context of the video's subscription, if this video is part of a subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoContext getContext() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedTime() {
        return null;
    }
    
    /**
     * * A brief explanation of the video's content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * * The video's duration in seconds.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    /**
     * * Information about embedding this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoEmbed getEmbed() {
        return null;
    }
    
    /**
     * * The video's height in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHeight() {
        return null;
    }
    
    /**
     * * The video's primary language.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the user last modified the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getLastUserActionEventDate() {
        return null;
    }
    
    /**
     * * The Creative Commons license used for the video.
     *     * @see Video.licenseType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLicense() {
        return null;
    }
    
    /**
     * * The link to the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLink() {
        return null;
    }
    
    /**
     * * Live playback information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Live getLive() {
        return null;
    }
    
    /**
     * * The video's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.VideoConnections, com.vimeo.networking2.VideoInteractions> getMetadata() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video metadata was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getModifiedTime() {
        return null;
    }
    
    /**
     * * The video's title.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void password$annotations() {
    }
    
    /**
     * * The privacy-enabled password to watch this video.
     *     * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    /**
     * * The active picture for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection getPictures() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void play$annotations() {
    }
    
    /**
     * * The Play representation.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Play getPlay() {
        return null;
    }
    
    /**
     * * The video's privacy setting.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Privacy getPrivacy() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video was released.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getReleaseTime() {
        return null;
    }
    
    /**
     * * The resource key string of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResourceKey() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void reviewPage$annotations() {
    }
    
    /**
     * * Information about the review page associated with this video. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ReviewPage getReviewPage() {
        return null;
    }
    
    @com.vimeo.networking2.annotations.Internal()
    public static void fileTransferPage$annotations() {
    }
    
    /**
     * * Information about the file transfer page associated with this video. This data
     *     * requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FileTransferPage getFileTransferPage() {
        return null;
    }
    
    /**
     * * 360 spatial data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Spatial getSpatial() {
        return null;
    }
    
    /**
     * * A collection of stats associated with this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoStats getStats() {
        return null;
    }
    
    public static void status$annotations() {
    }
    
    /**
     * * The status code for the availability of the video. This field is deprecated in favor
     *     * of [upload] and [transcode].
     *     * @see Video.statusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    /**
     * * An array of all tags assigned to this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Tag> getTags() {
        return null;
    }
    
    /**
     * * The transcode information for a video upload.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Transcode getTranscode() {
        return null;
    }
    
    /**
     * * The upload information for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Upload getUpload() {
        return null;
    }
    
    /**
     * * The video's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUri() {
        return null;
    }
    
    /**
     * * The video owner.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User getUser() {
        return null;
    }
    
    /**
     * * The video's width in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWidth() {
        return null;
    }
    
    public Video(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "badge")
    com.vimeo.networking2.VideoBadge badge, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<com.vimeo.networking2.Category> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content_rating")
    java.util.List<java.lang.String> contentRating, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "context")
    com.vimeo.networking2.VideoContext context, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "duration")
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "embed")
    com.vimeo.networking2.VideoEmbed embed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "height")
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "last_user_action_event_date")
    java.util.Date lastUserActionEventDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "license")
    java.lang.String license, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live")
    com.vimeo.networking2.Live live, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.VideoConnections, com.vimeo.networking2.VideoInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.util.Date modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "password")
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "play")
    com.vimeo.networking2.Play play, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy")
    com.vimeo.networking2.Privacy privacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_time")
    java.util.Date releaseTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "review_page")
    com.vimeo.networking2.ReviewPage reviewPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "file_transfer")
    com.vimeo.networking2.FileTransferPage fileTransferPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "spatial")
    com.vimeo.networking2.Spatial spatial, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "stats")
    com.vimeo.networking2.VideoStats stats, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tags")
    java.util.List<com.vimeo.networking2.Tag> tags, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "transcode")
    com.vimeo.networking2.Transcode transcode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload")
    com.vimeo.networking2.Upload upload, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "width")
    java.lang.Integer width) {
        super();
    }
    
    public Video() {
        super();
    }
    
    /**
     * * Information for the video's badge.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoBadge component1() {
        return null;
    }
    
    /**
     * * The categories to which this video belongs.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Category> component2() {
        return null;
    }
    
    /**
     * * The content ratings of this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    /**
     * * The context of the video's subscription, if this video is part of a subscription.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoContext component4() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video was created.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component5() {
        return null;
    }
    
    /**
     * * A brief explanation of the video's content.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * * The video's duration in seconds.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    /**
     * * Information about embedding this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoEmbed component8() {
        return null;
    }
    
    /**
     * * The video's height in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    /**
     * * The video's primary language.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the user last modified the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component11() {
        return null;
    }
    
    /**
     * * The Creative Commons license used for the video.
     *     * @see Video.licenseType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    /**
     * * The link to the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    /**
     * * Live playback information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Live component14() {
        return null;
    }
    
    /**
     * * The video's metadata.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Metadata<com.vimeo.networking2.VideoConnections, com.vimeo.networking2.VideoInteractions> component15() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video metadata was last modified.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component16() {
        return null;
    }
    
    /**
     * * The video's title.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    /**
     * * The privacy-enabled password to watch this video.
     *     * This data requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    /**
     * * The active picture for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.PictureCollection component19() {
        return null;
    }
    
    /**
     * * The Play representation.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Play component20() {
        return null;
    }
    
    /**
     * * The video's privacy setting.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Privacy component21() {
        return null;
    }
    
    /**
     * * The time in ISO 8601 format when the video was released.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component22() {
        return null;
    }
    
    /**
     * * The resource key string of the video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    /**
     * * Information about the review page associated with this video. This data requires a
     *     * bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.ReviewPage component24() {
        return null;
    }
    
    /**
     * * Information about the file transfer page associated with this video. This data
     *     * requires a bearer token with the private scope.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.FileTransferPage component25() {
        return null;
    }
    
    /**
     * * 360 spatial data.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Spatial component26() {
        return null;
    }
    
    /**
     * * A collection of stats associated with this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.VideoStats component27() {
        return null;
    }
    
    /**
     * * The status code for the availability of the video. This field is deprecated in favor
     *     * of [upload] and [transcode].
     *     * @see Video.statusType
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    /**
     * * An array of all tags assigned to this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vimeo.networking2.Tag> component29() {
        return null;
    }
    
    /**
     * * The transcode information for a video upload.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Transcode component30() {
        return null;
    }
    
    /**
     * * The upload information for this video.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.Upload component31() {
        return null;
    }
    
    /**
     * * The video's canonical relative URI.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    /**
     * * The video owner.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.vimeo.networking2.User component33() {
        return null;
    }
    
    /**
     * * The video's width in pixels.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component34() {
        return null;
    }
    
    /**
     * * Video data.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.vimeo.networking2.Video copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "badge")
    com.vimeo.networking2.VideoBadge badge, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<com.vimeo.networking2.Category> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "content_rating")
    java.util.List<java.lang.String> contentRating, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "context")
    com.vimeo.networking2.VideoContext context, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "created_time")
    java.util.Date createdTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "duration")
    java.lang.Integer duration, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "embed")
    com.vimeo.networking2.VideoEmbed embed, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "height")
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "last_user_action_event_date")
    java.util.Date lastUserActionEventDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "license")
    java.lang.String license, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "link")
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "live")
    com.vimeo.networking2.Live live, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "metadata")
    com.vimeo.networking2.Metadata<com.vimeo.networking2.VideoConnections, com.vimeo.networking2.VideoInteractions> metadata, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "modified_time")
    java.util.Date modifiedTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "password")
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pictures")
    com.vimeo.networking2.PictureCollection pictures, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "play")
    com.vimeo.networking2.Play play, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "privacy")
    com.vimeo.networking2.Privacy privacy, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "release_time")
    java.util.Date releaseTime, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "resource_key")
    java.lang.String resourceKey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "review_page")
    com.vimeo.networking2.ReviewPage reviewPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "file_transfer")
    com.vimeo.networking2.FileTransferPage fileTransferPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "spatial")
    com.vimeo.networking2.Spatial spatial, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "stats")
    com.vimeo.networking2.VideoStats stats, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "tags")
    java.util.List<com.vimeo.networking2.Tag> tags, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "transcode")
    com.vimeo.networking2.Transcode transcode, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "upload")
    com.vimeo.networking2.Upload upload, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "uri")
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "user")
    com.vimeo.networking2.User user, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "width")
    java.lang.Integer width) {
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