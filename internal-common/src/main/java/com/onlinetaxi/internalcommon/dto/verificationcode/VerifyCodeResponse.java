package com.onlinetaxi.internalcommon.dto.verificationcode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lvyangai
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class VerifyCodeResponse {
	
	private String code;
}