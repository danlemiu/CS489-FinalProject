package com.online.store.cs489.dto;

import com.online.store.cs489.domain.Product;
import com.online.store.cs489.domain.Review;
import com.online.store.cs489.domain.User;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductReview {
    private Product product;
    private User user;
    private Review review;

}
