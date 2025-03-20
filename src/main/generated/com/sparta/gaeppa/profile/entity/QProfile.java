package com.sparta.gaeppa.profile.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfile is a Querydsl query type for Profile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfile extends EntityPathBase<Profile> {

    private static final long serialVersionUID = 2011786869L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfile profile = new QProfile("profile");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final ListPath<com.sparta.gaeppa.store.entity.Favorite, com.sparta.gaeppa.store.entity.QFavorite> favorites = this.<com.sparta.gaeppa.store.entity.Favorite, com.sparta.gaeppa.store.entity.QFavorite>createList("favorites", com.sparta.gaeppa.store.entity.Favorite.class, com.sparta.gaeppa.store.entity.QFavorite.class, PathInits.DIRECT2);

    public final StringPath introduce = createString("introduce");

    public final com.sparta.gaeppa.members.entity.QMember member;

    public final EnumPath<com.sparta.gaeppa.members.entity.MemberGender> memberGender = createEnum("memberGender", com.sparta.gaeppa.members.entity.MemberGender.class);

    public final ComparablePath<java.util.UUID> profileId = createComparable("profileId", java.util.UUID.class);

    public final StringPath profileImgName = createString("profileImgName");

    public final StringPath profileImgPath = createString("profileImgPath");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QProfile(String variable) {
        this(Profile.class, forVariable(variable), INITS);
    }

    public QProfile(Path<? extends Profile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfile(PathMetadata metadata, PathInits inits) {
        this(Profile.class, metadata, inits);
    }

    public QProfile(Class<? extends Profile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.sparta.gaeppa.members.entity.QMember(forProperty("member")) : null;
    }

}

