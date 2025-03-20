package com.sparta.gaeppa.store.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = -318510859L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStore store = new QStore("store");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    public final StringPath businessTime = createString("businessTime");

    public final QStoreCategory category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final ListPath<Favorite, QFavorite> favoritedBy = this.<Favorite, QFavorite>createList("favoritedBy", Favorite.class, QFavorite.class, PathInits.DIRECT2);

    public final BooleanPath isVisible = createBoolean("isVisible");

    public final com.sparta.gaeppa.members.entity.QMember member;

    public final NumberPath<java.math.BigDecimal> reviewAvg = createNumber("reviewAvg", java.math.BigDecimal.class);

    public final NumberPath<Integer> reviewCount = createNumber("reviewCount", Integer.class);

    public final StringPath storeAddress = createString("storeAddress");

    public final ComparablePath<java.util.UUID> storeId = createComparable("storeId", java.util.UUID.class);

    public final StringPath storeIntroduce = createString("storeIntroduce");

    public final StringPath storeName = createString("storeName");

    public final StringPath storeTelephone = createString("storeTelephone");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QStore(String variable) {
        this(Store.class, forVariable(variable), INITS);
    }

    public QStore(Path<? extends Store> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStore(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStore(PathMetadata metadata, PathInits inits) {
        this(Store.class, metadata, inits);
    }

    public QStore(Class<? extends Store> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QStoreCategory(forProperty("category")) : null;
        this.member = inits.isInitialized("member") ? new com.sparta.gaeppa.members.entity.QMember(forProperty("member")) : null;
    }

}

