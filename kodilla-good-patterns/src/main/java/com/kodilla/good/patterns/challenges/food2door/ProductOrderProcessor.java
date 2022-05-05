package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderProcessor
{
    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = orderRepository.order(orderRequest.getProduct(), orderRequest.getQuantity());

        if (isRented) {
            informationService.orderMessage(orderRequest.getProduct(), orderRequest.getQuantity(), isRented);
            return new OrderDto(orderRequest.getProduct(), orderRequest.getQuantity(), true);
        } else {
            informationService.orderMessage(orderRequest.getProduct(), orderRequest.getQuantity(), isRented);
            return new OrderDto(orderRequest.getProduct(), orderRequest.getQuantity(), false);
        }
    }
}
