package com.sparta.gaeppa.image.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductImage is a Querydsl query type for ProductImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductImage extends EntityPathBase<ProductImage> {

    private static final long serialVersionUID = -250811758L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductImage productImage = new QProductImage("productImage");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final StringPath fileName = createString("fileName");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final EnumPath<com.sparta.gaeppa.image.mime.MimeType> mimeType = createEnum("mimeType", com.sparta.gaeppa.image.mime.MimeType.class);

    public final StringPath originalName = createString("originalName");

    public final com.sparta.gaeppa.product.entity.QProduct product;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QProductImage(String variable) {
        this(ProductImage.class, forVariable(variable), INITS);
    }

    public QProductImage(Path<? extends ProductImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductImage(PathMetadata metadata, PathInits inits) {
        this(ProductImage.class, metadata, inits);
    }

    public QProductImage(Class<? extends ProductImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.sparta.gaeppa.product.entity.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

