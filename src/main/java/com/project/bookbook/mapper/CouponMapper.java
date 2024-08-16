package com.project.bookbook.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.project.bookbook.domain.dto.CouponListDTO;
import com.project.bookbook.domain.dto.UserCouponDTO;
import com.project.bookbook.domain.entity.CouponEntity;
import com.project.bookbook.security.CustomUserDetails;

@Mapper
public interface CouponMapper {

	List<CouponListDTO> findAll(long userId);

	List<CouponListDTO> checkCoupon(long couponNum);

	void save(Map<String, Long> params);

	List<UserCouponDTO> checkDuplicateCoupon(long couponNum);

}