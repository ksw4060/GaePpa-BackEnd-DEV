package com.sparta.gaeppa.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductOptionCategory is a Querydsl query type for ProductOptionCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductOptionCategory extends EntityPathBase<ProductOptionCategory> {

    private static final long serialVersionUID = -782939736L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductOptionCategory productOptionCategory = new QProductOptionCategory("productOptionCategory");

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

    public final NumberPath<Integer> maxLimits = createNumber("maxLimits", Integer.class);

    public final StringPath name = createString("name");

    public final QProduct product;

    public final ListPath<ProductOption, QProductOption> productOptions = this.<ProductOption, QProductOption>createList("productOptions", ProductOption.class, QProductOption.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QProductOptionCategory(String variable) {
        this(ProductOptionCategory.class, forVariable(variable), INITS);
    }

    public QProductOptionCategory(Path<? extends ProductOptionCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductOptionCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductOptionCategory(PathMetadata metadata, PathInits inits) {
        this(ProductOptionCategory.class, metadata, inits);
    }

    public QProductOptionCategory(Class<? extends ProductOptionCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

