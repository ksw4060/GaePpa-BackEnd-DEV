package com.sparta.gaeppa.ai.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAIPrompt is a Querydsl query type for AIPrompt
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAIPrompt extends EntityPathBase<AIPrompt> {

    private static final long serialVersionUID = -899398237L;

    public static final QAIPrompt aIPrompt = new QAIPrompt("aIPrompt");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath prompt = createString("prompt");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QAIPrompt(String variable) {
        super(AIPrompt.class, forVariable(variable));
    }

    public QAIPrompt(Path<? extends AIPrompt> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAIPrompt(PathMetadata metadata) {
        super(AIPrompt.class, metadata);
    }

}

