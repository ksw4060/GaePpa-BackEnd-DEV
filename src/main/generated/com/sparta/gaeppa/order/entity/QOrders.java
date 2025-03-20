package com.sparta.gaeppa.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrders is a Querydsl query type for Orders
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrders extends EntityPathBase<Orders> {

    private static final long serialVersionUID = -1859731202L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrders orders = new QOrders("orders");

    public final com.sparta.gaeppa.global.base.QBaseEntity _super = new com.sparta.gaeppa.global.base.QBaseEntity(this);

    public final QAddress address;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    //inherited
    public final StringPath deletedBy = _super.deletedBy;

    public final com.sparta.gaeppa.members.entity.QMember member;

    public final ComparablePath<java.util.UUID> orderId = createComparable("orderId", java.util.UUID.class);

    public final ListPath<OrderProduct, QOrderProduct> orderProductList = this.<OrderProduct, QOrderProduct>createList("orderProductList", OrderProduct.class, QOrderProduct.class, PathInits.DIRECT2);

    public final StringPath orderRequest = createString("orderRequest");

    public final EnumPath<OrderStatus> orderStatus = createEnum("orderStatus", OrderStatus.class);

    public final NumberPath<Integer> orderTotalPrice = createNumber("orderTotalPrice", Integer.class);

    public final EnumPath<OrderType> orderType = createEnum("orderType", OrderType.class);

    public final com.sparta.gaeppa.store.entity.QStore store;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QOrders(String variable) {
        this(Orders.class, forVariable(variable), INITS);
    }

    public QOrders(Path<? extends Orders> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrders(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrders(PathMetadata metadata, PathInits inits) {
        this(Orders.class, metadata, inits);
    }

    public QOrders(Class<? extends Orders> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
        this.member = inits.isInitialized("member") ? new com.sparta.gaeppa.members.entity.QMember(forProperty("member")) : null;
        this.store = inits.isInitialized("store") ? new com.sparta.gaeppa.store.entity.QStore(forProperty("store"), inits.get("store")) : null;
    }

}

