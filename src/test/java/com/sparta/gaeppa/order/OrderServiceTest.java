package com.sparta.gaeppa.order;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.sparta.gaeppa.members.entity.LoginType;
import com.sparta.gaeppa.members.entity.Member;
import com.sparta.gaeppa.members.entity.MemberRole;
import com.sparta.gaeppa.members.repository.MemberRepository;
import com.sparta.gaeppa.order.dto.OrderProductDto;
import com.sparta.gaeppa.order.dto.OrderRequestDto;
import com.sparta.gaeppa.order.dto.OrderResponseDto;
import com.sparta.gaeppa.order.entity.OrderStatus;
import com.sparta.gaeppa.order.entity.OrderType;
import com.sparta.gaeppa.order.entity.Orders;
import com.sparta.gaeppa.order.repository.OrderRepository;
import com.sparta.gaeppa.order.service.OrderService;
import com.sparta.gaeppa.product.entity.Product;
import com.sparta.gaeppa.product.entity.ProductCategory;
import com.sparta.gaeppa.product.repository.ProductRepository;
import com.sparta.gaeppa.store.entity.Store;
import com.sparta.gaeppa.store.entity.StoreCategory;
import com.sparta.gaeppa.store.repository.StoreRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderService orderService;
    @Mock
    private MemberRepository memberRepository;
    @Mock
    private StoreRepository storeRepository;
    @Mock
    private ProductRepository productRepository;
    @Mock
    private OrderRepository orderRepository;

    @Test
    void createOrder_OK() {
        // Mockito 초기화
        MockitoAnnotations.openMocks(this);
        // given - Mock 객체 설정
        UUID memberId = UUID.randomUUID();
        UUID storeId = UUID.randomUUID();
        UUID productId = UUID.randomUUID();

        Member mockMember = Member.builder()
                .email("testuser@example.com")
                .username("testuser")
                .password("securePassword123!")
                .loginType(LoginType.GENERAL)
                .role(MemberRole.MASTER)
                .isCertifyByMail(true)
                .build();

        Store mockStore = Store.builder()
                .member(mockMember)
                .storeName("Test Store")
                .storeAddress("123 Test Street")
                .storeTelephone("010-1234-5678")
                .build();

        ProductCategory productCategory = ProductCategory.builder()
                .name("Beverages")
                .store(mockStore)
                .build();

        Product mockProduct = Product.builder()
                .name("Test Product")
                .description("This is a test product.")
                .price(10000)
                .hideStatus(false)
                .category(productCategory)
                .build();

        Orders mockOrder = Orders.builder()
                .member(mockMember)
                .store(mockStore)
                .orderRequest("Fast delivery")
                .orderType(OrderType.DELIVERY)
                .build();
        mockOrder.putTotalPrice(20000);

        // Mock 설정
        when(memberRepository.findById(any(UUID.class))).thenReturn(Optional.of(mockMember));
        when(storeRepository.findById(storeId)).thenReturn(Optional.of(mockStore));
        when(productRepository.findById(productId)).thenReturn(Optional.of(mockProduct));
        when(orderRepository.save(any(Orders.class))).thenReturn(mockOrder);

        // OrderProductDto 설정
        OrderProductDto orderProductDto = OrderProductDto.builder()
                .productId(productId)
                .productName("Test Product")
                .productQuantity(2)
                .build();

        // OrderRequestDto 설정
        OrderRequestDto requestDto = OrderRequestDto.builder()
                .memberId(memberId)
                .storeId(storeId)
                .orderProductList(List.of(orderProductDto))
                .orderRequest("Fast delivery")
                .orderType("DELIVERY")
                .build();

        // when - OrderService 호출
        OrderResponseDto responseDto = orderService.createOrder(requestDto);

        // then - 결과 검증
        assertThat(responseDto).isNotNull();
        assertThat(responseDto.getOrderId()).isNotNull();
        assertThat(responseDto.getStoreId()).isEqualTo(storeId);
        assertThat(responseDto.getTotalPrice()).isEqualTo(20000);
        assertThat(responseDto.getOrderStatus()).isEqualTo(OrderStatus.COMPLETED.toString());

        // Verify - Mock 메서드 호출 검증
        verify(memberRepository).findById(memberId);
        verify(storeRepository).findById(storeId);
        verify(productRepository).findById(productId);
        verify(orderRepository).save(any(Orders.class));

    }
}
