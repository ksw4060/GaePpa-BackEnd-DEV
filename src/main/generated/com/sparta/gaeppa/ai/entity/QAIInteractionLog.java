package com.sparta.gaeppa.ai.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAIInteractionLog is a Querydsl query type for AIInteractionLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAIInteractionLog extends EntityPathBase<AIInteractionLog> {

    private static final long serialVersionUID = 1568278801L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAIInteractionLog aIInteractionLog = new QAIInteractionLog("aIInteractionLog");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    public final StringPath aiModelName = createString("aiModelName");

    public final QAIPrompt aiPrompt;

    public final StringPath aiResponse = createString("aiResponse");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public final StringPath userPrompt = createString("userPrompt");

    public QAIInteractionLog(String variable) {
        this(AIInteractionLog.class, forVariable(variable), INITS);
    }

    public QAIInteractionLog(Path<? extends AIInteractionLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAIInteractionLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAIInteractionLog(PathMetadata metadata, PathInits inits) {
        this(AIInteractionLog.class, metadata, inits);
    }

    public QAIInteractionLog(Class<? extends AIInteractionLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.aiPrompt = inits.isInitialized("aiPrompt") ? new QAIPrompt(forProperty("aiPrompt")) : null;
    }

}

