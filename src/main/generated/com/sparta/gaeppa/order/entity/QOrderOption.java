package com.sparta.gaeppa.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderOption is a Querydsl query type for OrderOption
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderOption extends EntityPathBase<OrderOption> {

    private static final long serialVersionUID = 1400001258L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderOption orderOption = new QOrderOption("orderOption");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final ComparablePath<java.util.UUID> optionId = createComparable("optionId", java.util.UUID.class);

    public final StringPath optionName = createString("optionName");

    public final NumberPath<Integer> optionPrice = createNumber("optionPrice", Integer.class);

    public final QOrderProduct orderProduct;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QOrderOption(String variable) {
        this(OrderOption.class, forVariable(variable), INITS);
    }

    public QOrderOption(Path<? extends OrderOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderOption(PathMetadata metadata, PathInits inits) {
        this(OrderOption.class, metadata, inits);
    }

    public QOrderOption(Class<? extends OrderOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderProduct = inits.isInitialized("orderProduct") ? new QOrderProduct(forProperty("orderProduct"), inits.get("orderProduct")) : null;
    }

}

