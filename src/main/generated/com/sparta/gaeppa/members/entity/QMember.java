package com.sparta.gaeppa.members.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -2122950722L;

    public static final QMember member = new QMember("member1");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final StringPath email = createString("email");

    public final StringPath emailToken = createString("emailToken");

    public final BooleanPath isAccountNonLocked = createBoolean("isAccountNonLocked");

    public final BooleanPath isActivated = createBoolean("isActivated");

    public final BooleanPath isCertifyByMail = createBoolean("isCertifyByMail");

    public final DateTimePath<java.time.LocalDateTime> lastLoginAt = createDateTime("lastLoginAt", java.time.LocalDateTime.class);

    public final EnumPath<LoginType> loginType = createEnum("loginType", LoginType.class);

    public final ComparablePath<java.util.UUID> memberId = createComparable("memberId", java.util.UUID.class);

    public final StringPath password = createString("password");

    public final StringPath providerUserId = createString("providerUserId");

    public final EnumPath<MemberRole> role = createEnum("role", MemberRole.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public final StringPath username = createString("username");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

