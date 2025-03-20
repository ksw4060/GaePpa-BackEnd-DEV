package com.sparta.gaeppa.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductOption is a Querydsl query type for ProductOption
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductOption extends EntityPathBase<ProductOption> {

    private static final long serialVersionUID = 1476809354L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductOption productOption = new QProductOption("productOption");

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

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final QProductOptionCategory productOptionCategory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QProductOption(String variable) {
        this(ProductOption.class, forVariable(variable), INITS);
    }

    public QProductOption(Path<? extends ProductOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductOption(PathMetadata metadata, PathInits inits) {
        this(ProductOption.class, metadata, inits);
    }

    public QProductOption(Class<? extends ProductOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productOptionCategory = inits.isInitialized("productOptionCategory") ? new QProductOptionCategory(forProperty("productOptionCategory"), inits.get("productOptionCategory")) : null;
    }

}

