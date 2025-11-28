package com.knock_knu.KNOCK_KNU_BE.presentation.store.dto;

import com.knock_knu.KNOCK_KNU_BE.domain.store.Store;

public record StoreResponse(
        Long storeId,
        double latitude,
        double longitude,
        String name,
        String address,
        String door,
        String modifier,
        String category
) {
    public static StoreResponse from(Store store) {
        return new StoreResponse(
                store.getId(),
                store.getLatitude(),
                store.getLongitude(),
                store.getName(),
                store.getAddress(),
                store.getDoorType().getDescription(),
                store.getModifierType().getDescription(),
                store.getCategory().getDescription()
        );
    }
}
