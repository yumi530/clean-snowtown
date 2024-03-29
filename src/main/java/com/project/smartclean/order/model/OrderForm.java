package com.project.smartclean.order.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.smartclean.member.entity.Member;
import com.project.smartclean.order.dto.ResultDto;
import com.project.smartclean.order.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderForm {
    private String orderId;
    private String address1;
    private String address2;

    private String disposeDate;
    private LocalDateTime orderDate;
    private String orderUserPhone;
    private Long districtCode;
    private String orderUserName;
    private String districtName;
    private String pickupStatus;

    private Member member;
//    private String userId;
    //    private String itemDetail;
    private List<Item> itemList;
    //    private String itemName;
    private List<ResultDto> resultList;

}
