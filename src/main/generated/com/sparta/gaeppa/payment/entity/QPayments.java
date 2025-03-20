package com.sparta.gaeppa.payment.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPayments is a Querydsl query type for Payments
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayments extends EntityPathBase<Payments> {

    private static final long serialVersionUID = 73339454L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPayments payments = new QPayments("payments");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final com.sparta.gaeppa.order.entity.QOrders order;

    public final ComparablePath<java.util.UUID> payId = createComparable("payId", java.util.UUID.class);

    public final EnumPath<PaymentStatus> payStatus = createEnum("payStatus", PaymentStatus.class);

    public final StringPath payTransactionCode = createString("payTransactionCode");

    public final StringPath payType = createString("payType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QPayments(String variable) {
        this(Payments.class, forVariable(variable), INITS);
    }

    public QPayments(Path<? extends Payments> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPayments(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPayments(PathMetadata metadata, PathInits inits) {
        this(Payments.class, metadata, inits);
    }

    public QPayments(Class<? extends Payments> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new com.sparta.gaeppa.order.entity.QOrders(forProperty("order"), inits.get("order")) : null;
    }

}

